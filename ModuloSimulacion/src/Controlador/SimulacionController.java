

package Controlador;

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
    
    
    // metodos para tomar la orden 
    
    public void guardarInfoMesa(int numMesa) { // funciona
        this.numMesa = numMesa;
        System.out.println(this.numMesa);
    }
    
    public void guardarInfoOrden(String hamburguesa) { // funciona
        this.hamburguesa = hamburguesa;
        System.out.println(this.hamburguesa);
    }
    
}
