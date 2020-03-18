package lv.javaguru.classwork.lesson7.carddeck;

import java.util.Random;

public class CardDeck {

    final static private String[] SUITE = {"♠", "♥", "♦", "♣"};
    final static private String[] VALUE = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final String[] deck;

    private int calculateDeckSize() {
        return SUITE.length * VALUE.length;
    }

    public CardDeck() {
        deck = new String[calculateDeckSize()];
        createDeck();
    }

    private void createDeck() {
        int deckCounter = 0;
        for (String suite : SUITE) {
            for (String value : VALUE) {
                String newCard = suite + value;
                deck[deckCounter] = newCard;
                deckCounter++;
            }
        }
    }

    public void shuffle() {
        int firstRandomCard;
        int secondRandomCard;
        int min = 0;
        int max = deck.length - 1;
        int timesToShuffle = deck.length * 10;
        Random random = new Random();

        for (int i = 0; i < timesToShuffle; i++) {
            firstRandomCard = getRandomNumberInRange(min, max, random);
            secondRandomCard = getRandomNumberInRange(min, max, random);
            swapCards(firstRandomCard, secondRandomCard);
        }
    }

    private void swapCards(int firstRandomCard, int secondRandomCard) {
        String temp;
        temp = deck[firstRandomCard];
        deck[firstRandomCard] = deck[secondRandomCard];
        deck[secondRandomCard] = temp;
    }

    private int getRandomNumberInRange(int min, int max, Random random) {
        return random.nextInt((max - min) + 1) + min;
    }

    public String[] getCards() {
        return deck;
    }


}
