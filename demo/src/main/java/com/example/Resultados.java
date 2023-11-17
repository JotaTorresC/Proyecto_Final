package com.example;

public class Resultados {
    private String saludPlanta;
    private String crecimientoPlanta;

    public Resultados(){

    }
    public Resultados(String saludPlanta,String crecimientoPlanta ){
        this.saludPlanta=saludPlanta;
        this.crecimientoPlanta=crecimientoPlanta;
    }

    public String getCrecimientoPlanta(){
        return crecimientoPlanta;
    }
    public String getSaludPlanta(){
        return saludPlanta;
    }

    public void setCrecimientoPlanta(String crecimientoPlanta){
        this.crecimientoPlanta=crecimientoPlanta;
    }
    public void setSaludPlanta(String saludPlanta){
        this.saludPlanta=saludPlanta;
    }
}
