import java.util.*;

public class Menu {

    private String nome;
    private String tipo;

    private ArrayList<Portata> portataList;


    //TODO stampiamo nome e tipo
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

    public void prezzoMedioMenu(Menu menu) {
        List<Portata> menuList = new ArrayList<>();
        portataList.addAll(getPortataList());
//        menuList.addAll(primiPiattiList);
//        menuList.addAll(secondiPiattiList);
//        menuList.addAll(dolciList);
//        menuList.addAll(bevandeList);
        double mediaMenu = 0.0;

        for (Portata portata : menuList) {
            mediaMenu += portata.getPrezzo();
        }
        mediaMenu = (Math.round(mediaMenu / menuList.size() * 100.0) / 100.0);

        // Oppure un altro metodo -> double
        //mediaMenu = menuList.stream().mapToDouble(Portata::getPrezzo).sum()/menuList.size();

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











