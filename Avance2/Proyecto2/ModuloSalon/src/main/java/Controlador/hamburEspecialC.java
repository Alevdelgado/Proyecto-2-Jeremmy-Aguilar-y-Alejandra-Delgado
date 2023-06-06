package Controlador;

import Modelo.hamburEspecialM;

public class hamburEspecialC extends hamburEspecialM implements ingredientesC{
    public hamburEspecialC(ingredientesC tempIn01, ingredientesC tempIn02, ingredientesC tempIn03, ingredientesC tempIn04, ingredientesC tempIn05, ingredientesC tempIn06){
        
        ingreBase = new hamburgContr();
        
        //asigna ingrediente 1
        if (tempIn01 != null){
            ingre01 = tempIn01;
        }
        else{
            ingre01 = new ingreNuloC();
        }
        //asigna ingrediente 2
        if (tempIn02 != null){
            ingre02 = tempIn02;
        }
        else{
            ingre02 = new ingreNuloC();
        }
        //asigna ingrediente 3
        if (tempIn03 != null){
            ingre03 = tempIn03;
        }
        else{
            ingre03 = new ingreNuloC();
        }
        //asigna ingrediente 4
        if (tempIn04 != null){
            ingre04 = tempIn04;
        }
        else{
            ingre04 = new ingreNuloC();
        }
        //asigna ingrediente 5
        if (tempIn05 != null){
            ingre05 = tempIn05;
        }
        else{
            ingre05 = new ingreNuloC();
        }
        //asigna ingrediente 6
        if (tempIn06 != null){
            ingre06 = tempIn06;
        }
        else{
            ingre06 = new ingreNuloC();
        }
    }


    @Override
    public String descripcion(){
        return ingre01.descripcion() + "\n" + ingre02.descripcion() + "\n" + ingre03.descripcion() + "\n" + ingre04.descripcion() + "\n" + ingre05.descripcion() + "\n" + ingre06.descripcion();
    }

    @Override
    public int precio(){
        return ingreBase.precio() + ingre01.precio() + ingre02.precio() + ingre03.precio() + ingre04.precio() + ingre05.precio() + ingre06.precio();
    }
}
