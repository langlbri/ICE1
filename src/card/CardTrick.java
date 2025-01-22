/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Brittany Langley 
 * student number: 991805350
 * username: langlbri
 * ICE-1
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the card value (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the suit of the card (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // and search magicHand here
        boolean cardMatch = false;
        for (Card c : magicHand){
        if (c.getValue() == userCard.getValue() && c.getSuit().equals(userCard.getSuit())){
        cardMatch = true;
        break;
        }
        
        //Then report the result here
        if (cardMatch){
        System.out.println("Your card is in the hand! You Win!");
      
        }
        else{
        System.out.println("Your card is not in the hand. Sorry!");
        }
        System.out.println("Cards in Hand: ");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        scanner.close();
        // add one luckcard hard code 2,clubs
    }
    }
}
