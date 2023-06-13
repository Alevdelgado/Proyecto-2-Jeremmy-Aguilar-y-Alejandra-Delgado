package Controlador.Salon;

import Modelo.ordenM;
import Controlador.Hamburguesa.hamburEspecialC;
import Controlador.Ingredientes.ingCebolla;
import Controlador.Ingredientes.ingChampiniones;
import Controlador.Ingredientes.ingPepinillos;
import Controlador.Ingredientes.ingQuesoChedar;
import Controlador.Ingredientes.ingTocinoC;
import Controlador.Ingredientes.ingTortaExtraC;
import Controlador.Ingredientes.ingreNuloC;
import java.util.ArrayList;
import java.util.List;

public class ordenC extends ordenM{
    public ordenC(int tempX, int tempY){
        numMesaX = tempX;
        numMesaY = tempY;
        listaHambur = new hamburEspecialC[10];
    }

    public void insetHambur(hamburEspecialC tempHamb){
        int valInsert = 0;
        for (int i = 0; i < 10; i++){
            if (listaHambur[i] == null){
                listaHambur[i] = tempHamb;
                valInsert = 1;
                break;
            }
        }
        if (valInsert == 1){
            System.out.println("La hamburguesa se inserto con exito.");
        }
        else{
            System.out.println("La orden ya esta llena.");
        }
    }

    public void imprimirListaHambur(){
        System.out.println("    EL pedido de la mesa " + numMesaX + numMesaY + " es:");
        for (int i = 0; i < 10; i++){
            if (listaHambur[i] != null){
                System.out.println("--hamburguesa " + (i+1) + " --");
                System.out.println(listaHambur[i].descripcion());
            }
        }
    }
    
    public String pasarOrdenToString(){
        String nuevoStr = "";
        
        nuevoStr += "Pedido de la mesa "+ numMesaX + numMesaY +"\n";
        
        for (int i = 0; i < 10; i++){
            if (listaHambur[i] != null){
                nuevoStr +="--hamburguesa " + (i+1) + " --\n";
                nuevoStr +=listaHambur[i].descripcion()+"\n";
            }
        }
        
        return nuevoStr;
    }
    
    public void agregarHamburSimulacion(List<Integer> listaHamburguesas, List<List> listaIngredientes, int numMesa){
        
        ingCebolla ingCeb = new ingCebolla();
        ingChampiniones ingChamp = new ingChampiniones();
        ingPepinillos ingPepi = new ingPepinillos();
        ingQuesoChedar ingQueChe = new ingQuesoChedar();
        ingTocinoC ingToci = new ingTocinoC();
        ingTortaExtraC ingTortExt = new ingTortaExtraC();
        ingreNuloC ingNul = new ingreNuloC();
      
        
        for (int i = 0; i < listaHamburguesas.size(); i++) {
            
            System.out.println("info de la hamburguesa");
            System.out.println(listaHamburguesas.get(i));
            
            if (listaHamburguesas.get(i) == 1){
                this.insetHambur(new hamburEspecialC(ingCeb, ingPepi, ingQueChe, null, null, null));
            }
            else if (listaHamburguesas.get(i) ==  2){
                this.insetHambur(new hamburEspecialC(ingTortExt, ingQueChe, ingQueChe, ingQueChe, ingQueChe, ingQueChe));
            }
            else if (listaHamburguesas.get(i) ==  3){
                this.insetHambur(new hamburEspecialC(ingTortExt, ingPepi, ingQueChe, ingTortExt, ingToci, null));
            }
            else if (listaHamburguesas.get(i) ==  4){
                this.insetHambur(new hamburEspecialC(ingCeb, ingChamp, ingPepi, ingPepi, null, null));
            }
            else if (listaHamburguesas.get(i) ==  5){
                this.insetHambur(new hamburEspecialC(ingCeb, ingTortExt, ingToci, ingPepi, ingToci, null));
            }
            else {//hamburguesa delux
                this.insetHambur(new hamburEspecialC(ingTortExt, ingToci, ingQueChe, ingToci, ingQueChe, ingTortExt));
            }
                //return vertices.get(i);
        }
    }
}
