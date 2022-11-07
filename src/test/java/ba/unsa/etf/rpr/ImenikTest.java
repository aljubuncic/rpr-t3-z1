package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @Test
    void dajImeBezIzuzetka() throws TelephoneNumberNotFound {
        Imenik i= new Imenik();
        TelefonskiBroj telBroj=new MedunarodniBroj("+351","777777");
        i.dodaj("Cristiano Ronaldo",telBroj);
        /*telBroj=new FiksniBroj(SARAJEVO, "4635675");
        i.dodaj("Bakir Izetbegovic",telBroj);
         */
        assertEquals("Cristiano Ronaldo",i.dajIme(telBroj));
    }
    @Test
    void dajImeSaIzuzetkom(){
        Imenik i= new Imenik();
        i.dodaj("Cristiano Ronaldo",new MedunarodniBroj("+351","777777"));
        assertThrows(TelephoneNumberNotFound.class,()->i.dajIme(new MedunarodniBroj("+387","6743486")));
    }
}