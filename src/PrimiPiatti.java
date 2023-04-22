import Enums.Utility;

public class PrimiPiatti extends Portata {

    //TODO inseriamo un field

    //TODO sistamare
    private Stagioni stagioni;
    public PrimiPiatti(String nome, Double prezzo, String ingredienti) {
        super(nome, prezzo, ingredienti);
    }

    //TODO mettiamo tutti in classi esterne
    public enum Stagioni{ESTATE,AUTUNNO,INVERNO,PRIMAVERA,FUORI_MENU;}

    public void disponibilitàStagionale(Stagioni stagione){

        switch (stagione){

            case ESTATE -> System.out.println(Utility.WHITE_CAPITAL.getFormat()+getNome()+": contiene solo ingredienti freschi");
            case PRIMAVERA -> System.out.println(Utility.WHITE_CAPITAL.getFormat()+getNome()+": gli insaccati sono stagionati da almeno 3 mesi");
            case AUTUNNO -> System.out.println(Utility.WHITE_CAPITAL.getFormat()+getNome()+": alcuni formati di pasta a seconda della disponibilità potranno essere surgelati");
            case INVERNO -> System.out.println(Utility.WHITE_CAPITAL.getFormat()+getNome()+": verdure e alcuni formati di pasta a seconda della disponibilità potranno essere surgelati ");
            default -> System.out.println(Utility.WHITE_CAPITAL.getFormat()+getNome()+": il piatto è fuori menù");
        }
        System.out.println("\n");

   }
}




