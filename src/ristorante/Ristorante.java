package ristorante;

import enumartion.UtilityEnum;
import portate.Portata;

import java.util.List;

public class Ristorante {

    private String nome;
    private String indirizzo;
    private Integer voto;
    private Boolean hasJustEat;
    private List<Menu> menuList;

    public Ristorante(String nome, String indirizzo, Boolean hasJustEat) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.hasJustEat = hasJustEat;
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

    public void printRistorante(Menu menu){

        System.out.println(nome+"\n"+" \uD83D\uDFE2⚪\uD83D\uDD34");
        System.out.println(UtilityEnum.PURPLE_BOLD.getFormat() + menu.getNome() + "\n");

        for (Menu menus : menuList){
            menus.prezzoMedioMenu();
        }
    }


}
