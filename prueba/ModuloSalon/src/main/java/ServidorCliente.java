//import javax.swing.*;
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class ServidorCliente {
//    public static void main(String[] args) {
//        try {
//            // Establecer el puerto del servidor
//            int serverPort = 1234; // Puerto del servidor
//
//            // Crear el socket del servidor y escuchar en el puerto específico
//            ServerSocket serverSocket = new ServerSocket(serverPort);
//            System.out.println("Servidor escuchando en el puerto " + serverPort);
//
//            // Esperar a que SimulacionServidor se conecte y envíe una señal
//            Socket socket = serverSocket.accept();
//            System.out.println("Cliente conectado desde " + socket.getInetAddress().getHostAddress());
//
//            // Leer la señal enviada por SimulacionServidor
//            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            String mensaje = in.readLine();
//            
//            // Verificar si la señal indica abrir la ventana de SalonCliente
//            if (mensaje.equals("AbrirVentanaSalonCliente")) {
//                // Crear y mostrar la ventana de SalonCliente
//                SwingUtilities.invokeLater(() -> {
//                    JFrame frame = new JFrame("SalonCliente");
//                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    frame.setSize(300, 200);
//                    frame.setLocationRelativeTo(null);
//                    
//                    JLabel label = new JLabel("Ventana de SalonCliente");
//                    label.setHorizontalAlignment(JLabel.CENTER);
//                    frame.add(label, BorderLayout.CENTER);
//                    
//                    frame.setVisible(true);
//                });
//            }
//
//            // Cerrar los recursos
//            in.close();
//            socket.close();
//            serverSocket.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
