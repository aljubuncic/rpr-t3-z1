package ba.unsa.etf.rpr;

public enum Grad {
    BIHAC("037"), ORASJE("031"), TUZLA("035"), ZENICA("032"), GORAZDE("038"), TRAVNIK("030"), MOSTAR("036"), SIROKI_BRIJEG("039"),
    SARAJEVO("033"), LIVNO("034");
    private String pozivniBroj;

    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    @Override
    public String toString() {
        return this.pozivniBroj;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }
}
