package fibonacci;

import javax.swing.*;

/**
 * @title Fibonacci
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 23-Mar-2015 12:16:17 PM
 * @purpose The purpose of this program is to calculate terms of the fibonacci sequence
 */
public class Fibonacci {

    public static void main(String[] args) {
        int num;//get user input for the term that is wanted
        num = Integer.parseInt(JOptionPane.showInputDialog("Which fibonacci term would you like to see"));
        num = F(num);
        System.out.println(num);
    }

    private static int F(int num) {
        if ((num == 1) || (num == 2)) {//if it is the first 2 terms return 1
            return 1;
        } else {
            return F(num - 1) + F(num - 2);//add the terms together until all terms are added
        }
    }
}
