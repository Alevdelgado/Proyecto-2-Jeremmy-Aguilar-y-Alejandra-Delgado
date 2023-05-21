package Controlador;

import Modelo.Salon;
import Modelo.Mesa;

public class SalonControlador {
    private Salon salon;

    public SalonControlador() {
        salon = new Salon();
    }

    public void mostrarEstadoMesas() {
        for (Mesa mesa : salon.getMesas()) {
            int numeroMesa = mesa.getNumeroMesa();
            boolean estado = mesa.getEstado();

            System.out.println("Mesa " + numeroMesa + ": " + (estado ? "Ocupada" : "Libre"));
        }
    }

    public void ocuparMesa(int numeroMesa) {
        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null) {
            if (!mesa.getEstado()) {
                mesa.ocuparMesa();
                System.out.println("Mesa " + numeroMesa + " ocupada");
            } else {
                System.out.println("La mesa " + numeroMesa + " ya está ocupada");
            }
        } else {
            System.out.println("No se encontró la mesa " + numeroMesa + ".");
        }
    }

    public void liberarMesa(int numeroMesa) {
        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null) {
            if (mesa.getEstado()) {
                mesa.liberarMesa();
                System.out.println("Mesa " + numeroMesa + " liberada");
            } else {
                System.out.println("La mesa " + numeroMesa + " ya está libre.");
            }
        } else {
            System.out.println("No se encontró la mesa " + numeroMesa);
        }
    }

    private Mesa buscarMesa(int numeroMesa) {
        for (Mesa mesa : salon.getMesas()) {
            if (mesa.getNumeroMesa() == numeroMesa) {
                return mesa;
            }
        }
        return null;
    }
}
