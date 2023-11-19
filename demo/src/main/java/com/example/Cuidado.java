package com.example;
import java.util.ArrayList;
import java.util.List;

public class Cuidado {
    private String nombreCuidado;
    private String ubicacion;
    private String horaCuidado;
    private String estado;
    private String area;
    private List<Plantas> plantas = new ArrayList<>();
    private List<Botanico> botanico =  new ArrayList<>() ;
    private String resultados;

    public Cuidado(){

    }

    public Cuidado(String nombreCuidado,String ubicacion,String horaCuidado,String estado,String area,
    List<Plantas> plantas,List<Botanico> botanico,String resultados){
       this.nombreCuidado=nombreCuidado;
       this.ubicacion=ubicacion;
       this.horaCuidado=horaCuidado;
       this.estado="PENDIENTE";
       this.area = area;
       this.plantas=plantas;
       this.botanico=botanico;
       this.resultados=resultados;
    }

    public String getNombreCuidado(){
        return nombreCuidado;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public String getHoraCuidado(){
        return horaCuidado;
    }

    public String getEstado(){
        return estado;
    }

    public String getArea(){
        return area;
    }
    public List<Plantas> getPlantas(){
        return plantas;
    }

    public List<Botanico> getBotanico(){
        return botanico;
    }

    public String getResultados(){
        return resultados;
    }

    public void setNombreCuidado(String nombreCuidado){
        this.nombreCuidado=nombreCuidado;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
    public void setHoraCuidado(String horaCuidado){
        this.horaCuidado=horaCuidado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setArea(String area){
        this.area=area;
    }
    public void setPlantas(List<Plantas> plantas) {
        this.plantas=plantas;
    }
    public void setBotanico(List<Botanico> botanico) {
        this.botanico=botanico;
    }
    /*METODOS ENCARGADOS DE CAMBIAR EL ESTADO*/
    public void estadoPendiente(){
        this.estado="PENDIENTE";
    }
    public void estadoEnProceso(){
        this.estado="EN PROCESO";
    }
    public void estadoFinalizado(){
        this.estado="FINALIZADO";
    }
    public void estadoAplazado(){
        this.estado="APLAZADO";
    }
 
    /*METODOS DE LAS PLANTAS */
    public void registrarPlanta(Plantas plantasA) {
        plantas.add(plantasA);
    }
    
}