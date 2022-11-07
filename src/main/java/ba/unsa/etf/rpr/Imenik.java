package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    Map<String, TelefonskiBroj> imenik;

    Imenik() {
        imenik = new HashMap<>(0);
    }

    void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }

    String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    String dajIme(TelefonskiBroj broj) throws TelephoneNumberNotFound {
        for (Map.Entry<String, TelefonskiBroj> ime : imenik.entrySet())
            if (ime.getValue() == broj)
                return ime.getKey();
        throw new TelephoneNumberNotFound();
    }

    String naSlovo(char s) {
        int i = 1;
        StringBuilder sviBrojevi = null;
        for (Map.Entry<String, TelefonskiBroj> ime : imenik.entrySet())
            if (ime.getKey().startsWith(String.valueOf(s))) {
                sviBrojevi.append(i).append(". ").append(ime.getKey()).append("-").append(ime.getValue()).append("\n");
                i++;
            }
        return String.valueOf(sviBrojevi);
    }

    Set<String> izGrada(Grad g) {
        SortedSet<String> osobeIzGrada = null;
        for (Map.Entry<String, TelefonskiBroj> ime : imenik.entrySet()) {
            if (ime.getValue().ispisi().substring(0, 2).equals(g.getPozivniBroj()))
                osobeIzGrada.add(ime.getKey());
        }
        return osobeIzGrada;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        SortedSet<TelefonskiBroj> brojeviIzGrada = null;
        for (Map.Entry<String, TelefonskiBroj> ime : imenik.entrySet()) {
            if (ime.getValue().ispisi().substring(0, 2).equals(g.getPozivniBroj()))
                brojeviIzGrada.add(ime.getValue());
        }
        return brojeviIzGrada;
    }
}
