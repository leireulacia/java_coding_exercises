package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
   
        return person.getCity()=="Manchester"? true:false;

     /*  The statement above replace the statement:

        if (person.getCity()=="Manchester"){
            return true;
        }else{
            return false;
        }*/      
    }

    public boolean canWatchFilm(Person person, int ageLimit) {

        return person.getAge()>=ageLimit?true:false;

       /* The statement above replace the statement:
       
       if (person.getAge()>=ageLimit){
            return true;
        }else{
            return false;
        }*/  
    }  
}