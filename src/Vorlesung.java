public class Vorlesung {
    private String titel;
    private String dozent_in;
    private boolean laeuft = false;
    private static int anzahlVorlesungen = 0;
    public static final String UNIVERSITAET = "TH Ingolstadt";

    public Vorlesung(String titel, String dozent_in) {
        this.titel = titel;
        this.dozent_in = dozent_in;
        anzahlVorlesungen++;
        System.out.println("Vorlesung erstellt");
    }

    public String getTitel() {
        return titel;
    }

    public String getDozent_in() {
        return dozent_in;
    }

    public void starten(String begruessung) {
        System.out.println(begruessung);
        laeuft = true;
    }

    public void beenden() {
        laeuft = false;
    }

    public boolean laueftGerade() {
        return laeuft;
    }

    public static int getAnzahlVorlesungen() {
        return anzahlVorlesungen;
    }
}
