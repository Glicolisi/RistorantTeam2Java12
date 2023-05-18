package ristorante;

import enumartion.ColorsEnum;
import enumartion.TypesEnum;
import portate.*;

import java.util.*;

public class Ristorante {

    private final TypesEnum tipo;
    private List<Menu> menuList;
    private Map<Tavolo, Cliente> prenotazioniMap;
    private List<Cliente> clienteList;
    private String nome;
    private String indirizzo;
    private Integer voto;
    private boolean justEat;
    private Integer postiMassimi;


    public Ristorante(String nome, String indirizzo, TypesEnum tipo, Boolean justEat, Integer postiMassimi) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.tipo = tipo;
        this.justEat = justEat;
        this.postiMassimi = postiMassimi;
        this.clienteList = new ArrayList<>();
        this.menuList = new ArrayList<>();
        this.prenotazioniMap = new HashMap<>();
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

    public TypesEnum getTipo() {
        return tipo;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public boolean isjustEat() {
        return justEat;
    }

    public Integer getPostiMassimi() {
        return postiMassimi;
    }

    public void setJustEat(boolean justEat) {
        this.justEat = justEat;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public Map<Tavolo, Cliente> getTavoloListMap() {
        return prenotazioniMap;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void removeMenu(Menu menu) {
        menuList.remove(menu);
    }

    public void printRistorante() {
        for (Menu menus : menuList) {
            System.out.println(nome + "\n" + " \uD83D\uDFE2⚪\uD83D\uDD34");
            System.out.println("il numero di posti liberi è " + ColorsEnum.RED.getFormat() +  postiMassimi + "\n");
            System.out.println(ColorsEnum.PURPLE_BOLD.getFormat() + menus.getNome() + "\n");

            menus.printMenu();
            menus.printPrezzoMedioMenu();
            menus.reimpostaPrezzoMedio();
            printMenuSorpresa();
            consegnaJustEat(menus);
            printPrenotazione();

        }

    }


    /**
     * Metodo per creare e stampare un menu a sorpresa scegliendo tra i menu del ristorante
     */

    public void printMenuSorpresa() {

        Random random = new Random();

        List<Antipasti> antipastiList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof Antipasti)
                .map(p -> (Antipasti) p)
                .toList();
        List<PrimiPiatti> primiPiattiList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof PrimiPiatti)
                .map(p -> (PrimiPiatti) p)
                .toList();
        List<SecondiPiatti> secondiPiattiList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof SecondiPiatti)
                .map(p -> (SecondiPiatti) p)
                .toList();
        List<Dolci> dolciList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof Dolci)
                .map(p -> (Dolci) p)
                .toList();
        List<Bevande> bevandeList = getMenuList().get(random.nextInt(getMenuList().size()))
                .getPortataList().stream()
                .filter(portata -> portata instanceof Bevande)
                .map(p -> (Bevande) p)
                .toList();


        List<Portata> bundlePortata = new ArrayList<>();
        Portata antipastoBundle = antipastiList.get(random.nextInt(antipastiList.size()));
        Portata primipiattiBundle = primiPiattiList.get(random.nextInt(primiPiattiList.size()));
        Portata secondipiattiBundle = secondiPiattiList.get(random.nextInt(secondiPiattiList.size()));
        Portata dolciBundle = dolciList.get(random.nextInt(dolciList.size()));
        Portata bevandeBundle = bevandeList.get(random.nextInt(bevandeList.size()));

        bundlePortata.add(antipastoBundle);
        bundlePortata.add(primipiattiBundle);
        bundlePortata.add(secondipiattiBundle);
        bundlePortata.add(dolciBundle);
        bundlePortata.add(bevandeBundle);

        System.out.println("Il menù a sorpresa di oggi è:\n " +
                "\n Antipasto: " + bundlePortata.get(0).getNome() +
                "\n Primo: " + bundlePortata.get(1).getNome() +
                "\n Secondo: " + bundlePortata.get(2).getNome() +
                "\n Dolce: " + bundlePortata.get(3).getNome() +
                "\n Bevanda: " + bundlePortata.get(4).getNome() + "\n");
    }

    /**
     * Metodo che verifica se un menu ha la consegna con justeat
     *
     * @param menu
     */

    public void consegnaJustEat(Menu menu) {

        if (isjustEat()) {
            if (menu.prezzoMenu() >= 0 && menu.prezzoMenu() <= 20) {
                System.out.println(ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è gratuito    \n"));
            }
            if (menu.prezzoMenu() > 20 && menu.prezzoMenu() <= 40) {
                System.out.println(ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è: " + menu.prezzoMenu() / 25 + " euro    \n"));
            }
            if (menu.prezzoMenu() > 40) {
                System.out.println(ColorsEnum.ANSI_RESET.getFormat() + ("Il prezzo di consegna è: " + menu.prezzoMenu() / 15 + " euro    \n"));
            }
        }

    }


    public void findClientByNameAndSurname(String name, String surname) {
        for (Cliente cliente : clienteList) {
            String clientNameTrim = cliente.getName().trim().toLowerCase();
            String clientSurnameTrim = cliente.getSurname().trim().toLowerCase();           //Ho iterato nella lista tenendo in considerazione i vari errori possibili
            if (clientNameTrim.equals(cliente.getName()) && clientSurnameTrim.equals(cliente.getSurname())) {
                System.out.println("Il cliente che stai cercando è " + cliente.getName() +
                        " " + cliente.getSurname() + " e il numero della sua fidelty card è " + cliente.getFideltyCardNumber());

            } else {
                System.out.println("Ci dispiace ma non esiste nessun cliente dal nome " + name + " " + surname);
            }
        }
    }



    public void addCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        clienteList.remove(cliente);
    }

    public void prenotaTavolo(Tavolo tavolo, Cliente cliente) {


        if (postiMassimi >= 0) {
            if (!tavolo.isPrenotazione()) {
                if (cliente.getNumeroPersone() <= tavolo.getNumeroMaxClienti()) {
                    postiMassimi -= cliente.getNumeroPersone();
                    prenotazioniMap.put(tavolo, cliente);
                    System.out.println("La sua prenotazione è stata accettata.");
                } else {
                    System.out.println("Il tavolo selezionato non può ospitare il numero di clienti specificato.");
                }
            } else {
                System.out.println("Il tavolo selezionato è già prenotato.");
            }
        } else {
            System.out.println("Il ristorante ha raggiunto la massima capienza");
        }
    }



    public void annullaPrenotazione(Tavolo tavolo) {

        if (tavolo.isPrenotazione()) {
            prenotazioniMap.remove(tavolo);
            tavolo.setPrenotazione(false);
        } else {
            System.out.println("Il tavolo selezionato non è prenotato.");
        }
    }

    public void printPrenotazione(){
        for(Map.Entry<Tavolo, Cliente> entry: prenotazioniMap.entrySet()){
            System.out.println("Il tavolo prenotato è il " + entry.getKey().getNumero() + " per il cliente " + entry.getValue().getSurname());
        }
    }
}
