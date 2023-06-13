package Controlador;


import static Vista.OrdenSimulacion.hamburguesas;
import Vista.VistaSimulacion;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;


public class threadSocketSimulacion extends Thread {  
    public threadSocketSimulacion() {
    }
    
    
public void enviarOrden(List<Integer> listaHamburguesas, List<List> listaIngredientes, int numMesa, int precioTotal) {
    try (Socket socketHamburguesas = new Socket("172.18.3.184", 9109);
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
        
        System.out.println("Lista de hamburguesas enviada al servidor del salón");
        System.out.println("Hamburguesas: " + listaHamburguesas);
        System.out.println("Ingredientes: " + listaIngredientes);
        System.out.println("Mesa: " + numMesa);
        System.out.println("Precio Total: " + precioTotal);


        
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    
    /*
    public void enviarListaIngredientes(List<String> listaIngredientes) {
        try (Socket socketIngredientes = new Socket("localhost", 9898);
             ObjectOutputStream objOutputStream = new ObjectOutputStream(socketIngredientes.getOutputStream())) {

            objOutputStream.writeObject(listaIngredientes);
            objOutputStream.flush();


            System.out.println("Lista de ingredientes enviada al servidor del salón");
            System.out.println(listaIngredientes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    
    

}
