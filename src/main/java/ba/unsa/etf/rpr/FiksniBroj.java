package ba.unsa.etf.rpr;

import java.util.Comparator;

public class FiksniBroj implements TelefonskiBroj {
    private String fiksniBroj;

    public FiksniBroj(Grad g, String broj) {
        this.fiksniBroj = g.getPozivniBroj() + broj;
    }


    public String ispisi() {
        return fiksniBroj.substring(0, 3) + "/" + fiksniBroj.substring(3, 6) + "-" + fiksniBroj.substring(6,9);
    }

    public int hashCode() {
        return Integer.parseInt(fiksniBroj);
    }
}
