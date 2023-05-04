package ristorante;

import enumartion.UtilityEnum;
import portate.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ristorante {

    private String nome;
    private String indirizzo;
    private Integer voto;
    private boolean hasJustEat;
    private List<Menu> menuList;

    public Ristorante(String nome, String indirizzo, Boolean hasJustEat) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.hasJustEat = hasJustEat;
        this.menuList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public Boolean getHasJustEat() {
        return hasJustEat;
    }

    public void setHasJustEat(Boolean hasJustEat) {
        this.hasJustEat = hasJustEat;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void removeMenu(Menu menu) {
        menuList.remove(menu);
    }

    public void printRistorante(){
        for (Menu menus : menuList){
        System.out.println(nome+"\n"+" \uD83D\uDFE2⚪\uD83D\uDD34");
        System.out.println(UtilityEnum.PURPLE_BOLD.getFormat() + menus.getNome() + "\n");

            menus.printMenu();
           // menus.prezzoMedioMenu();
            menus.reimpostaPrezzoMedio();
        }

    }

    public void printBundleportata(Menu menu){

        List<Antipasti> antipastiList = menu.getPortataList().stream()
                .filter(portata -> portata instanceof Antipasti)//dalla PortataList con filter si selezionano solo i tipi Antipasti
                .map(p -> (Antipasti) p)//con map si effettua il downcast alla sottoclasse antipasti
                .toList();//con toList si popola la lista
        List<PrimiPiatti> primiPiattiList = menu.getPortataList().stream()
                .filter(portata -> portata instanceof PrimiPiatti)
                .map(p -> (PrimiPiatti) p)
                .toList();
        List<SecondiPiatti> secondiPiattiList = menu.getPortataList().stream()
                .filter(portata -> portata instanceof SecondiPiatti)
                .map(p -> (SecondiPiatti) p)
                .toList();
        List<Dolci> dolciList = menu.getPortataList().stream()
                .filter(portata -> portata instanceof Dolci)
                .map(p -> (Dolci) p)
                .toList();
        List<Bevande> bevandeList = menu.getPortataList().stream()
                .filter(portata -> portata instanceof Bevande)
                .map(p -> (Bevande) p)
                .toList();

        Random random = new Random();

        List<Portata> bundlePortata = new ArrayList<>();
        Portata antipastoBundle = antipastiList.get(random.nextInt(antipastiList.size()));            //da ogni lista si sceglie un piatto casuale
        Portata primipiattiBundle = primiPiattiList.get(random.nextInt(primiPiattiList.size()));
        Portata secondipiattiBundle = secondiPiattiList.get(random.nextInt(secondiPiattiList.size()));
        Portata dolciBundle = dolciList.get(random.nextInt(dolciList.size()));
        Portata bevandeBundle = bevandeList.get(random.nextInt(bevandeList.size()));

        bundlePortata.add(antipastoBundle);
        bundlePortata.add(primipiattiBundle);
        bundlePortata.add(secondipiattiBundle);
        bundlePortata.add(dolciBundle);
        bundlePortata.add(bevandeBundle);

        System.out.println("Il menù a prezzo fisso di oggi è:\n "+
                "\n Antipasto: "+bundlePortata.get(0).getNome()+
                "\n Primo: "+bundlePortata.get(1).getNome()+
                "\n Secondo: "+bundlePortata.get(2).getNome()+
                "\n Dolce: "+bundlePortata.get(3).getNome()+
                "\n Bevanda: "+bundlePortata.get(4).getNome());
    }

    public void consegnaJustEat (Menu menu){

        if (hasJustEat==true){

            if (menu.prezzoMedioMenu() >= 0 && menu.prezzoMedioMenu() <= 20) {

                System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è gratuito    \n"));
            }
            if (menu.prezzoMedioMenu() > 20 && menu.prezzoMedioMenu() <= 40) {
                System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è: " + menu.prezzoMedioMenu()/25 + " euro    \n"));
            }
            if (menu.prezzoMedioMenu() > 40) {
                System.out.println(UtilityEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è: " + menu.prezzoMedioMenu()/15 + " euro    \n"));
            }

        }


    }

}
