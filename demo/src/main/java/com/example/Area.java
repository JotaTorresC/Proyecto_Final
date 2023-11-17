package com.example;
import java.util.*;

public class Area {
    private String nombre;
    private List<Cuidado> cuidados;

    // Constructor
    public Area(String nombre) {
        this.nombre = nombre;
        this.cuidados = new ArrayList<>();
    }

    // Método para agregar un cuidado al área
    public void agregarCuidado(Cuidado cuidado) {
        cuidados.add(cuidado);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Cuidado> getCuidados() {
        return cuidados;
    }
}
