/*
WordJumble.java 
Created by: Lucas Noritomi-Hartwig
Created on: April 1, 2020
Last edited on: April 2, 2020
The Word Jumble recursive algorithm lists all of the 
“word” possibilities from a set of letters input by the user.
*/
package wordjumble;

import javax.swing.JOptionPane;

public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompting user for input string
        String input = JOptionPane.showInputDialog("Please enter a word");
        jumbleWords(input, "");
    }
    
    //input parameters
    //word - the remaining letters in the word still to jumble
    //jumbLet - the letters already used to create
    //the jumbled word
    public static void jumbleWords(String word, String jumbLet) {
        int pos;
        String remainingLetters;
        String origWord = word;
        String origJumbledLetters = jumbLet;
        if (word.length() == 1) {
            System.out.println(jumbLet + word);
        } else {
            for (pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                        + origWord.substring(pos + 1, origWord.length());
                //recursive call to jumbleWords()
                jumbleWords(remainingLetters,
                        origJumbledLetters + origWord.charAt(pos));
            }
        }
    }
    
}
