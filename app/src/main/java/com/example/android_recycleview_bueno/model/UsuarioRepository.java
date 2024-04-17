package com.example.android_recycleview_bueno.model;

import com.example.android_recycleview_bueno.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios;
    private static UsuarioRepository instance;

    private UsuarioRepository(){
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Pepito", "Flores", new Profesion("actor", R.mipmap.ic_actor_foreground)));
        usuarios.add(new Usuario("La que", "Te cuento", new Profesion("politico_activo", R.mipmap.ic_politico_activo_foreground)));
        usuarios.add(new Usuario("Pepa", "Antigo", new Profesion("youtuber", R.mipmap.ic_youtuber_foreground)));
        usuarios.add(new Usuario("Pedro", "Sanchez", new Profesion("politico_retirado", R.mipmap.ic_politico_retirado_foreground)));
        usuarios.add(new Usuario("Quien?", "SIHOMBRE", new Profesion("pintor", R.mipmap.ic_pintor_foreground)));
        usuarios.add(new Usuario("Pepito", "Gimenez", new Profesion("policia", R.mipmap.ic_policia_foreground)));
        usuarios.add(new Usuario("Ana", "Frank", new Profesion("estudiante", R.mipmap.ic_estudiante_foreground)));
        usuarios.add(new Usuario("Caixa", "Bank", new Profesion("banquero", R.mipmap.ic_banquero_foreground)));
    }

    public static UsuarioRepository getInstance() {
        if (instance == null){
            instance = new UsuarioRepository();
        }
        return instance;
    }

    public Usuario get(int index){
        return usuarios.get(index);
    }

    public int size(){
        return usuarios.size();
    }

    public List<Usuario> getAll(){
        return usuarios;
    }

    public void remove(Usuario usuario){
        usuarios.remove(usuario);
    }

    public void add(Usuario usuario){
        usuarios.add(usuario);
    }

    public void add(int index, Usuario usuario){
        usuarios.add(index, usuario);
    }

    public void sort(Comparator comparator){
        Collections.sort(usuarios, comparator);
    }
}
