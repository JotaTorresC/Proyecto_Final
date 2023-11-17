package com.example;
public class Botanico {
    private String licenciaBotanica;
    private String nombre;
    private String email;
    private int nTelefono;

    public Botanico(){

    }

    public Botanico(String licenciaBotanica,String nombre,String email,int nTelefono){
        this.licenciaBotanica=licenciaBotanica;
        this.nombre=nombre;
        this.email=email;
        this.nTelefono=nTelefono;
    }
    
    public String getLicenBotanico(){
        return licenciaBotanica;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public int getNTelefono(){
        return nTelefono;
    }

    public void setLicenBotanico(String licenciaBotanica){
        this.licenciaBotanica=licenciaBotanica;
    }
    public void setNombre(String nombre){
       this.nombre=nombre;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setNTelefono(int nTelefono){
        this.nTelefono=nTelefono;
    }
}
