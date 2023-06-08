package Modelo;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
import java.util.List;

public class MesaMod {
    
    private List<String> hamburguesas;
    private int numeroMesa;
    
    public MesaMod(List<String> hamburguesas, int numeroMesa) {
        this.hamburguesas = hamburguesas;
        this.numeroMesa = numeroMesa;
    }
    
    public List<String> getHamburguesas(){
        return hamburguesas;
    }
       
    public int getNumeroMesa() {
        return numeroMesa;
    }
}
