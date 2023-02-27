/*" 3. Design a class for a basic credit card. The class should have the following features:
    - Instance variables for the cardholder's name, card number, and expiration date.
  - A constructor that allows the user to create a credit card with a given name, card number, andexpiration date.
- An equals method that returns true if the given object is a credit card with the same card number, and false otherwise.
 - A clone method that creates and returns a new credit card with the same name, card number,and expiration date as the original credit card."*/

import java.util.*;

class cardDetails implements Cloneable {
    String ogName;
    int ogCardNo;
    String ogExpDate;

    cardDetails(String ogName, int ogCardNo, String ogExpDate) {
        this.ogName = ogName;
        this.ogCardNo = ogCardNo;
        this.ogExpDate = ogExpDate;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    boolean equals(int cardNo) {

        if (ogCardNo == cardNo)
            return true;
        else
            return false;
    }

    void display() {
        System.out.println(
                "Card holder name : " + ogName + "\nCard number : " + ogCardNo + "\nCard Expiry date : " + ogExpDate);
    }
}

class creditCard {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Original card details this details will be cloned ");
        System.out.printf("Enter Card Holder Name : ");
        String ogName = sc.nextLine();
        System.out.printf("Enter Card Number : ");
        int ogCardNo = sc.nextInt();
        System.out.printf("Enter Expiry Date :");
        String ogExpDate = sc1.nextLine();
        cardDetails obj1 = new cardDetails(ogName, ogCardNo, ogExpDate);
        cardDetails obj2 = (cardDetails) obj1.clone();
        System.out.println("Enter Card Details to check: \n");
        System.out.printf("Enter Card Holder Name : ");
        String name = sc1.nextLine();
        System.out.printf("Enter Card Number : ");
        int cardNo = sc1.nextInt();
        System.out.printf("Enter Expiry Date : ");
        String expDate = sc3.nextLine();
        cardDetails obj3 = new cardDetails(name, cardNo, expDate);
        System.out.println("\nThe original card details\n");
        obj1.display();
        System.out.println("\nCloned card details\n");
        obj2.display();
        System.out.println("\nThe card details we checked\n");
        obj3.display();
        boolean ans = obj2.equals(cardNo);
        if (ans == true) {
            System.out.println("\nBoth card details are same\n");
        } else {
            System.out.println("\nBoth card details are not same\n");
        }
        sc.close();
        sc1.close();
        sc3.close();
    }
}
