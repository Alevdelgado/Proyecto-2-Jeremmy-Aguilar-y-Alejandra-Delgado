package Modelo;

public class Mesa {
    private String tipoHamburguesa;
    private double precioHamburguesa;
    private int numeroMesa;
    
    public Mesa(String tipoHamburguesa, double precioHamburguesa, int numeroMesa) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.precioHamburguesa = precioHamburguesa;
        this.numeroMesa = numeroMesa;
    }
    
    public String getTipoHamburguesa() {
        return tipoHamburguesa;
    }
    
    public double getPrecioHamburguesa() {
        return precioHamburguesa;
    }
    
    public int getNumeroMesa() {
        return numeroMesa;
    }
}

