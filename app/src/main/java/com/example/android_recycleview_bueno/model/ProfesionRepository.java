package com.example.android_recycleview_bueno.model;

import java.util.List;

public class ProfesionRepository {
    private List<Profesion> profesiones;
    private  static ProfesionRepository instace;

    private ProfesionRepository(){

    }

    public static ProfesionRepository getInstance(){
        if (instace==null){
            instace = new ProfesionRepository();
        }
        return instace;
    }
}
