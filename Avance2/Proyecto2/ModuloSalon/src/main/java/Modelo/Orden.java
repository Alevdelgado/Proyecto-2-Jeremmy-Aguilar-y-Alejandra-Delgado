package Modelo;

public class Orden {
    private String hamburguesa;
    private double precio;
    private int cantidad;
    private String ingredienteExtra;
    private int numeroMesa;
    
    
    // aqui no seria de tipo String sino de tipo hamburEspecialC???
    public Orden(String hamburguesa, double precio, int cantidad, String ingredienteExtra, int numeroMesa) {
        this.hamburguesa = hamburguesa;
        this.precio = precio;
        this.cantidad = cantidad;
        this.ingredienteExtra = ingredienteExtra;
        this.numeroMesa = numeroMesa;
    }
    
    
    public String getHamburguesa() {
        return hamburguesa;
    }
    
    public void setHamburguesa(String hamburguesa) {
        this.hamburguesa = hamburguesa;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getIngredienteExtra() {
        return ingredienteExtra;
    }
    
    public void setIngredienteExtra(String ingredienteExtra) {
        this.ingredienteExtra = ingredienteExtra;
    }
    
    public int getNumeroMesa() {
        return numeroMesa;
    }
    
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}