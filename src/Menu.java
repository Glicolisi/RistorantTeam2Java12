import java.util.*;

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


    public void printAntipasti() {

        System.out.println(Utility.BLUE_UNDERLINED.getFormat() + "Antipasti: " + Utility.BLUE.getFormat());
        for (Antipasti antipasti : antipastiList) {
            antipasti.printInfo(Utility.BLUE.getFormat(), Utility.BLUE_CAPITAL.getFormat());
            antipasti.provenienzeKmZero(antipasti.isKmZero());
        }
        System.out.print("\n");
    }



    public void printBevande() {
        System.out.println(Utility.PURPLE_UNDERLINED.getFormat() + "Bevande " + Utility.PURPLE.getFormat());

        for (Bevande bevande : bevandeList) {
            bevande.printInfo(Utility.PURPLE.getFormat(), Utility.PURPLE_CAPITAL.getFormat());
            bevande.checkAlchol(bevande.isAlcholic());
        }
        System.out.print("\n");
    }

     public void printBevande() {
         System.out.println(Utility.PURPLE_UNDERLINED.getFormat() + "Bevande "+ Utility.PURPLE.getFormat());

         for (Bevande bevande : bevandeList) {
             bevande.printInfo(Utility.PURPLE.getFormat(),Utility.PURPLE_CAPITAL.getFormat());

         }
         System.out.print("\n");
     }


    public void printPrimi() {

        System.out.println(Utility.GREEN_UNDERLINED.getFormat() + "Primi piatti: " + Utility.GREEN.getFormat());
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            primiPiatti.printInfo(Utility.GREEN.getFormat(), Utility.GREEN_CAPITAL.getFormat());
        }

        System.out.print("\n");
    }

    public void printSecondi() {
        System.out.println(Utility.CYAN_UNDERLINED.getFormat() + "Secondi piatti: " + Utility.CYAN.getFormat());
        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            secondiPiatti.printInfo(Utility.CYAN.getFormat(), Utility.CYAN_CAPITAL.getFormat());
        }
        System.out.println("\n");
    }

<<<<<<< HEAD


=======
>>>>>>> e39a73880b6b234c4db1a19e94085812f162724e
    public void printDolci() {
        System.out.println(Utility.YELLOW_UNDERLINED.getFormat() + "Dolci:" + Utility.YELLOW.getFormat());
        for (Dolci dolciPiatti : dolciList) {
            dolciPiatti.printInfo(Utility.YELLOW.getFormat(), Utility.YELLOW_CAPITAL.getFormat());
        }
        System.out.println("\n");
    }

    public void prezzoMedioMenu(Menu menu) {
        List<Portate> menuList = new ArrayList<>();
        menuList.addAll(antipastiList);
        menuList.addAll(primiPiattiList);
        menuList.addAll(secondiPiattiList);
        menuList.addAll(dolciList);
        menuList.addAll(bevandeList);
        double mediaMenu = 0.0;

        for (Portate portata : menuList) {
            mediaMenu += portata.getPrezzo();
        }
        mediaMenu = (Math.round(mediaMenu / menuList.size() * 100.0) / 100.0);

        // Oppure un altro metodo -> double mediaMenu = menuList.stream().mapToDouble(Portate::getPrezzo).sum()/menuList.size();

        if (mediaMenu >= 0 && mediaMenu <= 20) {

            System.out.println(Utility.ANSI_RESET.getFormat() + ("Il prezzo medio del " + menu.getNome() + " è: " + mediaMenu + " euro     €\n"));
        }
        if (mediaMenu > 20 && mediaMenu <= 40) {
            System.out.println(Utility.ANSI_RESET.getFormat() + ("Il prezzo medio del " + menu.getNome() + " è: " + mediaMenu + " euro     €€\n"));
        }
        if (mediaMenu > 40) {
            System.out.println(Utility.ANSI_RESET.getFormat() + ("Il prezzo medio del " + menu.getNome() + " è: " + mediaMenu + " euro     €€€\n"));
        }


    }

}











