
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public int getSum() {
        int sum = 0;
        for(Card c: cards) {
            sum += c.getValue();
        }
        
        return sum;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream().forEach(c -> System.out.println(c));
    }
    
    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        return this.getSum() - o.getSum();
    }

 
    
}
