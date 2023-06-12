

package Controlador;

import Modelo.Mesa;
import Vista.VistaSimulacion;
import java.util.List;

public class SimulacionController {

    public int numMesa;   
    public List<String> hamburguesas;
    public List<List> ingredientes;
    public int precioTotal;
    
    
    public static void main(String[] args) {
        new VistaSimulacion().setVisible(true);
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
    }
    
}
