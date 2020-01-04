/*
Author: Andrey Risukhin
Purpose: An online way for people to play the popular DBCX Card Game, no matter 
      how far apart they are. 
Psuedocode:
Maintenance Log:
1/4/20
- Created. This will use card objects, stored in a stack. 
- Different files, one per type of card, will be used.
- Somehow need to include an image for every card.
*/

import java.util.*; // Scanner
import java.io.*; // File processing

public class DBCXCardGameManager {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      
      welcome();
      checkKnowledge(console);      
      
      Stack<DBCXCardGameCard> persons = makeDeck("character", console);
      Stack<DBCXCardGameCard> items = makeDeck("item", console);
      Stack<DBCXCardGameCard> actions = makeDeck("action", console);
      Stack<DBCXCardGameCard> mystic = makeDeck("mystical", console);
      
      
      // Build cards from text file
      
      // 
   
   
      // Shuffle character cards
      
      // Shuffle "draw" stack
      
      // Go in order
      
   }
   
   // Pre: Takes a String (Type of card) and Scanner (User Input)
   // Post: Returns a stack of DBCX cards of given type
   public static Stack<DBCXCardGameCard> makeDeck(String type, Scanner console) 
         throws FileNotFoundException {
      Stack<DBCXCardGameCard> s = new Stack<>();
      File inFile = new File(getFile(type, console));
      Scanner cardBuilder = new Scanner(inFile);
      while(cardBuilder.hasNextLine()) {
         // Save card name (Character name/Item name/Action name/"Mystical Twinkie")
         // 
         
         DBCXCardGameCard card = new DBCXCardGameCard(type); // If I pass it the type, can it return a subclass?
         s.push(card);
      }
      return s;
   }
   
   // Post: Welcomes the user with console message.
   public static void welcome() {
      System.out.println("This is the DBCX Card Game Manager!");
      System.out.println("Use it to play online games!");
      System.out.println();
   }
   
   // Post: Teaches user the rules if they don't know them.
   public static void checkKnowledge(Scanner console) {
      System.out.print("Do you know how to play this game? (Yes/No)");
      String response = console.next();
      char check = response.toUpperCase().charAt(0);
      if (check == 'n') {
         System.out.println("Here's how to play!");
      }
   }
   
   // Pre: Passed String, Scanner. 
   // Post: Returns String address of a file for given type of card.
   public static String getFile(String type, Scanner console) {
      System.out.print("What file are " + type + " cards in? ");
      String fileAddress = console.next();
      return fileAddress;
   }
}