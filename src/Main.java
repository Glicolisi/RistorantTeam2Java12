import enumartion.PosizioneEnum;
import enumartion.TypesEnum;
import enumartion.StagioniEnum;
import enumartion.TypesPortataEnum;
import portate.*;
import ristorante.Cliente;
import ristorante.Menu;
import ristorante.Ristorante;
import ristorante.Tavolo;


public class Main {
    public static void main(String[] args) {

        ristoranteProva();
    }


    public static void ristoranteProva() {

        Ristorante ristoranteProva = new Ristorante("La Taverna dei Programmatori", "Pizzo Calabro", TypesEnum.ONNIVORO,true);

        Menu menu = new Menu("Menù del giorno", TypesEnum.ONNIVORO, 0);

        Portata antipasto1 = new Antipasti("Caprese", 5.00, "Mozzarella fior di latte, Pomodoro", TypesPortataEnum.ANTIPASTO,true);
        Portata antipasto2 = new Antipasti("Tagliere di salumi e formaggi", 10.00, "Prosciutto cotto, Prosciutto crudo, Provola affumicata, Caprino", TypesPortataEnum.ANTIPASTO ,false);
        Portata antipasto3 = new Antipasti("Frittura di verdure miste", 6.00, "Pastella, Cavolfiori, Zucchine, Melanzane, Carciofi", TypesPortataEnum.ANTIPASTO,true);
        Portata antipasto4 = new Antipasti("Anelli di cipolla", 5.00, "Pastella, Cipolla", TypesPortataEnum.ANTIPASTO,false);
        Portata antipasto5 = new Antipasti("Antipasto della casa", 7.00, "Olive, Ricotta, Salame, Funghi sott'olio", TypesPortataEnum.ANTIPASTO,true);

        menu.addPortata(antipasto1);
        menu.addPortata(antipasto2);
        menu.addPortata(antipasto3);
        menu.addPortata(antipasto4);
        menu.addPortata(antipasto5);


        Portata primo1 = new PrimiPiatti("Lasagne alla Bolognese", 12.0, "Pasta fresca, ragù di carne,besciamella",TypesPortataEnum.PRIMOPIATTO, StagioniEnum.ESTATE);
        Portata primo2 = new PrimiPiatti("Bucatini alla amatriciana", 11.0, "Pasta fresca,pomodoro,guanciale,pecorino",TypesPortataEnum.PRIMOPIATTO, StagioniEnum.INVERNO);
        Portata primo3 = new PrimiPiatti("Tortellini con panna", 14.0, "Pasta fresca,carne macinata,panna", TypesPortataEnum.PRIMOPIATTO,StagioniEnum.AUTUNNO);
        Portata primo4 = new PrimiPiatti("Pennette alla vodka", 10.0, "Pasta fresca,pomodoro,pancetta,vodka", TypesPortataEnum.PRIMOPIATTO,StagioniEnum.FUORI_MENU);
        Portata primo5 = new PrimiPiatti("Trofie al pesto genovese", 10.0, "Pasta fresca,basilico,pinoli,grana padano", TypesPortataEnum.PRIMOPIATTO,StagioniEnum.PRIMAVERA);

        menu.addPortata(primo1);
        menu.addPortata(primo2);
        menu.addPortata(primo3);
        menu.addPortata(primo4);
        menu.addPortata(primo5);


        SecondiPiatti secondo1 = new SecondiPiatti("Carpaccio di filetto con rucola e scaglie di parmigiano", 12.00, "carne,verdura,formaggio", TypesPortataEnum.SECONDOPIATTO,false);
        SecondiPiatti secondo2 = new SecondiPiatti("Grigliata di scampi e gamberi", 16.0, "crostacei,pesce", TypesPortataEnum.SECONDOPIATTO,false);
        SecondiPiatti secondo3 = new SecondiPiatti("Impepata di cozze", 12.0, "molluschi", TypesPortataEnum.SECONDOPIATTO,false);
        SecondiPiatti secondo4 = new SecondiPiatti("Filetto di manzo alla tartara", 13.0, "carne", TypesPortataEnum.SECONDOPIATTO,false);
        SecondiPiatti secondo5 = new SecondiPiatti("Nodino di vitello alla griglia", 13.0, "carne",TypesPortataEnum.SECONDOPIATTO ,false);


        menu.addPortata(secondo1);
        menu.addPortata(secondo2);
        menu.addPortata(secondo3);
        menu.addPortata(secondo4);
        menu.addPortata(secondo5);


        Portata dolci1 = new Dolci("Tiramisù", 12.5, "Mascarpone,uova,savoiardi,zucchero,caffè,cacao amaro", TypesPortataEnum.DOLCE,false);
        Portata dolci2 = new Dolci("Torta della nonna", 9.0, "Burro,zucchero,uova,latte intero,farina,pinoli", TypesPortataEnum.DOLCE,false);
        Portata dolci3 = new Dolci("Gelato", 2.0, "Latte condensato, frutta fresca,vaniglia,scaglie di cioccolato ",TypesPortataEnum.DOLCE ,false);
        Portata dolci4 = new Dolci("Panna Cotta", 5.0, "Caffè,zucchero,baccello di vaniglia,panna fresco liquida", TypesPortataEnum.DOLCE,false);
        Portata dolci5 = new Dolci("Macedonia di frutta", 7.0, "Fragole,kiwi,uva,melone,pesca,succo di limone,zucchero semolato", TypesPortataEnum.DOLCE,false);


        menu.addPortata(dolci1);
        menu.addPortata(dolci2);
        menu.addPortata(dolci3);
        menu.addPortata(dolci4);
        menu.addPortata(dolci5);


        Portata bevanda1 = new Bevande("Acqua naturale", 1d, "Acqua", TypesPortataEnum.BEVANDA,false);
        Portata bevanda2 = new Bevande("Acqua frizzante", 1d, "Acqua, bollicine", TypesPortataEnum.BEVANDA,false);
        Portata bevanda3 = new Bevande("Sprite", 3d, "Acqua, zucchero, anidride carbonica, acido citrico edulcoranti acesulfame K, aspartame e neoesperidina DC, correttore di acidità citrato trisodico,lime", TypesPortataEnum.BEVANDA,false);
        Portata bevanda4 = new Bevande("Coca cola", 3d, "Acqua, anidride carbonica, zucchero, colorante caramello,aromi naturali, caffeina e acido fosforico", TypesPortataEnum.BEVANDA,false);
        Portata bevanda5 = new Bevande("Vino", 100d, "Glicerolo,Acido tartarico,Acido malico,Acido lattico,Acido acetico,Zuccheri", TypesPortataEnum.BEVANDA,true);


        menu.addPortata(bevanda1);
        menu.addPortata(bevanda2);
        menu.addPortata(bevanda3);
        menu.addPortata(bevanda4);
        menu.addPortata(bevanda5);

        Cliente cliente1 = new Cliente("Gianni","Fantoni");
        Cliente cliente2 = new Cliente("Aldo","Baglio");
        Cliente cliente3 = new Cliente("Robby","Scansatore");

        Tavolo tavoloVegetariano = new Tavolo(2, PosizioneEnum.PRIVATO,TypesEnum.VEGETARIANO,true,5);

        ristoranteProva.addMenu(menu);

        tavoloVegetariano.getClienteList().add(cliente1);
        tavoloVegetariano.getClienteList().add(cliente2);
        tavoloVegetariano.getClienteList().add(cliente3);

        ristoranteProva.prenotaTavolo(tavoloVegetariano,cliente1);

        ristoranteProva.printRistorante();

        ristoranteProva.printMenuSorpresa();

        ristoranteProva.consegnaJustEat(menu);


    }
}
