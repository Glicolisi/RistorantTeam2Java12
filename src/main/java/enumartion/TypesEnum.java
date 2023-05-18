package enumartion;

public enum TypesEnum {

    ONNIVORO("Onnivoro"),
    CARNIVORO("Carnivoro"),
    VEGETARIANO("Vegetariano"),
    VEGANO("Vegano");

    private String tipo;

    TypesEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
