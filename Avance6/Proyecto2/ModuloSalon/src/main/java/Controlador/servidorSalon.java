package Controlador;

import Vista.VistaPedido;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class servidorSalon extends Thread{
    
    public static int numMesa;
    public static int precioTotal;
    public static List<String> listaHamburguesas;
    public static List<List> listaIngredientes;
    public static VistaPedido vistaPedido;
    public servidorSalon() {

        //VistaPedido vistaPedido = new VistaPedido (numMesa, listaHamburguesas, precioTotal);
        //vistaPedido.setVisible(true);
        
    }
 
//public void run() {
//    System.out.println("Servidor del salón en espera...");
//
//    try {
//        // Crear y configurar el ServerSocket para recibir la lista de hamburguesas
//        ServerSocket serverHamburguesas = new ServerSocket(9999);
//        try (Socket envioHamburguesa = serverHamburguesas.accept()) {
//            ObjectInputStream objInputStream = new ObjectInputStream(envioHamburguesa.getInputStream());
//            List<String> listaHamburguesas = (List<String>) objInputStream.readObject();
//            
//            System.out.println("Llegó una orden de hamburguesas desde el módulo de simulación:");
//            System.out.println("Hamburguesas: " + listaHamburguesas);
//        }

        // Crear y configurar los ServerSocket para recibir las coordenadas
        /*ServerSocket serverConfPosX = new ServerSocket(7201);
        ServerSocket serverConfPosY = new ServerSocket(6201);

        while (true) {
            Socket miSocket01 = serverConfPosX.accept();
            DataInputStream cordEntradaX = new DataInputStream(miSocket01.getInputStream());
            int tempX = cordEntradaX.read();

            Socket miSocket02 = serverConfPosY.accept();
            DataInputStream cordEntradaY = new DataInputStream(miSocket02.getInputStream());
            int tempY = cordEntradaY.read();

            System.out.println("Llegó un mensaje...");
            System.out.println("Coordenada X: " + tempX);
            System.out.println("Coordenada Y: " + tempY);
        }*/
//    } catch (IOException | ClassNotFoundException e) {
//        e.printStackTrace();
//    }
//}

    
    
    @Override
 public void run() {
    System.out.println("Servidor del salón en espera...");

    try {
        ServerSocket serverHamburguesas = new ServerSocket(9999);

        while (true) {
            System.out.println("Esperando nueva orden de hamburguesas...");
            Socket envioHamburguesa = serverHamburguesas.accept();
            ObjectInputStream objInputStream = new ObjectInputStream(envioHamburguesa.getInputStream());
            
            List<String> listaHamburguesas = (List<String>) objInputStream.readObject();
            List<List> listaIngredientes = (List<List>) objInputStream.readObject();
            
            // Porblemas al guardar un entero
            numMesa = objInputStream.readInt();
            precioTotal = objInputStream.readInt();
            //i/nt precioTotal = objInputStream.readInt();
            System.out.println("Llegó una orden de hamburguesas desde el módulo de simulación:");
            System.out.println("Hamburguesas: " + listaHamburguesas);
            System.out.println("Hamburguesas especiales con: " + listaIngredientes);
            new VistaPedido(numMesa,listaHamburguesas, precioTotal).setVisible(true);
            

            //System.out.println("Mesa" + numMesa);
            //System.out.println("Precio total: " + precioTotal);
            //new VistaPedido(listaHamburguesas).setVisible(true);
            
            //vistaPedido.agregarDatos();



        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}

    
    


    
 /*   public void enviarConfir(int tempX, int tempY, String mensajePedido) throws IOException {
        try (Socket sock01 = new Socket("172.18.3.184", 7101);
            DataOutputStream cordXSalida = new DataOutputStream(sock01.getOutputStream())){
            cordXSalida.write(tempX);
        } catch (Exception e) {
            System.out.println("!! no se pudo conectar con el socket de la informacion del pedido.");
        }
        
        try (Socket sock02 = new Socket("172.18.3.184", 6101);
            DataOutputStream cordYSalida = new DataOutputStream(sock02.getOutputStream())){
            cordYSalida.write(tempY);
        } catch (Exception e) {
            System.out.println("!! no se pudo conectar con el socket de la informacion del pedido.");
        }
        
        try (Socket sock03 = new Socket("172.18.3.184", 8101);
            DataOutputStream mensajeSalida = new DataOutputStream(sock03.getOutputStream())){
            mensajeSalida.writeUTF(mensajePedido);
        } catch (Exception e) {
            System.out.println("!! no se pudo conectar con el socket de la informacion del pedido.");
        }
    }*/
    
    /*   public static void main(String[] args) {
        servidorSalon salon = new servidorSalon();
        salon.start();
    } */
}
