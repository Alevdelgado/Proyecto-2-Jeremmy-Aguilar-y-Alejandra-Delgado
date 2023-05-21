package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int nroMesa;
    private boolean estado;
    private List<String> ordenes;
    private String cuenta;

    public Mesa(int nroMesa) {
        this.nroMesa = nroMesa;
        estado = false;
        ordenes = new ArrayList<>();
        cuenta = "";
    }

    public boolean getEstado() {
        return estado;
    }

    public void liberarMesa() {
        estado = false;
        ordenes.clear();
        cuenta = "";
    }

    public void ocuparMesa() {
        estado = true;
    }

    public void generarFactura() {
        // se genera la factura cuando se da a aceptar la orden y de acuerdo a la clases factory de hamburgues que en ellas 
        // estan lo precios
    }

    public int getNumeroMesa() {
        return nroMesa;
    }
   
}
