package Controlador;

import Modelo.hamburgModelo;

public class hamburgContr extends hamburgModelo implements ingredientesC{

    public hamburgContr(){
        desc = "hamburguesa base: pan-torta-pan";
        precio = 5;
    }

    @Override
    public String descripcion(){
        return desc;
    }

    @Override
    public int precio(){
        return precio;
    }
}
