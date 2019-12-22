package com.company;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class PlayingCard implements Comparable<PlayingCard>{

    private int rank;
    private String suit;
    private static Map<Integer, String> valueMap = new HashMap<Integer, String>();

    static{
        initializeMap();
    }

    /************************GETTERS AND SETTERS***********************************/

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRankName(){
        return valueMap.get(getRank());
    }
    public PlayingCard(int rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    /*********************************CLASS METHODS***********************************/

    static private void initializeMap() {

        valueMap.put(2, "Two");
        valueMap.put(3, "Three");
        valueMap.put(4, "Four");
        valueMap.put(5, "Five");
        valueMap.put(6, "Six");
        valueMap.put(7, "Seven");
        valueMap.put(8, "Eight");
        valueMap.put(9, "Nine");
        valueMap.put(10, "Ten");
        valueMap.put(11, "Jack");
        valueMap.put(12, "Queen");
        valueMap.put(13, "King");
        valueMap.put(14, "Ace");

    }

    @Override
    public String toString(){
        return getRankName() + " of " + suit;

    }

    @Override
    public int compareTo(PlayingCard aCard){
        return this.getRank() < aCard.getRank() ? -1 :
                this.getRank() == aCard.getRank() ? 0: 1;
    }
}
