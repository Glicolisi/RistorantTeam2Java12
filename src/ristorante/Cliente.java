package ristorante;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Cliente {
    private String name;
    private String surname;
    private boolean hasGotFideltyCard;

    //TODO inseriamo il tipo

    //TODO eliminare non si deve fare nel linguaggio ad oggetti
    private ArrayList<Cliente> clientFideltyList;
    private ArrayList<Cliente> clientList;
    private long fideltyCardNumber;

    public Cliente(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.hasGotFideltyCard = hasGotFideltyCard;
        this.clientFideltyList = new ArrayList<>();
        this.clientList = new ArrayList<>();
        this.fideltyCardNumber = 0;
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

    public void addClientToClientList(Cliente cliente) {
        clientList.add(cliente);
    }

    public void addClientToFideltyList(Cliente cliente) {
        clientFideltyList.add(cliente);
        cliente.assignFideltyNumberCard(cliente);
    }

    public void assignFideltyNumberCard(Cliente cliente) {
        Random rd = new Random();
        if (cliente.hasGotFideltyCard == false) {
            this.fideltyCardNumber = rd.nextLong(99999999);
            hasGotFideltyCard = true;
        }
        if (cliente.hasGotFideltyCard == true) {
            System.out.println("La fidelty card di questo cliente è la numero " + fideltyCardNumber);
        }
        //Mettiamo un massimo di 8 cifre e lo facciamo essere sempre positivo
        if (fideltyCardNumber < 0) {
            fideltyCardNumber = fideltyCardNumber * -1;
        }
    }

    public void findClientByNameAndSurname() {
        //TODO rivediamo
        for (Cliente cliente : clientList) {
            String nameTrim = this.name.trim().toLowerCase();
            String surnameTrim = this.surname.trim().toLowerCase();
            String clientNameTrim = cliente.getName().trim().toLowerCase();
            String clientSurnameTrim = cliente.getSurname().trim().toLowerCase();
            if (clientNameTrim.equals(nameTrim) && clientSurnameTrim.equals(surnameTrim)) {
                System.out.println("Il cliente che stai cercando è " + cliente.getName() +
                        " " + cliente.getSurname() + " e il numero della sua fidelty card è " + fideltyCardNumber);
            } else {
                System.out.println("Ci dispiace ma non esiste nessun cliente dal nome " + this.name + " " + this.surname);
            }
        }
    }

}
