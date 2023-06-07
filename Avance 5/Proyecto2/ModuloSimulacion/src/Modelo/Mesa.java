package Modelo;


import java.util.List;

public class Mesa {
    
    private List<String> hamburguesas;
    private List<String> ingredientes;
    private int numeroMesa;
    private int precio;
    
    public Mesa(List<String> hamburguesas,List<String> ingredientes, int numeroMesa, int precio) {
        this.hamburguesas = hamburguesas;
        this.ingredientes = ingredientes;
        this.numeroMesa = numeroMesa;
        this.precio = precio;
    }
    
    public List<String> getHamburguesas(){
        System.out.println("Hamburguesas: " + hamburguesas);
        return hamburguesas;
    }
    
    public List<String> getIngredientes(){
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

