import Enums.UtilityEnum;

public class Portata {
    private String nome;
    private Double prezzo;
    private String ingredienti;

    public Portata(String nome, Double prezzo, String ingredienti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void printInfo(String coloreIngredienti,String colorePiatti){
        System.out.println(colorePiatti+nome+": "+prezzo+" euro");
        System.out.println(coloreIngredienti+"("+ingredienti+")");




    }
    public void contieneAllergeni(){};

}
