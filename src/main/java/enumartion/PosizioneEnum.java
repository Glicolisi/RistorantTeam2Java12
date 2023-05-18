package enumartion;

public enum PosizioneEnum {

    PRIVATO("Privato"),
    VERANDA("Veranda"),
    INTERNO("Interno"),
    LIBERO("Libero");


    private String posizione;

    PosizioneEnum(String posizione) {
        this.posizione = posizione;
    }

    public String getPosizione() {
        return posizione;
    }
}
