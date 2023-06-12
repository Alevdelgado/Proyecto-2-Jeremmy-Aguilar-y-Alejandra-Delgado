package com.mycompany.modulococina;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import controlador.threadSocket;
import vista.ventCocina;
        
public class ModuloCocina {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Wooooooooooorld!");
        
        
        ventCocina ventCoci01 = new ventCocina();
        ventCoci01.setVisible(true);

        threadSocket socketCocina01 = new threadSocket(ventCoci01);
        socketCocina01.start();
        
        ventCoci01.setSocket(socketCocina01);

        socketCocina01.enviarConfir(7,5);
        
        System.out.println("dadadadaa");
    }
}
