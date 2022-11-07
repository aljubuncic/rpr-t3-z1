package ba.unsa.etf.rpr;

public class TelephoneNumberNotFound extends Exception {
    TelephoneNumberNotFound() {
        System.out.println("Trazeni broj telefona nije nadjen");
    }

    TelephoneNumberNotFound(String poruka) {
        super(poruka);
    }

}
