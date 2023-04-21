public enum Allergeni1 {

    //Allergeni

    GLUTINE("glutine"),
    CROSTACEI("crostacei"),
    UOVA("uova"),
    PESCE("pesce"),
    ARACHIDI("arachidi"),
    SOIA("soia"),
    LATTE("latte"),
    FRUTTA_A_GUSCIO("frutta a guscio"),
    SEDANO("sedano"),
    SENAPE("senape"),
    SESAMO("sesamo"),
    ANIDRIDE_SOLFOROSA("anidride solforosa"),
    LUPINI("lupini"),
    MOLLUSCHI("molluschi");

    private String allergeni;

    Allergeni1(String allergeni){this.allergeni=allergeni;}

    public String getAllergeni() {
        return allergeni;
    }

    public void setAllergeni(String allergeni) {
        this.allergeni = allergeni;
    }

}
