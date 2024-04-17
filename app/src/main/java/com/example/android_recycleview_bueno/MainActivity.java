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
import com.example.android_recycleview_bueno.model.UsuarioRepository;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private Switch switchSort;
    private FloatingActionButton addUser;

    private  UsuarioRepository usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        switchSort = findViewById(R.id.switchSort);
        addUser = findViewById(R.id.addUser);

        usuarios = UsuarioRepository.getInstance();
        usuarios.sort(Usuario.SORT_BY_NAME);

        AdapatadorRecycleView adaptador = new AdapatadorRecycleView(this);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}