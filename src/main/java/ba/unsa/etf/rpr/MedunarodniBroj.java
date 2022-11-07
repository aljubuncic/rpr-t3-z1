package ba.unsa.etf.rpr;

public class MedunarodniBroj implements TelefonskiBroj {
    private String medunarodniBroj;

    MedunarodniBroj(String drzava, String broj) {
        this.medunarodniBroj = drzava + broj;
    }

    public String ispisi() {
        return medunarodniBroj.substring(0, 4) + "/" + medunarodniBroj.substring(4, 7) + "-" + medunarodniBroj.substring(7, 10);
    }

    public int hashCode() {
        return Integer.parseInt(medunarodniBroj.substring(0));
    }
}
