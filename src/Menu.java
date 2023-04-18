import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class Menu {

    private String nome;
    private String tipo;

    private ArrayList<Antipasti> antipastiList;

    private ArrayList<Bevande> bevandeList;

    private ArrayList<PrimiPiatti> primiPiattiList;

    private ArrayList<SecondiPiatti> secondiPiattiList;

    private ArrayList<Dolci> dolciList;

    //TODO stampiamo nome e tipo
    public Menu(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.antipastiList = new ArrayList<>();

        this.bevandeList = new ArrayList<>();

        this.primiPiattiList = new ArrayList<>();

        this.secondiPiattiList = new ArrayList<>();

        this.dolciList = new ArrayList<>();

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

    public String setTipo(String tipo) {
        this.tipo = tipo;
        return tipo;
    }

    public void addAntipasto(Antipasti antipasti) {
        antipastiList.add(antipasti);
    }

    public void removeAntipasto(Antipasti antipasti) {
        antipastiList.remove(antipasti);
    }


    public void addBevanda(Bevande bevande) {
        bevandeList.add(bevande);
    }

    public void removeBevanda(Bevande bevande) {
        bevandeList.remove(bevande);
    }

    public void addPrimo(PrimiPiatti primiPiatti) {
        primiPiattiList.add(primiPiatti);
    }

    public void removePrimo(PrimiPiatti primiPiatti) {
        primiPiattiList.remove(primiPiatti);
    }


    public void addSecondo(SecondiPiatti secondiPiatti) {
        secondiPiattiList.add(secondiPiatti);
    }

    public void removeSecondo(SecondiPiatti secondiPiatti) {
        secondiPiattiList.remove(secondiPiatti);
    }

    public void addDolce(Dolci dolci) {
        dolciList.add(dolci);
    }

    public void removeDolce(Dolci dolci) {
        dolciList.remove(dolci);
    }


    //TOD
    public void printAntipasti() {
      //  System.out.println(UtilityColor.BLUE_UNDERLINED + "Antipasti: ");
        for (Antipasti antipasti : antipastiList) {
            antipasti.printMenuAntipasti();
        }
        System.out.print("\n");
    }


    public void printBevande() {
        System.out.println(Utility.PURPLE_UNDERLINED.getFormat() + "Bevande ");
        for (Bevande bevande : bevandeList) {
            bevande.printInfo(Utility.PURPLE.getFormat());

        }
        System.out.print("\n");
    }

    public void printPrimi() {

        System.out.println(Utility.GREEN_UNDERLINED.getFormat() + "Primi piatti: ");
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            primiPiatti.printInfo(Utility.GREEN.getFormat());

        }
        System.out.print("\n");
    }


    public void printDolci() {
       // System.out.println(UtilityColor.YELLOW_BOLD + "\nDolci:");
        for (Dolci dolciPiatti : dolciList) {
            dolciPiatti.printInfo(Utility.YELLOW.getFormat());
        }
        System.out.println("\n");
    }

    public void prezzoMedioMenu(Menu menu) {
        double mediaAntipasti = 0.0;
        double mediaPrimi = 0.0;
        double mediaSecondi = 0.0;
        double mediaDolci = 0.0;

        for (Antipasti antipasti : antipastiList) {
            mediaAntipasti += antipasti.getPrezzo();
        }
        mediaAntipasti /= antipastiList.size();

        for (PrimiPiatti primiPiatti : primiPiattiList) {
            mediaPrimi += primiPiatti.getPrezzo();
        }
        mediaPrimi /= primiPiattiList.size();

        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            mediaSecondi += secondiPiatti.getPrezzo();
        }
        mediaSecondi /= secondiPiattiList.size();

        for (Dolci dolci : dolciList) {
            mediaDolci += dolci.getPrezzo();
        }
        mediaDolci /= dolciList.size();

        double mediaMenu = (mediaAntipasti + mediaPrimi + mediaSecondi + mediaDolci) / 4;

        System.out.println("Il prezzo medio del Menu:" + menu.getTipo() + " è:" + mediaMenu);
    }

}

