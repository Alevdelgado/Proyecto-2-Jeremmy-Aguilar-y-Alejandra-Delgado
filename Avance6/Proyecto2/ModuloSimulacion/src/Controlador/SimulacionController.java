

package Controlador;
import Modelo.Mesa;
import Controlador.threadSocketSimulacion;
import Vista.VistaSimulacion;
import java.util.List;
import java.io.*;
import java.net.Socket;
import java.util.List;

public class SimulacionController {

    public static int numMesa;   
    public static List<String> hamburguesas;
    public static  List<List> ingredientes;
    public  static int precioTotal;
    public static threadSocketSimulacion tempSocketHamburguesas;
    
    public static void main(String[] args) {
        //VistaSimulacion vistaSim;
        new VistaSimulacion().setVisible(true);
        tempSocketHamburguesas = new threadSocketSimulacion();

        
        
    }
    
    
    public void guardarInfoMesa(Mesa mesaSeleccionada) {
        numMesa = mesaSeleccionada.getNumeroMesa();
        System.out.println("Mesa seleccionada: " + numMesa);
    }
    
    
    
    public void guardarInfoOrden(Mesa ordenMesa) {
        numMesa = ordenMesa.getNumeroMesa();
        hamburguesas = ordenMesa.getHamburguesas();
        ingredientes = ordenMesa.getIngredientes();
        precioTotal = ordenMesa.getPrecio();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------------ORDEN-----------------------------");
        System.out.println("Mesa #" + this.numMesa);
        System.out.println("Hamburguesas ordenadas: " + this.hamburguesas);
        System.out.println("Hamburguesas personalizadas: " + this.ingredientes);
        System.out.println("Precio total: " + this.precioTotal);
        
        tempSocketHamburguesas.enviarOrden(this.hamburguesas,this.ingredientes, this.numMesa, this.precioTotal);
        System.out.println("enviadooo");
        

    }
    
    
    
    
}
