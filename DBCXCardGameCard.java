/*
Author: Andrey Risukhin
Purpose: Card object for the DBCX Card Game Manager.
Psuedocode:
Maintenance Log:
1/4/20
- Created. Needs to store:
   > Type (Person, Item, Action, Mystical)
   > Person:
      ~ Bonus ("Speed", "Luck")
      ~ Health Points
      ~ Abilities
   > Item:
      ~ 
      
      
   After each card, show menu with options to choose from (may be just 1: proceed)
- Maybe make subclass for each type of card. 
*/

public class DBCXCardGameCard {
   // Fields
   ///private String type;
   
   // Constructor
   public DBCXCardGameCard(String type) {
      ///this.type = type;
      if (type.equals("character")) {
         // Construct subclass CharacterCard
      }
   }
   
   // Zero argument constructor
   public DBCXCardGameCard() {
   
   }
   
}