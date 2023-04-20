import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Menu menu = new Menu("Menù del giorno", "onnivoro");
        System.out.println(Utility.PURPLE_BOLD.getFormat() + menu.getNome()+"\n");


        Antipasti antipasto1 = new Antipasti("Caprese", 5.00, "Mozzarella fior di latte, Pomodoro");
        Antipasti antipasto2 = new Antipasti("Tagliere di salumi e formaggi", 10.00, "Prosciutto cotto, Prosciutto crudo, Provola affumicata, Caprino");
        Antipasti antipasto3 = new Antipasti("Frittura di verdure miste", 6.00, "Pastella, Cavolfiori, Zucchine, Melanzane, Carciofi");
        Antipasti antipasto4 = new Antipasti("Anelli di cipolla", 5.00, "Pastella, Cipolla");
        Antipasti antipasto5 = new Antipasti("Antipasto della casa", 7.00, "Olive, Ricotta, Salame, Funghi sott'olio");

        menu.addAntipasto(antipasto1);
        menu.addAntipasto(antipasto2);
        menu.addAntipasto(antipasto3);
        menu.addAntipasto(antipasto4);
        menu.addAntipasto(antipasto5);
        menu.printAntipasti();



        PrimiPiatti primo1 = new PrimiPiatti("Lasagne alla Bolognese", 12.0,"Pasta fresca, ragù di carne,besciamella");
        PrimiPiatti primo2 = new PrimiPiatti("Bucatini alla amatriciana", 11.0,"Pasta fresca,pomodoro,guanciale,pecorino");
        PrimiPiatti primo3 = new PrimiPiatti("Tortellini con panna", 14.0,"Pasta fresca,carne macinata,panna");
        PrimiPiatti primo4 = new PrimiPiatti("Pennette alla vodka", 10.0,"Pasta fresca,pomodoro,pancetta,vodka");
        PrimiPiatti primo5 = new PrimiPiatti("Trofie al pesto genovese", 10.0,"Pasta fresca,basilico,pinoli,grana padano");


        menu.addPrimo(primo1);
        menu.addPrimo(primo2);
        menu.addPrimo(primo3);
        menu.addPrimo(primo4);
        menu.addPrimo(primo5);

        menu.printPrimi();



        SecondiPiatti secondo1 = new SecondiPiatti("Carpaccio di filetto con rucola e scaglie di parmigiano", 12.00,"carne,verdura,formaggio");
        SecondiPiatti secondo2 = new SecondiPiatti("Grigliata di scampi e gamberi", 16.0,"crostacei,pesce");
        SecondiPiatti secondo3 = new SecondiPiatti("Impepata di cozze", 12.0,"molluschi");
        SecondiPiatti secondo4 = new SecondiPiatti("Filetto di manzo alla tartara", 13.0,"carne");
        SecondiPiatti secondo5 = new SecondiPiatti("Nodino di vitello alla griglia", 13.0,"carne");

        menu.addSecondo(secondo1);
        menu.addSecondo(secondo2);
        menu.addSecondo(secondo3);
        menu.addSecondo(secondo4);
        menu.addSecondo(secondo5);
        menu.printSecondi();



        Dolci dolci1 = new Dolci("Tiramisù", 12.5,"Mascarpone,uova,savoiardi,zucchero,caffè,cacao amaro");
        Dolci dolci2 = new Dolci("Torta della nonna", 9.0,"Burro,zucchero,uova,latte intero,farina,pinoli");
        Dolci dolci3 = new Dolci("Gelato", 2.0,"Latte condensato, frutta fresca,vaniglia,scaglie di cioccolato ");
        Dolci dolci4 = new Dolci("Panna Cotta", 5.0,"Caffè,zucchero,baccello di vaniglia,panna fresco liquida");
        Dolci dolci5 = new Dolci("Macedonia di frutta", 7.0,"Fragole,kiwi,uva,melone,pesca,succo di limone,zucchero semolato");
        menu.addDolce(dolci1);
        menu.addDolce(dolci2);
        menu.addDolce(dolci3);
        menu.addDolce(dolci4);
        menu.addDolce(dolci5);


        menu.printDolci();



        /*Bevande bevanda1 = new Bevande("Acqua naturale", 1d);
        Bevande bevanda2 = new Bevande("Acqua frizzante", 1d);
        Bevande bevanda3 = new Bevande("Sprite", 3d);
        Bevande bevanda4 = new Bevande("Coca cola", 3d);
        Bevande bevanda5 = new Bevande("Vino", 100d);

        Bevande bevanda1 = new Bevande("Acqua naturale",1d,"Acqua");
        Bevande bevanda2 = new Bevande("Acqua frizzante", 1d,"Acqua, bollicine");
        Bevande bevanda3 = new Bevande("Sprite", 3d,"Acqua, zucchero, anidride carbonica, acido citrico edulcoranti acesulfame K, aspartame e neoesperidina DC, correttore di acidità citrato trisodico,lime");
        Bevande bevanda4 = new Bevande("Coca cola", 3d,"Acqua, anidride carbonica, zucchero, colorante caramello,aromi naturali, caffeina e acido fosforico");
        Bevande bevanda5 = new Bevande("Vino", 100d,"Glicerolo,Acido tartarico,Acido malico,Acido lattico,Acido acetico,Zuccheri");


        menu.addBevanda(bevanda1);
        menu.addBevanda(bevanda2);
        menu.addBevanda(bevanda3);
        menu.addBevanda(bevanda4);
        menu.addBevanda(bevanda5);

        menu.printBevande();
*/
        menu.prezzoMedioMenu(menu);
        SecondiPiatti.contieneAllergeni(secondo2);
        SecondiPiatti.contieneAllergeni(secondo3);
    }
}
