import Enums.UtilityEnum;


public class Main {
    public static void main(String[] args) {

        // NOME DEL RISTORANTE
        System.out.println("La Taverna dei Programmatori\n");

        Menu menu = new Menu("Menù del giorno", "onnivoro");
        System.out.println(UtilityEnum.PURPLE_BOLD.getFormat() + menu.getNome() + "\n");

        //TODO sistemare

        Portata antipasto1 = new Antipasti("Caprese", 5.00, "Mozzarella fior di latte, Pomodoro", true);
        Portata antipasto2 = new Antipasti("Tagliere di salumi e formaggi", 10.00, "Prosciutto cotto, Prosciutto crudo, Provola affumicata, Caprino", false);
        Portata antipasto3 = new Antipasti("Frittura di verdure miste", 6.00, "Pastella, Cavolfiori, Zucchine, Melanzane, Carciofi", true);
        Portata antipasto4 = new Antipasti("Anelli di cipolla", 5.00, "Pastella, Cipolla", false);
        Portata antipasto5 = new Antipasti("Antipasto della casa", 7.00, "Olive, Ricotta, Salame, Funghi sott'olio", true);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);
        menu.addPortata(antipasto4);
        menu.addPortata(antipasto5);

//        antipasto1.printInfo("\033[0;34m", "\033[0;34m");
//        ((Antipasti)antipasto1).provenienzeKmZero();

        antipasto1.printMenu(menu);


        PrimiPiatti primo1 = new PrimiPiatti("Lasagne alla Bolognese", 12.0, "Pasta fresca, ragù di carne,besciamella");
        PrimiPiatti primo2 = new PrimiPiatti("Bucatini alla amatriciana", 11.0, "Pasta fresca,pomodoro,guanciale,pecorino");
        PrimiPiatti primo3 = new PrimiPiatti("Tortellini con panna", 14.0, "Pasta fresca,carne macinata,panna");
        PrimiPiatti primo4 = new PrimiPiatti("Pennette alla vodka", 10.0, "Pasta fresca,pomodoro,pancetta,vodka");
        PrimiPiatti primo5 = new PrimiPiatti("Trofie al pesto genovese", 10.0, "Pasta fresca,basilico,pinoli,grana padano");

        menu.addPortata(primo1);
        menu.addPortata(primo2);
        menu.addPortata(primo3);
        menu.addPortata(primo4);
        menu.addPortata(primo5);



        primo1.disponibilitàStagionale(PrimiPiatti.Stagioni.ESTATE);
        primo5.disponibilitàStagionale(PrimiPiatti.Stagioni.INVERNO);
        primo2.disponibilitàStagionale(PrimiPiatti.Stagioni.FUORI_MENU);

        SecondiPiatti secondo1 = new SecondiPiatti("Carpaccio di filetto con rucola e scaglie di parmigiano", 12.00, "carne,verdura,formaggio",false);
        SecondiPiatti secondo2 = new SecondiPiatti("Grigliata di scampi e gamberi", 16.0, "crostacei,pesce",false);
        SecondiPiatti secondo3 = new SecondiPiatti("Impepata di cozze", 12.0, "molluschi",false);
        SecondiPiatti secondo4 = new SecondiPiatti("Filetto di manzo alla tartara", 13.0, "carne",false);
        SecondiPiatti secondo5 = new SecondiPiatti("Nodino di vitello alla griglia", 13.0, "carne",false);

        menu.addPortata(secondo1);
        menu.addPortata(secondo2);
        menu.addPortata(secondo3);
        menu.addPortata(secondo4);
        menu.addPortata(secondo5);


        secondo1.contieneAllergeni();
        secondo3.contieneAllergeni();

        Portata dolci1 = new Dolci("Tiramisù", 12.5, "Mascarpone,uova,savoiardi,zucchero,caffè,cacao amaro", "senza lattesio");
        Portata dolci2 = new Dolci("Torta della nonna", 9.0, "Burro,zucchero,uova,latte intero,farina,pinoli", "senza lattesio");
        Portata dolci3 = new Dolci("Gelato", 2.0, "Latte condensato, frutta fresca,vaniglia,scaglie di cioccolato ", "senza lattesio");
        Portata dolci4 = new Dolci("Panna Cotta", 5.0, "Caffè,zucchero,baccello di vaniglia,panna fresco liquida", "senza lattesio");
        Portata dolci5 = new Dolci("Macedonia di frutta", 7.0, "Fragole,kiwi,uva,melone,pesca,succo di limone,zucchero semolato", "senza lattesio");


        menu.addPortata(dolci1);
        menu.addPortata(dolci2);
        menu.addPortata(dolci3);
        menu.addPortata(dolci4);
        menu.addPortata(dolci5);
       // dolci1.printMenu(menu);
        

        Bevande bevanda1 = new Bevande("Acqua naturale", 1d, "Acqua", false);
        Bevande bevanda2 = new Bevande("Acqua frizzante", 1d, "Acqua, bollicine", false);
        Bevande bevanda3 = new Bevande("Sprite", 3d, "Acqua, zucchero, anidride carbonica, acido citrico edulcoranti acesulfame K, aspartame e neoesperidina DC, correttore di acidità citrato trisodico,lime", false);
        Bevande bevanda4 = new Bevande("Coca cola", 3d, "Acqua, anidride carbonica, zucchero, colorante caramello,aromi naturali, caffeina e acido fosforico", false);
        Bevande bevanda5 = new Bevande("Vino", 100d, "Glicerolo,Acido tartarico,Acido malico,Acido lattico,Acido acetico,Zuccheri", true);


        menu.addPortata(bevanda1);
        menu.addPortata(bevanda2);
        menu.addPortata(bevanda3);
        menu.addPortata(bevanda4);
        menu.addPortata(bevanda5);

        menu.prezzoMedioMenu();
    }
}
