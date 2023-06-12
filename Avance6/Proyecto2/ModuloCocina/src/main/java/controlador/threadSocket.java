/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import vista.ventCocina;
/*
 *
 * @author Llermy
 */

public class threadSocket extends Thread {
    ventCocina tempVentanaCocina;
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
                int tempX = infoEntrada.read();
                                
                Socket sockCordY = serverCordY.accept();
                infoEntrada = new DataInputStream(sockCordY.getInputStream());
                int tempY = infoEntrada.read();
                        
                
                Socket miSocket = serverCocina.accept();
                infoEntrada = new DataInputStream(miSocket.getInputStream());
                String mensajeTexto = infoEntrada.readUTF();

                System.out.println("llego mensaje...");
                System.out.println("Cord X "+tempX);
                System.out.println("Cord X "+tempY);
                System.out.println(mensajeTexto);
                
                tempVentanaCocina.cambiarBoton(mensajeTexto, tempX,tempY);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void enviarConfir(int tempX,int tempY) throws IOException {
        try (Socket sock01 = new Socket("172.18.3.184", 7201);
             Socket sock02 = new Socket("172.18.3.184", 6201)){
                
            DataOutputStream cordConX = new DataOutputStream(sock01.getOutputStream());
            cordConX.write(tempX);
            
            DataOutputStream cordConY = new DataOutputStream(sock02.getOutputStream());
            cordConY.write(tempY);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}