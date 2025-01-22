//This program reads a phone number from the user, translates any letters to 
//their corresponding digits, and prints the translated phone number

import java.util.Scanner;

public class Dialup {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter a phone number: ");
       // Prompts user for phone number
        String phoneNumber = input.nextLine();
        //read the phone number
        StringBuilder translatedNumber = new StringBuilder();
        // tranlates the phone number
        
        for (int i = 0; i < phoneNumber.length(); i++) { //loops through the phone number
            char ch = phoneNumber.charAt(i);// gets the character at the current position
           
            if (Character.isLetter(ch)) {    
           // checks to see if the character is a letter 
                translatedNumber.append(getNumber(Character.toUpperCase(ch))); 
                //appends the number to the translated number
            } else {
                translatedNumber.append(ch);
            }
        }

        System.out.println("Translated phone number: " + translatedNumber.toString());
    }     //prints phone number 

    public static int getNumber(char uppercaseLetter) {   //method to get the number 
        switch (uppercaseLetter) {
            case 'A': case 'B': case 'C': return 2;
            case 'D': case 'E': case 'F': return 3;
            case 'G': case 'H': case 'I': return 4;
            case 'J': case 'K': case 'L': return 5;
            case 'M': case 'N': case 'O': return 6;
            case 'P': case 'Q': case 'R': case 'S': return 7;
            case 'T': case 'U': case 'V': return 8;
            case 'W': case 'X': case 'Y': case 'Z': return 9;
            default: return -1; // Invalid character
            
            
            
            
            
            

      
  }//end of switch
    } //end of method
}   // end of program