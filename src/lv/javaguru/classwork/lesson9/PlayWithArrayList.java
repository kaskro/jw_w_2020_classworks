package lv.javaguru.classwork.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayWithArrayList {

    public static void main(String[] args) {
        List<String> cryptoCurrencies = new ArrayList<>();
        cryptoCurrencies.add("LightCoin");
        cryptoCurrencies.add("Wase");
        cryptoCurrencies.add("BitCoin");
        cryptoCurrencies.add("Etherium");

        System.out.println("Size: " + cryptoCurrencies.size());
        System.out.println("Contains Wase: " + cryptoCurrencies.contains("Wase"));
        System.out.println(cryptoCurrencies.toString());

        Collections.sort(cryptoCurrencies);
        System.out.println(cryptoCurrencies.toString());

        Collections.reverse(cryptoCurrencies);
        System.out.println(cryptoCurrencies.toString());

        cryptoCurrencies.add("Wase");
        System.out.println(cryptoCurrencies.toString());

        cryptoCurrencies.remove("Wase");
        System.out.println(cryptoCurrencies.toString());
    }

}
