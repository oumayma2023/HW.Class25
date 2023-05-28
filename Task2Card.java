package HW.Class25;

import java.util.LinkedList;

/*
   Create a Card class that will have interest rate field and card type
   and a constructor that will initialize the fields.
   Create 3 objects of different card and store them into LinkedList.
   Using for loop/advanced for loop/ iterator access all methods of the class.
   */
    public class Task2Card {
        Double interestRate;
        String cardType;

        public Task2Card(Double interestRate, String cardType) {
            this.interestRate = interestRate;
            this.cardType = cardType;
        }

        void display() {
            System.out.println("I can get " + cardType + " card with interest rate of: " + interestRate);
        }
    }

    class CardTester {
        public static void main(String[] args) {
            LinkedList<Task2Card> cards = new LinkedList<>();
            cards.add(new Task2Card(7.22, "Wells Fargo"));
            cards.add(new Task2Card(10.33, " Visa master"));
            cards.add(new Task2Card(9.77, "Debit Card"));
            for (Task2Card c : cards) {
                c.display();
            }
        }
    }

