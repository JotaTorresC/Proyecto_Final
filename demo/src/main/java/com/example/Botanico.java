package com.example;
import java.util.ArrayList;
import java.util.List;

public class Botanico {
    private int licenciaBotanica;
    private String nombre;
    private String email;
    private int nTelefono;
    private List<Cuidado> cuidados;

    public Botanico(){

    }

    public Botanico(int licenciaBotanica,String nombre,String email,int nTelefono){
        this.licenciaBotanica=licenciaBotanica;
        this.nombre=nombre;
        this.email=email;
        this.nTelefono=nTelefono;
        cuidados =new ArrayList<>();
    }
    
    public int getLicenBotanico(){
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

    public void setLicenBotanico(int licenciaBotanica){
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

    public void agregarCuidadoParticipado(Cuidado cuidado) {
        cuidados.add(cuidado);
    }
    public List<Cuidado> getCuidadosPorNumeroLicencia(int numeroLicencia) {
        List<Cuidado> cuiEnParticipa = new ArrayList<>();
        for (Cuidado cuidado : cuidados) {
            List<Botanico> botaCuidados = cuidado.getBotanico();
            for (Botanico botanico : botaCuidados) {
                if (botanico.getLicenBotanico() == numeroLicencia) {
                    cuiEnParticipa.add(cuidado);
                    break;
                }
            }
        }
        return cuiEnParticipa;
    }
}
