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
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
