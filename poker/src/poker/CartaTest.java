//package poker;
//
//import com.sun.jdi.IntegerValue;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static java.lang.Integer.parseInt;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CartaTest {
//    private Carta carta1 ;
//    private Carta carta2;
//    private Carta carta3;
//
//    @BeforeEach
//    void setUp() throws Exception{
//        carta1 = new Carta(2, "Picas");
//        carta2 = new Carta (10, "Diamantes");
//        carta3 = new Carta (1,"Diamantes");
//
//
//
//    }
//
//
//    @Test
//    void testGetvalor(){
//       assertEquals(10,carta2.getValor());
//       assertEquals(2,carta1.getValor());
//       assertEquals(1,carta3.getValor());
//
//
//    }
//
//    void testGetPalo(){
//        assertEquals("Picas",carta1.getPalo());
//        assertEquals("Diamantes",carta2.getPalo());
//        assertEquals(10, Integer.valueOf(carta1.getValor()));
//    }
//}
