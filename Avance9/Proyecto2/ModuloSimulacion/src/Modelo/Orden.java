package Modelo;



import Vista.OrdenSimulacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Orden {
    public Mesa[][] mesas;
    public List<Integer> hamburguesasDisponibles;
    private Random random;
    public static String informacionString;
    public static OrdenSimulacion ordenSim;
    public static int precioTotal;
    public static Mesa mesaAleatoria;
    public static int numMesa;
    public static Orden orden;

    public Orden() {
        //this.mesas = mesas;
        mesas = new OrdenSimulacion().mesas;
        ordenSim = new OrdenSimulacion();
        this.hamburguesasDisponibles = new ArrayList<>();
        this.random = new Random();

        hamburguesasDisponibles.add(1);
        hamburguesasDisponibles.add(2);
        hamburguesasDisponibles.add(3);
        hamburguesasDisponibles.add(4);
        hamburguesasDisponibles.add(5);
        hamburguesasDisponibles.add(6);
    }

    public List<Integer> generarOrden(int cantidadHamburguesas) {
        List<Integer> orden = new ArrayList<>();

        for (int i = 0; i < cantidadHamburguesas; i++) {
            int hamburguesa = seleccionarHamburguesaAleatoria();
            orden.add(hamburguesa);

            int precioHamburguesa = obtenerPrecio(hamburguesa);
            precioTotal += precioHamburguesa;
        }
        mesaAleatoria = seleccionarMesaAleatoria();
        numMesa = mesaAleatoria.getNumeroMesa();
        
        System.out.println("Mesa seleccionada: " + numMesa);
        System.out.println("Pedido aleatorio: " + orden);
        System.out.println("Precio total: $" + precioTotal);
        
        
        StringBuilder informacion = new StringBuilder();
        informacion.append("Mesa seleccionada: ").append(numMesa).append("\n");
        informacion.append("Pedido aleatorio: ").append(orden.toString()).append("\n");
        informacion.append("Precio total: $").append(precioTotal);

        informacionString = informacion.toString();

        return orden;
    }

    public int obtenerPrecio(int hamburguesa) {
        if (hamburguesa == 1) {
            return 10;
        } else if (hamburguesa == 2) {
            return 15;
        } else if (hamburguesa == 3) {
            return 15;
        } else if (hamburguesa == 4) {
            return 25;
        } else if (hamburguesa == 5) {
            return 25;
        } else if (hamburguesa == 6) {
            return 35;
        }

        return 0; // Precio por defecto si no se encuentra el tipo de hamburguesa
    }

    private int seleccionarHamburguesaAleatoria() {
        int indiceAleatorio = random.nextInt(hamburguesasDisponibles.size());
        return hamburguesasDisponibles.get(indiceAleatorio);
    }
    
    
    private Mesa seleccionarMesaAleatoria() {
        int indiceFilaAleatorio = random.nextInt(ordenSim.filas);
        int indiceColumnaAleatorio = random.nextInt(ordenSim.columnas);
        return mesas[indiceFilaAleatorio][indiceColumnaAleatorio];
    }

}
