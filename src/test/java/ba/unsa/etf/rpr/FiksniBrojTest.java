package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiksniBrojTest {

    @Test
    void ispisi() {
        FiksniBroj f= new FiksniBroj(Grad.BIHAC,"567890");
        assertEquals("037/567-890",f.ispisi());
    }

    @Test
    void testHashCode() {
        FiksniBroj f= new FiksniBroj(Grad.SARAJEVO,"567890");
        assertEquals(33567890,f.hashCode());
    }
}