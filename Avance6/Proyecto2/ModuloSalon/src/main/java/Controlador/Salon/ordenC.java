package Controlador.Salon;

import Modelo.ordenM;
import Controlador.Hamburguesa.hamburEspecialC;

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
}
