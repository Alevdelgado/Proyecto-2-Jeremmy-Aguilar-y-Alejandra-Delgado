/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.servidorSalon;
import java.io.IOException;

import Controlador.Salon.ordenC;
import Controlador.Hamburguesa.hamburEspecialC;
import static Controlador.servidorSalon.listaHamburguesas;
import static Controlador.servidorSalon.numMesa;
import static Controlador.servidorSalon.precioTotal;
import Controlador.servidorSalonCocina;

/**
 *
 * @author Llermy
 */
public class VistaSalon {
    public static void main(String[] args) throws IOException {  
        
        /*ordenC orden01 = new ordenC(0,2); 
        orden01.insetHambur(new hamburEspecialC(null,null,null,null,null,null));
        orden01.insetHambur(new hamburEspecialC(null,null,null,null,null,null));
        orden01.insetHambur(new hamburEspecialC(null,null,null,null,null,null));
        
        System.out.println(orden01.pasarOrdenToString());*/
        
       // VistaPedido vistaPedido = new VistaPedido ();
        //vistaPedido.setVisible(true);

        servidorSalonCocina serverSC = new servidorSalonCocina();
        serverSC.start();
        
        ventanaSalon ventSalon01 = new ventanaSalon();
        ventSalon01.setVisible(true);
        
        servidorSalon serverSalon01 = new servidorSalon(ventSalon01, serverSC);
        serverSalon01.start();
        //serverSalonCoci.start();
        //  serverSalon01.enviarConfir(orden01.numMesaX, orden01.numMesaY ,orden01.pasarOrdenToString());
        //serverSC.enviarConfir(3, 1,"pedidoooooooo");
        
    }
}
