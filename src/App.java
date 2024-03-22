public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(Vorlesung.getAnzahlVorlesungen());

        Vorlesung vorlesung = new Vorlesung("Softwareentwicklung 2", "Nestler");
        System.out.println(vorlesung.getTitel());
        System.out.println(vorlesung.getDozent_in());

        // noch eine zweite vorlesung bitte
        Vorlesung vorlesung2 = new Vorlesung("Softwareentwicklung 1", "Nestler");
        System.out.println(vorlesung2.laueftGerade());
        vorlesung2.starten("Hallo liebe Studierende!");
        System.out.println(vorlesung2.laueftGerade());
        vorlesung2.beenden();
        System.out.println(vorlesung2.laueftGerade());

        System.out.println(Vorlesung.getAnzahlVorlesungen());

    }
}
