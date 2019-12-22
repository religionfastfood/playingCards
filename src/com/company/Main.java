package com.company;

public class Main {

    public static void main(String[] args) {

        CardDeck myDeck = new CardDeck();

        System.out.println();
        System.out.println("*******PRINTING FRESH DECK******");
        myDeck.printDeck();

        System.out.println();
        System.out.println("*********SHUFFLING DECK*********");
        myDeck.shuffleDeck();

        System.out.println();
        System.out.println("*****PRINTING SHUFFLED DECK*****");
        myDeck.printDeck();

        System.out.println();
        System.out.println("********SORTING BY RANK*********");
        myDeck.sortDeckByRank();

        System.out.println();
        System.out.println("*****PRINTING SORTED DECK********");
        myDeck.printDeck();

        System.out.println();
        System.out.println("*****SORTING BY SUIT THEN RANK******");
        myDeck.sortDeckBySuitAndRank();

        System.out.println();
        System.out.println("*********PRINTING SORTED DECK*******");
        myDeck.printDeck();

    }
}
