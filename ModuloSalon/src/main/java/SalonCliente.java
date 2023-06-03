//package Controlador;
//
//import Vista.VistaPedido;
//
//import java.io.*;
//import java.net.*;
//
//public class SalonCliente { // este es el cliente
//  public static void main(String[] args) {
//        Thread clientThread = new Thread(() -> {
//            try {
//                // Establecer la dirección IP y el puerto del servidor
//                String serverIP = "127.0.0.1"; // Dirección IP del servidor
//                int serverPort = 1234; // Puerto del servidor
//
//                // Establecer la conexión con el servidor
//                Socket socket = new Socket(serverIP, serverPort);
//
//                // Enviar información al servidor
//                OutputStream outputStream = socket.getOutputStream();
//                PrintWriter out = new PrintWriter(outputStream, true);
//                out.println("Información desde el módulo de simulación");
//                new VistaPedido().setVisible(true);
//
//                // Cerrar la conexión
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//
//        clientThread.start();
//    }
//}


// SalonCliente.java
import Vista.VistaPedido;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SalonCliente {
    public static void main(String[] args) {
        try {
            // Establecer la dirección IP y el puerto del servidor
            String serverIP = "127.0.0.1"; // Dirección IP del servidor
            int serverPort = 1234; // Puerto del servidor

            // Establecer la conexión con el servidor
            Socket socket = new Socket(serverIP, serverPort);

            // Enviar información al servidor
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter out = new PrintWriter(outputStream, true);
            out.println("Información desde el módulo de simulación");
            //new VistaPedido().setVisible(true);

            // Cerrar la conexión
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
