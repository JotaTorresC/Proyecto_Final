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

    // para buscar cuidado, planta y botánico por el nombre de la planta
    public String buscarPorNombrePlanta(String nombrePlanta) {
        boolean encontrado = false;

        for (Cuidado cuidado : cuidados) {
            for (Plantas planta : cuidado.getPlantas()) {
                if (planta.getNombrePlantas().equalsIgnoreCase(nombrePlanta)) {
                    encontrado = true;
                    return "planta: "+planta.getNombrePlantas() +"\n" + "Tipo de la Plantas: "
                     + planta.getTipoPlantas() + "\n" +"Cuidado asociado: " + cuidado.getNombreCuidado()
                      +"\n"+ "Ubicación del cuidado: " + cuidado.getUbicacion() +"\n" + "Estado del cuidado: " + cuidado.getEstado();
                    /*for (Botanico botanico : cuidado.getBotanico()) {
                        System.out.println("Nombre: " + botanico.getNombre() + " " + botanico.getLicenBotanico() + ", Email: " + botanico.getEmail());
                    }*/
                    
                }
            }
        }

        if (!encontrado) {
            //System.out.println("No se encontraron registros para la planta con nombre: " + nombrePlanta);
            return "no encontrada";
        }
        return nombrePlanta;
    }

    /*Cambiar el estado según la planta */
    public String cambiarEstado(String nombrePlanta, int seleEstado) {
        boolean encontrado = false;
        for (Cuidado cuidado : cuidados) {
            for (Plantas planta : cuidado.getPlantas()) {
                if (planta.getNombrePlantas().equalsIgnoreCase(nombrePlanta)) {
                    encontrado = true;
                    if(seleEstado == 1){
                        cuidado.estadoPendiente();
                        return "Nombre de la Plantas: " + planta.getNombrePlantas() + "\n" + "Tipo de la Plantas: " + planta.getTipoPlantas()
                        + "\n" + "Cuidado: " + cuidado.getNombreCuidado() +" Programado para: "+ cuidado.getHoraCuidado() + " está en estado: "+cuidado.getEstado();
                    }
                    else if(seleEstado ==2){
                        cuidado.estadoEnProceso();
                        return "Nombre de la Plantas: " + planta.getNombrePlantas() + "\n" + "Tipo de la Plantas: " + planta.getTipoPlantas()
                    + "\n" + "Cuidado: " + cuidado.getNombreCuidado() +" Programado para: "+ cuidado.getHoraCuidado() + " está en estado: "+cuidado.getEstado();
                    }
                    else if(seleEstado ==3){
                        cuidado.estadoFinalizado();
                        return "Nombre de la Plantas: " + planta.getNombrePlantas() + "\n" + "Tipo de la Plantas: " + planta.getTipoPlantas()
                    + "\n" + "Cuidado: " + cuidado.getNombreCuidado() +" Programado para: "+ cuidado.getHoraCuidado() + " está en estado: "+cuidado.getEstado();
                    }
                    else if(seleEstado ==4){
                        cuidado.estadoAplazado();
                        return "Nombre de la Plantas: " + planta.getNombrePlantas() + "\n" + "Tipo de la Plantas: " + planta.getTipoPlantas()
                    + "\n" + "Cuidado: " + cuidado.getNombreCuidado() +" Programado para: "+ cuidado.getHoraCuidado() + " está en estado: "+cuidado.getEstado();
                    }
                    
                    break;
                }
            }
        }

        if (!encontrado) {
            return "No se encontraron registros para la planta con nombre: ";
        }
        return nombrePlanta;
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
    
}
