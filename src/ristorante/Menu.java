package ristorante;

import enumartion.UtilityEnum;
import portate.*;

import java.util.*;

public class Menu {

    //TODO prezzo medio in ingresso, e poi facciamo un controllo nel metodo che se non c'è allora lo calcola automaticamente
    private double prezzoMedio;
    private String cuoco;
    private String nome;

    //TODO è l'enum tipo : facciamo un enum per il tipo: carnivoro, vegetariano ecc ecc
    private String tipo;
    private ArrayList<Portata> portataList;


    public Menu(String nome, String tipo, double prezzoMedio) {
        this.nome = nome;
        this.tipo = tipo;
        this.portataList = new ArrayList<>();
        this.prezzoMedio = prezzoMedio;
        if (prezzoMedio == 0) {
            this.prezzoMedio = prezzoMedioMenu();
        }

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


    public void printMenu() {
        System.out.println(UtilityEnum.BLUE.getFormat() + "portate.Antipasti: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof Antipasti) {
                portata.printInfo(UtilityEnum.BLUE_CAPITAL.getFormat(), UtilityEnum.BLUE.getFormat());

            }
        }
        System.out.println(UtilityEnum.PURPLE.getFormat() + "\n" + "Primi: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof PrimiPiatti) {
                portata.printInfo(UtilityEnum.PURPLE_CAPITAL.getFormat(), UtilityEnum.PURPLE.getFormat());
            }
            ;
        }
        System.out.println(UtilityEnum.GREEN.getFormat() + "\n" + "Secondi: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof SecondiPiatti) {
                portata.printInfo(UtilityEnum.GREEN_CAPITAL.getFormat(), UtilityEnum.GREEN.getFormat());
            }
        }
        System.out.println(UtilityEnum.YELLOW.getFormat() + "\n" + "portate.Dolci: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof Dolci) {
                portata.printInfo(UtilityEnum.YELLOW_CAPITAL.getFormat(), UtilityEnum.YELLOW.getFormat());
            }
            ;
        }
        System.out.println(UtilityEnum.CYAN.getFormat() + "\n" + "portate.Bevande: " + "\n");
        for (Portata portata : portataList) {
            if (portata instanceof Bevande) {
                portata.printInfo(UtilityEnum.CYAN_CAPITAL.getFormat(), UtilityEnum.CYAN.getFormat());
            }
        }

    }

    public double prezzoMedioMenu() {

        System.out.println("\n");
        double mediaMenu = 0.0;

        for (Portata portata : portataList) {
            mediaMenu += portata.getPrezzo();
        }
        mediaMenu = (Math.round(mediaMenu / portataList.size() * 100.0) / 100.0);


        // Oppure un altro metodo -> double
        //mediaMenu = menuList.stream().mapToDouble(portate.Portata::getPrezzo).sum()/menuList.size();

        if (mediaMenu >= 0 && mediaMenu <= 20) {

            System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: " + mediaMenu + " euro     €\n"));
        }
        if (mediaMenu > 20 && mediaMenu <= 40) {
            System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: " + mediaMenu + " euro     €€\n"));
        }
        if (mediaMenu > 40) {
            System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: " + mediaMenu + " euro     €€€\n"));
        }

        return mediaMenu;
    }

}











