package poker;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PokerStatus {


    public String verificar(ArrayList<Carta> mano){

        if(verificarPoker(mano)){
            return "Poker";
        }else if(verificarColor(mano)){
            return "Color";
        }else if(verificarTrio(mano)) {
            return "Trio";
        }else {
            return "Nada";
        }

    }

    public Boolean verificarPoker(ArrayList<Carta> mano){

        Boolean resultado = false;

        for(Carta carta : mano) {
            resultado = resultado || this.hayPoker(carta, mano);
        }

        return resultado;

    }


    public Boolean verificarColor(ArrayList<Carta> mano) {

        Boolean resultado = true;

        for(Carta carta: mano) {
            resultado = resultado && this.hayColor(carta, mano);
        }

        return resultado;

    }

    public Boolean verificarTrio(ArrayList<Carta> mano) {

        Boolean resultado = false;

        for(Carta carta : mano) {
            resultado = resultado || this.hayTrio(carta, mano);
        }

        return resultado;

    }

    public Boolean hayTrio(Carta carta, ArrayList<Carta> mano){

        Integer cant = 0;

        for(Carta carta1 : mano) {
            if(carta.getValor() == carta1.getValor()) {
                cant++;
            }
        }

        return cant == 3;

    }

    public Boolean hayColor(Carta carta, ArrayList<Carta> mano){

        Integer cant=0;
        for(Carta carta1 : mano) {
            if(this.esMismoColor(carta, carta1)) {
                cant++;
            }
        }
        return cant == 5;
    }

    public Boolean esMismoColor(Carta cartaA, Carta cartaB){

        return (cartaA.getPalo() == cartaB.getPalo() && cartaA.getValor() == cartaB.getValor());

    }


    public Boolean hayPoker(Carta carta, ArrayList<Carta> mano) {
        Integer cant = 0;

        for(Carta carta1: mano) {

            if(carta.getValor() == carta1.getValor()) {
                cant++;
            }
        }

        return cant == 4;

    }

    public Boolean esCartaSuperior(Carta cartaA, Carta cartaB){
        return cartaA.getValor() > cartaB.getValor();

    }

    public Boolean esMismoPalo(Carta cartaA, Carta cartaB) {
        return cartaA.getPalo() == cartaB.getPalo();
    }

    public Jugada jugadaGanadora(Jugada jugadaA, Jugada jugadaB) {
        String jugadorA= this.verificar(jugadaA.getCartas());
        String jugadorB= this.verificar(jugadaB.getCartas());

        if(jugadorA.equals("Poker") && !jugadorB.equals("Poquer")) {
            return jugadaA;
        }else if (jugadorA.equals("Color") && jugadorB.equals("Trio")){
            return jugadaA;
        }else if (jugadorA.equals("Trio") && jugadorB.equals("Nada")){
            return jugadaA;
        }else {
            return jugadaB;
        }
    }

}



