import java.util.*;
import javax.swing.JOptionPane;
/*
AUTHOR: uno
Program number 3/365
Date 22/May/2018
                                                 Spammer
                         take user input message and spam it recursively with counting number
*/
class Spammer{
    public static void main (String[] args){

        String spam_message = JOptionPane.showInputDialog("What message would you want to spam?");
        int limit = Integer.parseInt(JOptionPane.showInputDialog("How many times?"));
        
        int counter = 0;
        spam(spam_message, counter, limit);
    }
    public static void spam(String spam_message, int counter, int limit){
        if(counter <= limit){
            System.out.println(spam_message + " " + counter);
            counter = counter + 1;
            spam(spam_message, counter, limit);

        }
    }


}
