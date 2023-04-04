package Models;

import java.util.*;

public class PrimiPiatti {

private Map<String,Double> Primi= new HashMap<>() ;

private String nomePrimi;
private Double prezzoPrimi;



    public void print_Menu(){

        System.out.println("I Primi Piatti sono:");

        for(Map.Entry<String,Double> primi : getPrimiPiatti().entrySet()){


            System.out.println(primi.getKey()+" = "+primi.getValue()+" Euro");


        }

    }
}
