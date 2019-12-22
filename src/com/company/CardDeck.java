package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private List<PlayingCard> deck = new ArrayList<PlayingCard>();


    public CardDeck(){
        resetDeck();
    }

    public void printDeck(){
        System.out.println("Number of cards in deck: " + deck.size());
        for(PlayingCard aCard : deck){
            System.out.println(aCard);
        }
    }

    public void resetDeck(){
        deck.clear();

        for(int i = 2; i < 15; i++){
            deck.add(new PlayingCard(i, "CLUBS"));
        }
        for(int i = 2; i < 15; i++){
            deck.add(new PlayingCard(i, "SPADES"));
        }
        for(int i = 2; i < 15; i ++){
            deck.add(new PlayingCard(i, "HEARTS"));
        }
        for(int i = 2; i < 15; i ++){
            deck.add(new PlayingCard(i, "DIAMONDS"));
        }
    }

    public void shuffleDeck(){
        resetDeck();
        Collections.shuffle(deck);
    }

    public void sortDeckByRank(){
        Collections.sort(deck);

    }

    public void sortDeckBySuitAndRank(){
        List<PlayingCard> clubs = new ArrayList<PlayingCard>();
        List<PlayingCard> spades = new ArrayList<PlayingCard>();
        List<PlayingCard> hearts = new ArrayList<PlayingCard>();
        List<PlayingCard> diamonds = new ArrayList<PlayingCard>();

        for(PlayingCard aCard : deck){
            if(aCard.getSuit().equals("CLUBS")){
                clubs.add(aCard);

            }
            else if(aCard.getSuit().equals("SPADES")){
                spades.add(aCard);

            }
            else if(aCard.getSuit().equals("HEARTS")){
                hearts.add(aCard);

            }
            else if(aCard.getSuit().equals("DIAMONDS")){
                diamonds.add(aCard);

            }
        }

        Collections.sort(clubs);
        Collections.sort(spades);
        Collections.sort(hearts);
        Collections.sort(diamonds);

        deck.clear();
        deck.addAll(clubs);
        deck.addAll(spades);
        deck.addAll(hearts);
        deck.addAll(diamonds);

    }

}
