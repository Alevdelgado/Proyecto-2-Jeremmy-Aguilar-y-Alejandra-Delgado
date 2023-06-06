// SimulacionServidor.java
import Vista.VistaSimulacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimulacionServidor {
    public static void main(String[] args) {
        try {
            // Paso 1: Crear el socket del servidor y escuchar en un puerto específico
            int puerto = 1234;
            ServerSocket serverSocket = new ServerSocket(puerto);
            System.out.println("Servidor escuchando en el puerto " + puerto);
           
            //Aqui abre la ventana vista simulacion ------------------------------------------
            
            VistaSimulacion vistaSimulacion = new VistaSimulacion();
            vistaSimulacion.setVisible(true);

            
            // A partir de lo de abajo se ejecuta cuando ejecuto el salonCliente que se encuentra en modulo cliente ----------------------------
            // pero yo quisiera que se ejecutara es al presionar el boton "ordenar" de la ventana vistaSimulacion porque en ella
            // se va a mostrar las mesas y las hamburguesas por lo que esa ventana llamada ordenSim debe tener comunicacion
            // con el salonCliente pero no lo he podido lograr
            
            
            // Paso 2: Esperar a que el cliente se conecte
            Socket socket = serverSocket.accept();
            System.out.println("Cliente conectado desde " + socket.getInetAddress().getHostAddress());

            // Paso 3: Establecer la comunicación con el cliente a través del socket
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Esperar mensaje del cliente
            String mensaje = in.readLine();
            System.out.println("Mensaje recibido: " + mensaje);

            // Enviar mensaje al cliente
            out.println("Mensaje desde el servidor");

            // Cerrar los recursos
            in.close();
            out.close();
            socket.close();
            serverSocket.close();

            // Verificar el mensaje recibido y abrir la ventana del cliente
            if (mensaje.equals("AbrirVentanaSalon")) {
                abrirVentanaSalon();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void abrirVentanaSalon() {
        Thread clienteThread = new Thread(() -> {
            try {
                // Establecer la dirección IP y el puerto del servidor
                String serverIP = "127.0.0.1"; // Dirección IP del servidor
                int serverPort = 1234; // Puerto del servidor

                // Establecer la conexión con el servidor
                Socket socket = new Socket(serverIP, serverPort);

                // Enviar mensaje al servidor para abrir la ventana de SalonCliente
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("AbrirVentanaSalon");

                // Cerrar la conexión
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        clienteThread.start();
    }
}
