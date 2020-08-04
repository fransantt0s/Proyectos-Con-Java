
package  poker;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PokerStatusTest {

    Carta carta1;
    Carta carta2;
    Carta carta3;
    Carta carta4;
    Carta carta5;
    Carta cartaA;
    Carta cartaB;
    Carta cartaC;
    Carta cartaD;
    Carta cartaE;
    Carta carta6;
    Carta carta7;
    Carta carta8;
    Carta carta9;
    Carta carta10;
    Carta cartaF;
    Carta cartaG;
    Carta cartaH;
    Carta cartaI;
    Carta cartaJ;
    PokerStatus mano;
    Jugada jugadaPoker;
    Jugada jugadaColor;
    Jugada jugadaTrio;
    Jugada jugadaNada;
    Jugada jugadaMock;


    //setUp

    @BeforeEach
    public void setUp() {

        //para poker

        //SUT
        mano = new PokerStatus();

        carta1 = new Carta("P", 1);
        carta2 = new Carta("P", 1);
        carta3 = new Carta("C", 1);
        carta4 = new Carta("P", 3);
        carta5 = new Carta("P", 1);

        jugadaPoker = new Jugada(carta1, carta2, carta3, carta4, carta5);

        //para color
        cartaA = new Carta("P", 1);
        cartaB = new Carta("P", 1);
        cartaC = new Carta("P", 1);
        cartaD = new Carta("P", 1);
        cartaE = new Carta("P", 1);

        jugadaColor = new Jugada(cartaA, cartaB, cartaC, cartaD, cartaE);


        //para trio
        carta6 = new Carta("P", 1);
        carta7 = new Carta("P", 9);
        carta8 = new Carta("C", 4);
        carta9 = new Carta("C", 1);
        carta10 = new Carta("C", 1);

        jugadaTrio = new Jugada(carta6, carta7, carta8, carta9, carta10);

        //para nada
        cartaF = new Carta("P", 1);
        cartaG = new Carta("T", 2);
        cartaH = new Carta("L", 10);
        cartaI = new Carta("F", 4);
        cartaJ = new Carta("A", 6);

        jugadaNada = new Jugada(cartaF, cartaG, cartaH, cartaI, cartaJ);

    }

    @Test
    public void verificarPokerTest() {


        //verify
        assertEquals("Poker", mano.verificar(jugadaPoker.getCartas()));
    }


    @Test
    public void verificarColorTest() {


        //verify

        assertEquals("Color", mano.verificar(jugadaColor.getCartas()));

    }

    @Test
    public void verificarTrioTest() {

        // verify

        assertEquals("Trio", mano.verificar(jugadaTrio.getCartas()));

    }

    @Test
    public void verificarNadaTest() {

        // verify

        assertEquals("Nada", mano.verificar(jugadaNada.getCartas()));

    }


    @Test
    public void jugadorGanadorTest() {

        // verify

        assertEquals(jugadaColor, mano.jugadaGanadora(jugadaColor, jugadaTrio));

    }

    //Usando mockito

    //Ver si hay una mano que es color

    @Test
    public void jugadorGanadorTestMockito(){

        // DOC
        Carta cartaT8 = mock(Carta.class);
        Carta cartaQ8 = mock(Carta.class);
        Carta cartaK8 = mock(Carta.class);
        Carta cartaK1 = mock(Carta.class);
        Carta cartaL2 = mock(Carta.class);

        when(cartaT8.getValor()).thenReturn(8); //esto le retorna un valor puesto por ejemplo: retorna que cartaT8 sea la numero 8
        when(cartaQ8.getValor()).thenReturn(8);
        when(cartaK8.getValor()).thenReturn(8);
        when(cartaK1.getValor()).thenReturn(1);
        when(cartaL2.getValor()).thenReturn(2);

        jugadaMock = new Jugada(cartaT8, cartaQ8, cartaK8, cartaK1, cartaL2);

        assertEquals("Trio", mano.verificar(jugadaMock.getCartas()));

    }


}
