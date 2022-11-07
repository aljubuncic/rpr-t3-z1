package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilniBrojTest {

    @Test
    void testKonstruktora() {
        assertThrows(IllegalArgumentException.class,()->new MobilniBroj(72,"64735645"),"Mobilna mreza mora biti u rasponu izmedju 60 i 67");
    }

    @Test
    void testHashCode() {
        assertEquals(60456789,new MobilniBroj(60,"456789").hashCode());
    }
}