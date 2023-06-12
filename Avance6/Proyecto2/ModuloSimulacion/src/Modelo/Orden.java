package Modelo;



import Vista.OrdenSimulacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Orden {
    public Mesa[][] mesas;
    public List<String> hamburguesasDisponibles;
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

        hamburguesasDisponibles.add("Hamburguesa Regular");
        hamburguesasDisponibles.add("Hamburguesa de Queso");
        hamburguesasDisponibles.add("Hamburguesa de Pollo");
        hamburguesasDisponibles.add("Hamburguesa Vegana");
        hamburguesasDisponibles.add("Hamburguesa de Camarones");
        hamburguesasDisponibles.add("Hamburguesa Deluxe");
    }

    public List<String> generarOrden(int cantidadHamburguesas) {
        List<String> orden = new ArrayList<>();

        for (int i = 0; i < cantidadHamburguesas; i++) {
            String hamburguesa = seleccionarHamburguesaAleatoria();
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

    public int obtenerPrecio(String hamburguesa) {
        if (hamburguesa.equals("Hamburguesa Regular")) {
            return 10;
        } else if (hamburguesa.equals("Hamburguesa de Queso")) {
            return 15;
        } else if (hamburguesa.equals("Hamburguesa de Pollo")) {
            return 15;
        } else if (hamburguesa.equals("Hamburguesa Vegana")) {
            return 25;
        } else if (hamburguesa.equals("Hamburguesa de Camarones")) {
            return 25;
        } else if (hamburguesa.equals("Hamburguesa Deluxe")) {
            return 35;
        }

        return 0; // Precio por defecto si no se encuentra el tipo de hamburguesa
    }

    private String seleccionarHamburguesaAleatoria() {
        int indiceAleatorio = random.nextInt(hamburguesasDisponibles.size());
        return hamburguesasDisponibles.get(indiceAleatorio);
    }
    
    
    private Mesa seleccionarMesaAleatoria() {
        int indiceFilaAleatorio = random.nextInt(ordenSim.filas);
        int indiceColumnaAleatorio = random.nextInt(ordenSim.columnas);
        return mesas[indiceFilaAleatorio][indiceColumnaAleatorio];
    }

}
