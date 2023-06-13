/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Llermy
 */
public class servidorSalonCocina extends Thread{
    
    public servidorSalonCocina(){
        
    }
    
    public void run(){
        System.out.println("Servidor salon en espera...");
        try (ServerSocket serverConfPosX = new ServerSocket(7501);
            ServerSocket serverConfPosY = new ServerSocket(6501)){

            while (true){
                Socket miSocket01 = serverConfPosX.accept();
                DataInputStream cordEntradaX = new DataInputStream(miSocket01.getInputStream());

                int tempX = cordEntradaX.read();
                
                Socket miSocket02 = serverConfPosY.accept();
                DataInputStream cordEntradaY = new DataInputStream(miSocket02.getInputStream());

                int tempY = cordEntradaY.read();

                System.out.println("llego mensaje...");
                //System.out.println(mensajeTexto);
                System.out.println("cord x : "+tempX);
                System.out.println("cord y : "+tempY);
                
                
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void enviarConfir(int tempX, int tempY, String mensajePedido) throws IOException {
        try (Socket sock01 = new Socket("172.18.3.184", 7101);
            DataOutputStream cordXSalida = new DataOutputStream(sock01.getOutputStream())){
            cordXSalida.write(tempX);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("!! no se pudo conectar con el socket de la informacion del pedido.");
        }
        
        try (Socket sock02 = new Socket("172.18.3.184", 6101);
            DataOutputStream cordYSalida = new DataOutputStream(sock02.getOutputStream())){
            cordYSalida.write(tempY);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("!! no se pudo conectar con el socket de la informacion del pedido.");
        }
        
        try (Socket sock03 = new Socket("172.18.3.184", 8101);
            DataOutputStream mensajeSalida = new DataOutputStream(sock03.getOutputStream())){
            mensajeSalida.writeUTF(mensajePedido);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("!! no se pudo conectar con el socket de la informacion del pedido.");
        }
    }
}
