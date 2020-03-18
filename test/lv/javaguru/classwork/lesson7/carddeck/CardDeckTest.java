package lv.javaguru.classwork.lesson7.carddeck;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {

    private static final String[] NEW_DECK = {
            "♠2", "♠3", "♠4", "♠5", "♠6", "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "♠A",
            "♥2", "♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♥A",
            "♦2", "♦3", "♦4", "♦5", "♦6", "♦7", "♦8", "♦9", "♦10", "♦J", "♦Q", "♦K", "♦A",
            "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♣A"};

    @Test
    void shouldCreateNewCardDeck() {
        CardDeck deck = new CardDeck();
        String[] createdDeck = deck.getCards();

//        How to display array in console hack way!
//        Arrays.asList(createdDeck).stream()
//                .map(card -> "\"" + card + "\", ")
//                .forEach(System.out::print);
        assertArrayEquals(NEW_DECK, createdDeck);
    }

    @Test
    void shouldShuffleDeck() {
        CardDeck deck = new CardDeck();
        deck.shuffle();
//        System.out.println(Arrays.toString(deck.getCards()));
        assertFalse(isArrayEquals(NEW_DECK, deck.getCards()));
    }

    private boolean isArrayEquals(String[] thisArray, String[] thatArray) {
        if (thisArray.length != thatArray.length) {
            return false;
        }
        for (int i = 0; i < thisArray.length; i++) {
            if (thisArray[i] != thatArray[i]) {
                return false;
            }
        }
        return true;
    }
}