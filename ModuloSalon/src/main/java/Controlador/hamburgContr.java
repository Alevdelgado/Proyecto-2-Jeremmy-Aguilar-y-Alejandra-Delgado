package Controlador;

import Modelo.hamburgModelo;

public class hamburgContr extends hamburgModelo implements ingredientesC{

    public hamburgContr(){
        desc = "hamburguesa base: pan-torta-pan";
        precio = 500;
    }

    public String descripcion(){
        return desc;
    }

    public int precio(){
        return precio;
    }
}
