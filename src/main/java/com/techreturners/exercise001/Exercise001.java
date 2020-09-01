package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toUpperCase(word.charAt(0))+ word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
      
        return (firstName.substring(0,1)).toUpperCase() + "." + (lastName.substring(0,1)).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        
        return (double) (Math.round(((originalPrice + (originalPrice * vatRate) / 100))*100))/100;
    }

    public String reverse(String sentence) {
        char [] array= new char [sentence.length()];
        int i=0;
        int j=sentence.length()-1;

        while (i<sentence.length()){

            array[i] = sentence.charAt(j); 
            i++;
            j--;
        }
        return String.valueOf(array);
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
