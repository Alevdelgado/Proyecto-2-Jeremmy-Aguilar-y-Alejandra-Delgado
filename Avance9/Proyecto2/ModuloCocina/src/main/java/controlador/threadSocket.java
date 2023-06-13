package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import vista.ventCocina;
import static vista.ventCocina.columnas;


public class threadSocket extends Thread {
    ventCocina tempVentanaCocina;
    public static int numMesa;
    public static int tempX;
    public static int tempY;
    public threadSocket(ventCocina tempVent) {
        tempVentanaCocina = tempVent;
    }
    
    public void run() {
        System.out.println("Servidor cocina en espera...");
        try (ServerSocket serverCocina = new ServerSocket(8101);
             ServerSocket serverCordX = new ServerSocket(7101);
             ServerSocket serverCordY = new ServerSocket(6101)) {

            while (true){
                Socket sockCordX = serverCordX.accept();
                DataInputStream infoEntrada = new DataInputStream(sockCordX.getInputStream());
                tempX = infoEntrada.read();
                                
                Socket sockCordY = serverCordY.accept();
                infoEntrada = new DataInputStream(sockCordY.getInputStream());
                tempY = infoEntrada.read();
                        
                
                Socket miSocket = serverCocina.accept();
                infoEntrada = new DataInputStream(miSocket.getInputStream());
                String mensajeTexto = infoEntrada.readUTF();

                System.out.println("llego mensaje...");
                System.out.println("Cord X "+tempX);
                System.out.println("Cord Y "+tempY);
                System.out.println(mensajeTexto);
                numMesa = tempX * columnas + tempY + 1;
                tempVentanaCocina.cambiarBoton(mensajeTexto, tempX,tempY);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void enviarConfir(int tempX,int tempY) throws IOException {
        try (Socket sock01 = new Socket("172.18.3.184", 7501);
             Socket sock02 = new Socket("172.18.3.184", 6501)){
                
            DataOutputStream cordConX = new DataOutputStream(sock01.getOutputStream());
            cordConX.write(tempX);
            
            DataOutputStream cordConY = new DataOutputStream(sock02.getOutputStream());
            cordConY.write(tempY);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}