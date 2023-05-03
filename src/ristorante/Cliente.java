package ristorante;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Cliente {
    private String name;
    private String surname;
    private boolean hasGotFideltyCard;
    private ArrayList<Cliente> clientFideltyList;
    private ArrayList<Cliente> clientList;
    private long fideltyCardNumber;

    public Cliente(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.hasGotFideltyCard = hasGotFideltyCard;
        this.clientFideltyList= new ArrayList<>();
        this.clientList=new ArrayList<>();
        this.fideltyCardNumber=0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getFideltyCardNumber() {
        return fideltyCardNumber;
    }

    public void addClientToClientList(Cliente cliente){
        clientList.add(cliente);
    }

    public void addClientToFideltyList(Cliente cliente){
        clientFideltyList.add(cliente);
        cliente.assignFideltyNumberCard(cliente);
    }
    public void assignFideltyNumberCard(Cliente cliente){
        Random rd = new Random();
        if(cliente.hasGotFideltyCard==false) {
            this.fideltyCardNumber = rd.nextLong(99999999);
            hasGotFideltyCard=true;
        }
        if(cliente.hasGotFideltyCard==true){
            System.out.println("La fidelty card di questo cliente è la numero "+fideltyCardNumber);
        }
        //Mettiamo un massimo di 8 cifre e lo facciamo essere sempre positivo
        if(fideltyCardNumber<0){
            fideltyCardNumber=fideltyCardNumber*-1;
        }
    }
    public void findClientByNameAndSurname(){
        System.out.println("Per favore inserisca il nome del cliente da cercare");
        name=input.nextLine();
        System.out.println("Per favore inserisca il cognome del cliente da cercare");
        surname=input.nextLine();
        for(Cliente cliente:clientList){
            String nameTrim= name.trim().toLowerCase();
            String surnameTrim=surname.trim().toLowerCase();
            String clientNameTrim= cliente.getName().trim().toLowerCase();
            String clientSurnameTrim= cliente.getSurname().trim().toLowerCase();
            if(clientNameTrim.equals(nameTrim)&&clientSurnameTrim.equals(surnameTrim)){
                System.out.println("Il cliente che stai cercando è "+ cliente.getName()+" "+cliente.getSurname()+" e il numero della sua fidelty card è "+fideltyCardNumber);
            }else{
                System.out.println("Ci dispiace ma non esiste nessun cliente dal nome "+name+ " "+surname);
            }
        }
    }

    Scanner input = new Scanner(System.in);
}
