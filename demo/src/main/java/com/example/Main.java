package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CentroBotanico centro = new CentroBotanico();

        // Crear y agregar plantas al inventario
        Plantas planta1 = new Plantas("Rosa", "Flor");
        Plantas planta2 = new Plantas("Pino", "Arbol");
        centro.agregarPlanta(planta1);
        centro.agregarPlanta(planta2);

        // Crear y agregar botánicos
        Botanico botanico1 = new Botanico("1", "Juan",  "juan@example.com", 12345678);
        Botanico botanico2 = new Botanico("2", "María", "maria@example.com", 987654321);
        centro.agregarBotanico(botanico1);
        centro.agregarBotanico(botanico2);

        // Crear y agregar cuidados con plantas y botánicos asociados
        List<Plantas> plantasCuidado1 = new ArrayList<>();
        plantasCuidado1.add(planta1);
        plantasCuidado1.add(planta2);
        List<Botanico> botanicosCuidado1 = new ArrayList<>();
        botanicosCuidado1.add(botanico1);        
        botanicosCuidado1.add(botanico2);

        Cuidado cuidado1 = new Cuidado("Podar", "Jardín", "2023-11-20", "PENDIENTE", "Pendiente", plantasCuidado1, botanicosCuidado1, "Exterior");
        Cuidado cuidado2 = new Cuidado("Regar", "Jardín", "2023-11-23", "PENDIENTE", "Pendiente", plantasCuidado1, botanicosCuidado1, "Exterior");

        centro.agregarCuidado(cuidado1);
        centro.agregarCuidado(cuidado2);

        // Buscar información sobre una planta específica
        centro.buscarPorNombrePlanta("Arbol");
        centro.cambiarEstado("Arbol",2);

        // Obtener listas del centro botánico
        /*List<Plantas> plantas = centro.getInventarioPlantas();
        List<Botanico> listaBotanicos = centro.getBotanico();
        List<Cuidado> cuidados = centro.getListaCuidados();*/

        //System.out.println(centro.getInventarioPlantas());
        /*for( Plantas p:plantas){
            System.out.println(p.getNombrePlantas());

        }*/
        // Realizar otras operaciones o mostrar información según sea necesario...
    }

}
