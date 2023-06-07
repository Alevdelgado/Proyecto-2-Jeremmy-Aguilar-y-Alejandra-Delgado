

package Controlador;

import Modelo.Mesa;
import Vista.VistaSimulacion;

public class SimulacionController {


    
    // Mesa 
    public int numMesa;   
    // Orden 
    public String hamburguesa;
    //public Hamburguesa hamburguesa;
    
    public static void main(String[] args) {
        new VistaSimulacion().setVisible(true);
    }
    
    
    public void guardarInfoMesa(Mesa mesaSeleccionada) {
        numMesa = mesaSeleccionada.getNumeroMesa();
        System.out.println("Mesa seleccionada: " + numMesa);
    }
    
    public void guardarInfoOrden(String hamburguesa) {
        this.hamburguesa = hamburguesa;
        System.out.println("Hamburguesa seleccionada: " + this.hamburguesa);
    }
    
}
