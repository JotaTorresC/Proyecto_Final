package com.example;

public class Plantas {
    private String tipoPlantas;
    private String nombrePlanta;

    public Plantas(){

    }

    public Plantas(String tipoPlantas,String nombrePlanta){
        this.tipoPlantas=tipoPlantas;
        this.nombrePlanta=nombrePlanta;
    }

    public String getTipoPlantas(){
        return tipoPlantas;
    }
    public String getNombrePlantas(){
        return nombrePlanta;
    }
    
    

    public void setNombre(String nombrePlanta){
        this.nombrePlanta=nombrePlanta;
    }

    public void setTipoPlanta(String tipoPlantas){
        this.tipoPlantas=tipoPlantas;
    }
}
