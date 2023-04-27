import Enums.UtilityEnum;

import java.util.*;

public class Menu {
    private String nome;
    private String tipo;
    private ArrayList<Portata> portataList;


    public Menu(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.portataList = new ArrayList<>();
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
    public ArrayList<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(ArrayList<Portata> portataList) {
        this.portataList = portataList;
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    public void removePortata(Portata portata) {
        portataList.remove(portata);
    }


    //TODO sistemare


//    public void printMenu(){
//
//        for (Portata portata : portataList) {
//            if (portata instanceof Antipasti){
//                System.out.println("\n");
//                portata.printInfo(UtilityEnum.BLUE.getFormat(), UtilityEnum.BLUE_UNDERLINED.getFormat());}
//            if (portata instanceof PrimiPiatti){
//                System.out.println("\n");
//                portata.printInfo(UtilityEnum.PURPLE.getFormat(), UtilityEnum.PURPLE_UNDERLINED.getFormat());};
//            if (portata instanceof SecondiPiatti){
//                System.out.println("\n");
//                portata.printInfo(UtilityEnum.GREEN.getFormat(),UtilityEnum.GREEN_UNDERLINED.getFormat());};
//            if (portata instanceof  Dolci){
//                System.out.println("\n");
//                portata.printInfo(UtilityEnum.YELLOW.getFormat(), UtilityEnum.YELLOW_UNDERLINED.getFormat());};
//            if (portata instanceof Bevande){
//                System.out.println("\n");
//                portata.printInfo(UtilityEnum.CYAN.getFormat(), UtilityEnum.CYAN_UNDERLINED.getFormat());}
//
//        }
//    }
public void printMenu(){
    System.out.println(UtilityEnum.BLUE.getFormat() + "Antipasti: " + "\n");
    for (Portata portata : portataList) {
        if (portata instanceof Antipasti) {
            portata.printInfo(UtilityEnum.BLUE_CAPITAL.getFormat(), UtilityEnum.BLUE.getFormat());
        }
    }
    System.out.println(UtilityEnum.PURPLE.getFormat() + "\n" + "Primi: " + "\n");
    for (Portata portata : portataList){
        if (portata instanceof PrimiPiatti){
            portata.printInfo(UtilityEnum.PURPLE_CAPITAL.getFormat(), UtilityEnum.PURPLE.getFormat());};
    }
    System.out.println(UtilityEnum.GREEN.getFormat() + "\n" + "Secondi: " + "\n");
    for (Portata portata : portataList){
        if (portata instanceof SecondiPiatti){
            portata.printInfo(UtilityEnum.GREEN_CAPITAL.getFormat(),UtilityEnum.GREEN.getFormat());
        }
    }
    System.out.println(UtilityEnum.YELLOW.getFormat() + "\n" + "Dolci: " + "\n");
    for (Portata portata : portataList){
        if (portata instanceof  Dolci){
            portata.printInfo(UtilityEnum.YELLOW_CAPITAL.getFormat(), UtilityEnum.YELLOW.getFormat());};
    }
    System.out.println(UtilityEnum.CYAN.getFormat() + "\n" + "Bevande: " + "\n");
    for (Portata portata : portataList){
        if (portata instanceof Bevande){
            portata.printInfo(UtilityEnum.CYAN_CAPITAL.getFormat(), UtilityEnum.CYAN.getFormat());}
    }


}


    public void prezzoMedioMenu() {

        double mediaMenu = 0.0;

        for (Portata portata : portataList) {
            mediaMenu += portata.getPrezzo();
        }
        mediaMenu = (Math.round(mediaMenu / portataList.size() * 100.0) / 100.0);
        mediaMenu=Math.round(mediaMenu);

        // Oppure un altro metodo -> double
        //mediaMenu = menuList.stream().mapToDouble(Portata::getPrezzo).sum()/menuList.size();

        if (mediaMenu >= 0 && mediaMenu <= 20) {

            System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: " + mediaMenu + " euro     €\n"));
        }
        if (mediaMenu > 20 && mediaMenu <= 40) {
            System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: " + mediaMenu + " euro     €€\n"));
        }
        if (mediaMenu > 40) {
            System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo medio del " + this.getNome() + " è: " + mediaMenu + " euro     €€€\n"));
        }


    }

}











