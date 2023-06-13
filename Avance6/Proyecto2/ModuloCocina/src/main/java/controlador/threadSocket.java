package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import vista.ventCocina;
import static vista.ventCocina.columnas;


public class threadSocket extends Thread {
    ventCocina tempVentanaCocina;
    public static int numMesa;
    public static int tempX;
    public static int tempY;
    public static int precioTotal;
    public static String mensaje;
    public static List<String> listaHamburguesas;
    public static List<List> listaIngredientes;   
    public static ventCocina cocina;
    public threadSocket(ventCocina tempVent) {
        tempVentanaCocina = tempVent;
        
    }
    

public void run() {
    System.out.println("Servidor cocina en espera...");
    try (ServerSocket serverHamburguesas = new ServerSocket(8888)) {
        serverHamburguesas.setSoTimeout(500000000); // Configurar tiempo de espera en el socket serverHamburguesas

        while (true) {
            try {
                System.out.println("Esperando nueva orden de hamburguesas...");
                Socket envioHamburguesa = serverHamburguesas.accept();
                ObjectInputStream objInputStream = new ObjectInputStream(envioHamburguesa.getInputStream());

                List<String> listaHamburguesas = (List<String>) objInputStream.readObject();
                List<List> listaIngredientes  =  (List<List>) objInputStream.readObject();


                int numMesa = objInputStream.readInt();
                int precioTotal = objInputStream.readInt();

                System.out.println("Llegó una orden de hamburguesas desde el módulo de simulación:");
                System.out.println("Hamburguesas: " + listaHamburguesas);
                System.out.println("Hamburguesas especiales con: " + listaIngredientes);
                System.out.println("Mesa: " + numMesa);

                tempX = (numMesa - 1) / columnas; // Calcular el índice X en la matriz de botones
                tempY = (numMesa - 1) % columnas; // Calcular el índice Y en la matriz de botones

                String mensaje = "Llegó una orden de hamburguesas desde el módulo de simulación:\n"
                        + "Hamburguesas: " + listaHamburguesas + "\n"
                        + "Hamburguesas especiales con: " + listaIngredientes + "\n"
                        + "Mesa: " + numMesa + "\n"
                        + "Precio total: "+ precioTotal;
               

                ventCocina cocina = new ventCocina();
                cocina.setVisible(true);
                cocina.cambiarBoton(mensaje, tempX, tempY);
                //cocina.setVisible(false);

            } catch (SocketTimeoutException e) {
                // Se alcanzó el tiempo de espera sin recibir la orden de hamburguesas
                // Realizar alguna acción o continuar con el ciclo
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

}


    
    
    
    
    
    /*public void enviarConfir(int tempX,int tempY) throws IOException {
        try (Socket sock01 = new Socket("localhost", 7201);
             Socket sock02 = new Socket("localhost", 6201)){
                
            DataOutputStream cordConX = new DataOutputStream(sock01.getOutputStream());
            cordConX.write(tempX);
            
            DataOutputStream cordConY = new DataOutputStream(sock02.getOutputStream());
            cordConY.write(tempY);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } */
//}