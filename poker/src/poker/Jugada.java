package poker;

import java.util.ArrayList;

public class Jugada {

    private ArrayList<Carta> mano;

    public Jugada (Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        this.mano = this.crearCartas(carta1, carta2, carta3, carta4, carta5);
    }

    public ArrayList<Carta> crearCartas(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        ArrayList<Carta> mano = new ArrayList<Carta>();

        mano.add(carta1);
        mano.add(carta2);
        mano.add(carta3);
        mano.add(carta4);
        mano.add(carta5);
        return mano;
    }

    public ArrayList<Carta> getCartas(){
        return this.mano;
    }


}
