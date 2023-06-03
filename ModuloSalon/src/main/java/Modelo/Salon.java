package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<MesaMod> mesas;

    public Salon() {
        mesas = new ArrayList<>();
        }

    public List<MesaMod> getMesas() {
        return mesas;
    }

   
}

