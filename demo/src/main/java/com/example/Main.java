package com.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        Botanico botanico1 = new Botanico(1, "Juan",  "juan@example.com", 12345678);
        Botanico botanico2 = new Botanico(2, "María", "maria@example.com", 987654321);
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
        botanico1.agregarCuidadoParticipado(cuidado1);
        botanico2.agregarCuidadoParticipado(cuidado2);
        /*INICIA EL DESARROLLO DE LA MODAL */
        JFrame frame = new JFrame("Centro Botanico");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear menú
        JMenu menu = new JMenu("Menu Vivero");

        // Crear elementos del menú
        JMenuItem buscarPlanta = new JMenuItem("Buscar Planta por nombre");
        JMenuItem cambiarEstado = new JMenuItem("Cambiar Estado de la Plantas");        
        JMenuItem busBotanico = new JMenuItem("Buscar cuidado de un Botanico");

        // Agregar elementos al menú
        menu.add(buscarPlanta);
        menu.add(cambiarEstado);
        menu.add(busBotanico);

        // Agregar menú a la barra de menú
        menuBar.add(menu);

        // Agregar barra de menú al marco
        frame.setJMenuBar(menuBar);

        buscarPlanta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String planta = JOptionPane.showInputDialog(frame, "Por favor, introduce el nombre de la planta que deseas buscar:");
                if (planta != null) {
                    String plantaBuscada = centro.buscarPorNombrePlanta(planta);
                           
                    JOptionPane.showMessageDialog(frame, "Ingresaste: " + planta + "\n Resultado: "+ plantaBuscada);
                }
            }
        });

        cambiarEstado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String plantaEstado = JOptionPane.showInputDialog(frame, "Por favor, el nombre de la planta a la que deseas cambiar el estado:");
                String eleccionEstado = JOptionPane.showInputDialog(frame, "Por favor, eliga el estado teniendo en cuenta que : 1-PENDIENTE, 2-EN PROCESO, 3-FINALIZADO, 4-APLAZADO:");
                if (plantaEstado != null ) {
                    String estadiPlanta = centro.cambiarEstado(plantaEstado,Integer.parseInt(eleccionEstado));
                    JOptionPane.showMessageDialog(frame, "Resultado: "+ estadiPlanta);
                }
            }
        });

        busBotanico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String licenciaBotanica = JOptionPane.showInputDialog(frame, "Por favor, el número de licencia del botanico:");
                if (licenciaBotanica != null ) {
                    List<Cuidado> cuidadosDelBotanico = botanico1.getCuidadosPorNumeroLicencia(Integer.parseInt(licenciaBotanica));
                    for (Cuidado cuidado : cuidadosDelBotanico) {
                        String resultado = "Nombre del cuidado: " + cuidado.getNombreCuidado() +"\n" + "Ubicación : " + cuidado.getUbicacion() + "\n" +
                        "Hora Cuidado : " + cuidado.getHoraCuidado() + "\n" +"Estado del cuidado : " + cuidado.getEstado() +"\n" + "Area : " + cuidado.getArea();
                        JOptionPane.showMessageDialog(frame, resultado);
                    }
                }
            }
        });


        frame.setVisible(true);
    }
}
