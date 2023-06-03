package Modelo;
import java.util.ArrayList;
import java.util.List;

public class MesaMod {

    private int numeroMesa;
    
    //public MesaMod(int numeroMesa) {
        //this.numeroMesa = numeroMesa;
    //}
    
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    public void guardarInfoMesa(int numMesa) {
        this.numeroMesa = numMesa;
        System.out.println(this.numeroMesa);
    }
}
