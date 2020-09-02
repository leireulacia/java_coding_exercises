package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toUpperCase(word.charAt(0))+ word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

      // substring (initial-include, end-not include)
        return (firstName.substring(0,1)).toUpperCase() + "." + (lastName.substring(0,1)).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        //Math.round((x * 100)) / 100 --> to get the number with 2 decimals
        return (double) (Math.round(((originalPrice + (originalPrice * vatRate) / 100))*100))/100;
    }

    public String reverse(String sentence) {
        char [] array= new char [sentence.length()];
        int i=0;            //Variable to iterate over the array (new array to keep the new order of the words)
        int j=sentence.length()-1; //Variable to iterate over the sentence.

        while (i<sentence.length()){

            array[i] = sentence.charAt(j); 
            i++;
            j--;
        }
        return String.valueOf(array); // returns the string representation of the array
    }

    public int countLinuxUsers(List<User> users) {

        int count=0;
        String str=" ";
        User usr = new User(" "," "," ");

        for (int i = 0; i < users.size(); i++) {

           usr= (User) users.get(i); // Get the i User of the List and cast it to User

            str= (usr.getType()).toUpperCase(); //Get the type of the Object User and Capitalize the word
            
              if (str.equals("LINUX")) {
                count++;
                }
        }
        return count;
    }
}
