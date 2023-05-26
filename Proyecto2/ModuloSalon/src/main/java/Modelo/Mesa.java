package Modelo;

import java.util.ArrayList;
import java.util.List;


public class Mesa {
    // Agrega los atributos necesarios para almacenar la información de la mesa
    private int numeroMesa;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    // Agrega los getters y setters para acceder a los atributos de la clase
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

}