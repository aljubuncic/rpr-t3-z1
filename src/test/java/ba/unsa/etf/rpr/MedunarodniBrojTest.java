package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedunarodniBrojTest {

    @Test
    void ispisi() {
        MedunarodniBroj m= new MedunarodniBroj("+387","567890");
        assertEquals("+387/567-890",m.ispisi());
    }
    @Test
    void testHashCode(){
        MedunarodniBroj m= new MedunarodniBroj("+007","567890");
        assertEquals(7567890,m.hashCode());
    }
}