package Modelo;


import java.util.List;

public class Mesa {
    
    private List<String> hamburguesas;
    private List<List> ingredientes;
    private int numeroMesa;
    private int precio;
    private boolean ocupada;
    
    public Mesa(List<String> hamburguesas,List<List> ingredientes, int numeroMesa, int precio) {
        this.hamburguesas = hamburguesas;
        this.ingredientes = ingredientes;
        this.numeroMesa = numeroMesa;
        this.precio = precio;
        ocupada = false; 
    }
   
    public boolean isOcupada() {
    return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    
    public List<String> getHamburguesas(){
        System.out.println("Hamburguesas: " + hamburguesas);
        return hamburguesas;
    }
    
    public List<List> getIngredientes(){
        System.out.println("Ingredientes de la hamburguesa clasica: " + ingredientes);
        return ingredientes;
    }
       
    public int getNumeroMesa() {
        System.out.println("Se selecciono la mesa: "+this.numeroMesa);
        return numeroMesa;
    }
    
    
    public int getPrecio() {
        System.out.println("Precio " +precio);
        return precio;
    }
}

