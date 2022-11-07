package ba.unsa.etf.rpr;

public class MobilniBroj implements TelefonskiBroj {
    private String mobilniBroj;

    public MobilniBroj(int mobilnaMreza, String broj) throws IllegalArgumentException {
        if (mobilnaMreza < 60 || mobilnaMreza > 67)
            throw new IllegalArgumentException("Mobilna mreza mora biti u rasponu izmedju 60 i 67");
        this.mobilniBroj = "0" + mobilnaMreza + broj;
    }

    public String ispisi() {
        return mobilniBroj.substring(0, 3) + "/" + mobilniBroj.substring(3, 6) + "-" + mobilniBroj.substring(6, 9);
    }

    public int hashCode() {
        return Integer.parseInt(mobilniBroj);
    }
}
