package ristorante;

import enumartion.TypesEnum;
import enumartion.ColorsEnum;
import portate.*;

import java.util.*;

public class Menu {

    private double prezzoMedio;
    private String cuoco;
    private String nome;
    private TypesEnum tipo;
    private ArrayList<Portata> portataList;


    public Menu(String nome, TypesEnum tipo, double prezzoMedio) {
        this.nome = nome;
        this.tipo = tipo;
        this.portataList = new ArrayList<>();
        this.prezzoMedio = prezzoMedio;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TypesEnum getTipo() {
        return tipo;
    }

    public double getPrezzoMedio() {
        return prezzoMedio;
    }

    public void setPrezzoMedio(double prezzoMedio) {
        this.prezzoMedio = prezzoMedio;
    }

    public String getCuoco() {
        return cuoco;
    }

    public void setCuoco(String cuoco) {
        this.cuoco = cuoco;
    }

    public ArrayList<Portata> getPortataList() {
        return portataList;
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }


    public void removePortata(Portata portata) {
        portataList.remove(portata);
    }

    /**
     * Metodo che stampa il menu con diversi colori in base al tipo di portata
     */
    public void printMenu() {

        System.out.println(ColorsEnum.BLUE.getFormat() + "Antipasti: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof Antipasti) {
                portata.printInfo(ColorsEnum.BLUE_CAPITAL, ColorsEnum.BLUE);
            }
        }

        System.out.println(ColorsEnum.PURPLE.getFormat() + "\n" + "Primi: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof PrimiPiatti) {
                portata.printInfo(ColorsEnum.PURPLE_CAPITAL, ColorsEnum.PURPLE);
            }
        }

        System.out.println(ColorsEnum.GREEN.getFormat() + "\n" + "Secondi: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof SecondiPiatti) {
                portata.printInfo(ColorsEnum.GREEN_CAPITAL, ColorsEnum.GREEN);
            }
        }

        System.out.println(ColorsEnum.YELLOW.getFormat() + "\n" + "Dolci: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof Dolci) {
                portata.printInfo(ColorsEnum.YELLOW_CAPITAL, ColorsEnum.YELLOW);
            }
        }

        System.out.println(ColorsEnum.CYAN.getFormat() + "\n" + "Bevande: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof Bevande) {
                portata.printInfo(ColorsEnum.CYAN_CAPITAL, ColorsEnum.CYAN);
            }
        }

    }

    /**
     * Metodo che stampa il prezzo medio del menu
     */
    public void printPrezzoMedioMenu() {

        System.out.println("\n");
        double mediaMenu = 0.0;

        for (Portata portata : portataList) {
            mediaMenu += portata.getPrezzo();
        }


        mediaMenu = (Math.round(mediaMenu / portataList.size() * 100.0) / 100.0);


        if (mediaMenu >= 0 && mediaMenu <= 20) {

            System.out.println(formatMediaMenu(mediaMenu, "  €\n"));
        }
        if (mediaMenu > 20 && mediaMenu <= 40) {
            System.out.println(formatMediaMenu(mediaMenu, "  €€\n"));
        }
        if (mediaMenu > 40) {
            System.out.println(formatMediaMenu(mediaMenu, "  €€€\n"));
        }
    }

    private String formatMediaMenu(double mediaMenu, String euroChar) {
        return ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: euro " + mediaMenu + euroChar);
    }

    /**
     * Metodo che calcola il prezzo medio del menu
     *
     * @return double prezzo medioMenu
     */
    public double prezzoMenu() {
        return portataList.stream().mapToDouble(Portata::getPrezzo).sum() / portataList.size();
    }

    /**
     * Metodo che reimposta il prezzo medio del menu
     */
    public void reimpostaPrezzoMedio() {

        OptionalDouble prezzoMinore = portataList.stream().mapToDouble(p -> p.getPrezzo()).min();
        OptionalDouble prezzoMaggiore = portataList.stream().mapToDouble(p -> p.getPrezzo()).max();

        if (prezzoMedio < prezzoMinore.getAsDouble() || prezzoMedio > prezzoMaggiore.getAsDouble()) {
            prezzoMedio = prezzoMenu();
        }

    }

}












