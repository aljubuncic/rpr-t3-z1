package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiksniBrojTest {
    
    @Test
    void ispisi() {
        FiksniBroj f= new FiksniBroj("567890",Grad.SARAJEVO);
        assertEquals("033/567-890",f.ispisi());
    }

    @Test
    void testHashCode() {
        FiksniBroj f= new FiksniBroj("567890",Grad.BIHAC);
        assertEquals(37567890,f.hashCode());
    }
}
