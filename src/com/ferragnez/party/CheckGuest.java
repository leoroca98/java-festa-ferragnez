package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creo una lista

        String[] invitati={"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // chiediamo all'utente come si chiama

        System.out.print("Inserisci il tuo nome e cognome : ");
        String name = scanner.nextLine();
        // verifichiamo se l'utente è nella lista
        boolean presente=false;
        int i=0;
        while(!presente && i<invitati.length){
            if(invitati[i].equals(name)){
                presente=true;
                break;
            }
            i++;
        }

        if(presente) {
            System.out.println(name+" presente nella lista");

        }else {
            System.out.println(name+" non presente nella lista");
        }
    }
}