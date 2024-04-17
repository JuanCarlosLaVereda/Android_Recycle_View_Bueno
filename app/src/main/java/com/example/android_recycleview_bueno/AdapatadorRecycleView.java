package com.example.android_recycleview_bueno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycleview_bueno.model.Usuario;
import com.example.android_recycleview_bueno.model.UsuarioRepository;

import java.util.List;

public class AdapatadorRecycleView extends RecyclerView.Adapter<AdapatadorRecycleView.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<Usuario> usuarios;

    public AdapatadorRecycleView(Context context){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.usuarios = UsuarioRepository.getInstance().getAll();
    }

    @NonNull
    @Override
    public AdapatadorRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.simple_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapatadorRecycleView.ViewHolder holder, int position) {
        holder.profesion.setText(usuarios.get(position).getProfesion().getNombre());
        holder.nombre.setText(usuarios.get(position).getApellidos() + " " +usuarios.get(position).getNombre() );
        holder.imagen.setImageResource(usuarios.get(position).getProfesion().getImage());
    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagen;
        private TextView nombre, profesion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imageView);
            nombre = itemView.findViewById(R.id.textViewNombre);
            profesion = itemView.findViewById(R.id.textViewOficio);
        }
    }
}
