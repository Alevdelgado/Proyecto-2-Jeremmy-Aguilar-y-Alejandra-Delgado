/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.servidorSalon;
import java.io.IOException;

import Controlador.Salon.ordenC;
import Controlador.Hamburguesa.hamburEspecialC;

/**
 *
 * @author Llermy
 */
public class VistaSalon {
    public static void main(String[] args) throws IOException {  
        
        ordenC orden01 = new ordenC(0,2); 
        orden01.insetHambur(new hamburEspecialC(null,null,null,null,null,null));
        orden01.insetHambur(new hamburEspecialC(null,null,null,null,null,null));
        orden01.insetHambur(new hamburEspecialC(null,null,null,null,null,null));
        
        System.out.println(orden01.pasarOrdenToString());
        
        VistaPedido vistaPedido = new VistaPedido ();
        vistaPedido.setVisible(true);

        servidorSalon serverSalon01 = new servidorSalon();
        serverSalon01.start(); 
        
        serverSalon01.enviarConfir(orden01.numMesaX, orden01.numMesaY ,orden01.pasarOrdenToString());
        serverSalon01.enviarConfir(orden01.numMesaX, orden01.numMesaY ,orden01.pasarOrdenToString());
    }
}
