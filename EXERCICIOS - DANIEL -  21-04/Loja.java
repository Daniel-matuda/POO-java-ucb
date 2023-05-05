package application;

import classes.Livros;
import classes.CDs;
import classes.DVDs;

public class Loja {

    public static void main(String[] args) {
        Livros li1 = new Livros ("Percy Jackson - O Ladrao de Raios", 44.90, "Rick Riordan");
        System.out.println(li1.toString());
        Livros li2 = new Livros ("O Lar Da Srta. Peregrine Para Crianças Peculiares", 39, "Ransom Riggs");
        System.out.println("\n" + li2.toString());
        CDs cd1 = new CDs ("Limbo", 184.90, 14);
        System.out.println("\n" + cd1.toString());
        CDs cd2 = new CDs ("Good For You", 213.22, 15);
        System.out.println("\n" + cd2.toString());
        DVDs dvd1 = new DVDs ("Corra!", 29.90, 104);
        System.out.println("\n" + dvd1.toString());
    }
}