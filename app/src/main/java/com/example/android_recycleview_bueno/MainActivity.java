package com.example.android_recycleview_bueno;

import android.os.Bundle;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycleview_bueno.model.Profesion;
import com.example.android_recycleview_bueno.model.Usuario;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private Switch switchSort;
    private FloatingActionButton addUser;

    private List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        switchSort = findViewById(R.id.switchSort);
        addUser = findViewById(R.id.addUser);

        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Pepito", "Flores", new Profesion("actor",R.mipmap.ic_actor_foreground)));
        usuarios.add(new Usuario("La que", "Te cuento", new Profesion("politico_activo", R.mipmap.ic_politico_activo_foreground)));
        usuarios.add(new Usuario("Pepa", "Antigo", new Profesion("youtuber", R.mipmap.ic_youtuber_foreground)));
        usuarios.add(new Usuario("Pedro", "Sanchez", new Profesion("politico_retirado", R.mipmap.ic_politico_retirado_foreground)));
        usuarios.add(new Usuario("Quien?", "SIHOMBRE", new Profesion("pintor", R.mipmap.ic_pintor_foreground)));
        usuarios.add(new Usuario("Pepito", "Gimenez", new Profesion("policia", R.mipmap.ic_policia_foreground)));
        usuarios.add(new Usuario("Ana", "Frank", new Profesion("estudiante", R.mipmap.ic_estudiante_foreground)));
        usuarios.add(new Usuario("Caixa", "Bank", new Profesion("banquero", R.mipmap.ic_banquero_foreground)));

        AdapatadorRecycleView adaptador = new AdapatadorRecycleView(this, usuarios);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}