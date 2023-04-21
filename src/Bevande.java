import javax.sound.sampled.Port;
import java.util.HashMap;
import java.util.Map;

public class Bevande extends Portate {
    public boolean isAlcholic;
    public Bevande(String nome, Double prezzo, String ingredienti, boolean isAlcholic) {
        super(nome, prezzo, ingredienti);
        this.isAlcholic=isAlcholic;
    }

    public boolean isAlcholic() {
        return isAlcholic;
    }

    public void setAlcholic(boolean alcholic) {
        isAlcholic = alcholic;
    }
    public void checkAlchol(boolean isAlcholic){
        if (isAlcholic==true) {
            System.out.print("This item contains alchol");
        }else {
            System.out.println("This item does not contain alchol");
        }
    }
}






