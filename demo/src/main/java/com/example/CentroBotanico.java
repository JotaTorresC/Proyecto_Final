package com.example;

import java.util.List;
import java.util.ArrayList;

public class CentroBotanico {
    private List<Plantas> plantas;
    private List<Botanico> botanicos;
    private List<Cuidado> cuidados;

    public CentroBotanico() {
        plantas = new ArrayList<>();
        botanicos = new ArrayList<>();
        cuidados = new ArrayList<>();
    }

    // Métodos para agregar elementos al centro botánico

    public void agregarPlanta(Plantas planta) {
        plantas.add(planta);
    }

    public void agregarBotanico(Botanico botanico) {
        botanicos.add(botanico);
    }

    public void agregarCuidado(Cuidado cuidado) {
        cuidados.add(cuidado);
    }

    // Método para buscar cuidado, planta y botánico por el nombre de la planta
    public void buscarPorNombrePlanta(String nombrePlanta) {
        boolean encontrado = false;

        for (Cuidado cuidado : cuidados) {
            for (Plantas planta : cuidado.getPlantas()) {
                if (planta.getNombrePlantas().equalsIgnoreCase(nombrePlanta)) {
                    encontrado = true;
                    System.out.println("Nombre de la Plantas: " + planta.getNombrePlantas());
                    System.out.println("Tipo de la Plantas: " + planta.getTipoPlantas());
                    System.out.println("Cuidado asociado: " + cuidado.getNombreCuidado());
                    System.out.println("Ubicación del cuidado: " + cuidado.getUbicacion());
                    System.out.println("Estado del cuidado: " + cuidado.getEstado());
                    System.out.println("Botánicos involucrados:");
                    for (Botanico botanico : cuidado.getBotanico()) {
                        System.out.println("Nombre: " + botanico.getNombre() + " " + botanico.getLicenBotanico() + ", Email: " + botanico.getEmail());
                    }
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron registros para la planta con nombre: " + nombrePlanta);
        }
    }

    /*Cambiar el estado según la planta */
    public void cambiarEstado(String nombrePlanta, int seleEstado) {
        boolean encontrado = false;
        for (Cuidado cuidado : cuidados) {
            for (Plantas planta : cuidado.getPlantas()) {
                if (planta.getNombrePlantas().equalsIgnoreCase(nombrePlanta)) {
                    encontrado = true;
                    System.out.println("Nombre de la Plantas: " + planta.getNombrePlantas());
                    System.out.println("Tipo de la Plantas: " + planta.getTipoPlantas());
                    System.out.println("Cuidado: " + cuidado.getNombreCuidado() +" Programado para: "+ cuidado.getHoraCuidado() + " está en estado: "+cuidado.getEstado());
                    System.out.println("Cambiar estado: 1-PENDIENTE, 2-EN PROCESO, 3-FINALIZADO, 4-APLAZADO");
                    if(seleEstado == 1){
                        cuidado.estadoPendiente();
                    }
                    else if(seleEstado ==2){
                        cuidado.estadoEnProceso();
                    }
                    else if(seleEstado ==3){
                        cuidado.estadoFinalizado();
                    }
                    else if(seleEstado ==4){
                        cuidado.estadoAplazado();
                    }
                    System.out.println("Nombre de la Plantas: " + planta.getNombrePlantas());
                    System.out.println("Tipo de la Plantas: " + planta.getTipoPlantas());
                    System.out.println("Cuidado: " + cuidado.getNombreCuidado() +" Programado para: "+ cuidado.getHoraCuidado() + " está en estado: "+cuidado.getEstado());
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron registros para la planta con nombre: " + nombrePlanta);
        }
    }


    // Método para obtener el inventario de plantas
    public List<Plantas> getInventarioPlantas() {
        return plantas;
    }

    // Método para obtener la lista de botánicos
    public List<Botanico> getBotanico() {
        return botanicos;
    }

    // Método para obtener la lista de cuidados
    public List<Cuidado> getListaCuidados() {
        return cuidados;
    }

    // Otros métodos según necesidades de la aplicación...
    
    
}
