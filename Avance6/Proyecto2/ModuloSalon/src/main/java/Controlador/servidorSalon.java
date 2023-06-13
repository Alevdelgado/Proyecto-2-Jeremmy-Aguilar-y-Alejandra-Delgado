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
            System.out.println("Llegó una orden de hamburguesas desde el módulo de simulación:");
            System.out.println("Hamburguesas: " + listaHamburguesas);
            System.out.println("Hamburguesas especiales con: " + listaIngredientes);
            new VistaPedido(numMesa,listaHamburguesas, precioTotal).setVisible(true);
        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
 }
    
    public void enviarOrdenCocina(List<String> listaHamburguesas, List<List> listaIngredientes, int numMesa, int precioTotal) {
    try (Socket socketHamburguesas = new Socket("localhost", 8888);
         ObjectOutputStream objOutputStream = new ObjectOutputStream(socketHamburguesas.getOutputStream())) {

        // Enviar la lista de hamburguesas
        objOutputStream.writeObject(listaHamburguesas);
        objOutputStream.flush();
        
        // Enviar la lista de ingredientes
        objOutputStream.writeObject(listaIngredientes);
        objOutputStream.flush();
        
        objOutputStream.writeInt(numMesa);
        objOutputStream.flush();
        
        objOutputStream.writeInt(precioTotal);
        objOutputStream.flush();
        
        System.out.println("Lista de hamburguesas enviada al servidor de la cocina");
        System.out.println("Hamburguesas: " + listaHamburguesas);
        System.out.println("Ingredientes: " + listaIngredientes);
        System.out.println("Mesa: " + numMesa);
        System.out.println("Precio Total: " + precioTotal);

    } catch (IOException e) {
        e.printStackTrace();
    }  
     
}

    
    


}
