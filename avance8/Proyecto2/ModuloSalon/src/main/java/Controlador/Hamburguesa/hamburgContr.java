package Controlador.Hamburguesa;

import Controlador.Ingredientes.ingredientesC;
import Modelo.hamburgModelo;

public class hamburgContr extends hamburgModelo implements ingredientesC{

    public hamburgContr(){
        descripcion = "hamburguesa base: pan-torta-pan";
        precio = 5;
    }

    @Override
    public String descripcion(){
        return descripcion;
    }

    @Override
    public int precio(){
        return precio;
    }
}
