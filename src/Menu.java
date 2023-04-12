import java.util.ArrayList;

public class Menu {

    private String nome;
    private String tipo;

    private static ArrayList<Antipasti> antipastiList;
    private ArrayList<SecondiPiatti> secondiPiattiList;

    public Menu(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.antipastiList = new ArrayList<>();
        this.secondiPiattiList= new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void addAntipasto(Antipasti antipasti) {
        antipastiList.add(antipasti);
    }

    public void addRemove(Antipasti antipasti) {
        antipastiList.add(antipasti);
    }

    public void addSecondo(SecondiPiatti secondiPiatti) {secondiPiattiList.add(secondiPiatti);}

    public void removeSecondo(SecondiPiatti secondiPiatti) { secondiPiattiList.remove(secondiPiatti);}

    //TODO ognuno di voi inserirà la propria lista
    public void printAntipasti() {
        for (Antipasti antipasti : antipastiList) {
            antipasti.printMenuAntipasti();
        }
    }
        public void printSecondi() {
            for (SecondiPiatti secondiPiatti : secondiPiattiList) {
                secondiPiatti.printMenuSecondi();

            }

        }

    }
