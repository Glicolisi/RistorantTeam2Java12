package enumartion;

public enum TypesPortataEnum {

    ANTIPASTO("Antipasto"),
    PRIMOPIATTO("Primo piatto"),
    SECONDOPIATTO("Secondo piatto"),
    DOLCE("Dolce"),
    BEVANDA("Bevanda");
    private String tipo;

    TypesPortataEnum(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
