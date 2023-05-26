/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author aleja
 */
public class respaldp {
    
}
/*// Clase abstracta que representa una hamburguesa
public abstract class Hamburguesa {
    protected String nombre;
    protected String pan;
    protected String carne;
    protected List<String> ingredientes;

    public abstract void preparar();

    public void cocinar() {
        System.out.println("Cocinando la hamburguesa");
    }

    public void empaquetar() {
        System.out.println("Empaquetando la hamburguesa");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}

// Clase concreta que representa una hamburguesa de pollo
public class HamburguesaPollo extends Hamburguesa {
    public HamburguesaPollo() {
        nombre = "Hamburguesa de Pollo";
        pan = "Pan de trigo";
        carne = "Pollo";
        ingredientes = new ArrayList<>();
        ingredientes.add("Lechuga");
        ingredientes.add("Tomate");
        ingredientes.add("Mayonesa");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando una hamburguesa de pollo");
    }
}

// Clase concreta que representa una hamburguesa de res
public class HamburguesaRes extends Hamburguesa {
    public HamburguesaRes() {
        nombre = "Hamburguesa de Res";
        pan = "Pan de ajonjolí";
        carne = "Res";
        ingredientes = new ArrayList<>();
        ingredientes.add("Queso");
        ingredientes.add("Cebolla");
        ingredientes.add("Salsa BBQ");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando una hamburguesa de res");
    }
}

// Clase Factory que crea hamburguesas
public class HamburguesaFactory {
    public Hamburguesa crearHamburguesa(String tipo) {
        if (tipo.equalsIgnoreCase("pollo")) {
            return new HamburguesaPollo();
        } else if (tipo.equalsIgnoreCase("res")) {
            return new HamburguesaRes();
        } else {
            return null;
        }
    }
}

// Ejemplo de uso del Factory para crear hamburguesas
public class EjemploFactory {
    public static void main(String[] args) {
        HamburguesaFactory factory = new HamburguesaFactory();

        // Crear una hamburguesa de pollo
        Hamburguesa hamburguesaPollo = factory.crearHamburguesa("pollo");
        hamburguesaPollo.preparar();
        hamburguesaPollo.cocinar();
        hamburguesaPollo.empaquetar();

        // Crear una hamburguesa de res
        Hamburguesa hamburguesaRes = factory.crearHamburguesa("res");
        hamburguesaRes.preparar();
        hamburguesaRes.cocinar();
        hamburguesaRes.empaquetar();
    }
}*/