/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.*;

import java.util.*;

/**
 *
 * @author ameliablack
 * 
 */

public class user {
    ArrayList<String> character = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Scanner scans = new Scanner(System.in);
    Random rand = new Random();
    String name, wizard, archer, acrobat, barbarian;
    int roll, diceRoll, diceRoll2, sum, rand1, rand2, rand3, rand4, accuracy, attack, physical, magical;
    boolean fighting1, fighting2, fighting3, fighting4 = false;
    
      
      public void addUser() {
       System.out.print("Enter name of character: ");
       String names = scan.nextLine();
       character.add(names);
       System.out.println();
       characterFantasy();    
}

      public void existingCharacter() {
      
       System.out.print("Here are the characters:\n");
       System.out.println("1. Chad\n2. Chelsey\n");

       System.out.println("Which character do you choose? ");
        System.out.print("Please enter a choice (0 to quit):\n>>>");
       int characterChoice = scan.nextInt();
      
      if (characterChoice == 1){
               character.add("Chad");
               System.out.println("\n>Okay! you chose Chad! Lets go!\n");
               randomStats();
      } else if (characterChoice == 2) {
               character.add("Chelsey");
               System.out.println("\n>Okay! You chose Chelsey! Lets go!\n");
               randomStats();
      } else if (characterChoice != 0) {
          System.out.print("\nInvalid input for character. %d is not an available option.\n\n");
      } else{
               System.exit(0);
              
       }
        
      }
      public void manager() {
          System.out.print("\nPlease enter a choice (0 to quit):\n" +
                    "1 - roll for attack\n" +
                    "2 - roll for damage\n" +
                    "3 - roll for physical save\n" +
                    "4 - roll for magical save\n" +
                    "5 - go back to main menu\n>>>");
           int characterPlay = scan.nextInt(); 
         if (characterPlay == 1) {
                attack();
         }else if (characterPlay == 2) {
                damage();
         } else if (characterPlay == 3) {
                physicalDefense();
         } else if (characterPlay == 4) {
                magicialDefense();
         } else if (characterPlay == 5) {
                mainMenu();
         } else if (characterPlay != 0) {
             System.out.print("What would you like to do?\n" +
                    "1 - roll for attack\n" +
                    "2 - roll for damage\n" +
                    "3 - roll for physical save\n" +
                    "4 - roll for magical save\n" +
                    "5 - go back to main menu \n\n>>>");
                    manager();
         } else {
               System.exit(0);
                    
        }
      }
     
public void displayList() {
       if (character.isEmpty()) {
           System.out.println("There are not any characters now!");
       } else {
           System.out.println("Your character is: " );
           character.forEach((str) -> {
               System.out.println(str);
           });
           mainMenu();
   
   }
     
 }

public void mainMenu() {
        System.out.print("\nPlease enter a choice (0 to quit):\n1. Display Current List\n2. Add a Character\n3. Choose an Exisiting Character\n4. Save to file\n5. Load from file\n>>>");
        int menuChoice = scan.nextInt();
        scan.nextLine();
           if (menuChoice == 1) {
               displayList();
         } else if (menuChoice == 2) {            
               addUser();
         } else if (menuChoice == 3) {
               existingCharacter();
         } else if (menuChoice == 4) {
               save();
         } else if (menuChoice == 5) {
               load();
         }else if (menuChoice != 0){
             System.out.printf("Please enter a choice (0 to quit):\n1. Display Current List\n2. Add a Character\n3. Choose an Exisiting Character\n4. Save to file\n5. Load from file\n\n>>>");
         } else {     
             System.exit(0);
         }
}      
    
       public void dice() {
            diceRoll = rand.nextInt(6) + 1;
            diceRoll2 = rand.nextInt(6) + 1;
            sum = diceRoll + diceRoll2;
            System.out.println("You rolled a " + diceRoll +  " and " + diceRoll2 + " for a total of " + sum + "\n\n\n");
            manager();
       }
           

       public void attack() {
          roll = rand.nextInt(6) + 1;
          sum = roll + accuracy; 
          System.out.println("\nYou chose to roll for ATTACK! \nYou rolled a " + roll + " and you had " + accuracy + " so now you have " + sum + "\n\n");
          manager();
            //roll for attack combine with accuracy stat
	}
           
      
               
      public void damage() {
          roll = rand.nextInt(6) + 1;
          sum = roll + attack; 
          System.out.println("\nYou chose to roll for damage! \nYou rolled a " + roll + " and you had " + attack + " so now you have " + sum + "\n\n");
          manager();
          // roll for accuracy stat which combines with attack
      }
      
      public void physicalDefense() {
          roll = rand.nextInt(6) + 1;
          sum = roll + magical; 
          System.out.println("\nYou chose to roll for PHYSICAL DEFENSE! \nYou rolled a " + roll + " and you had " + magical + " so now you have " + sum + "\n\n");
          manager();
          // roll for physical defense that combines with magical defense
      }
      
      public void magicialDefense() {
          roll = rand.nextInt(6) + 1;
          sum = roll + physical; 
          System.out.println("\nYou chose to roll for MAGICIAL DEFENSE! \nYou rolled a " + roll + " and you had " + physical + " so now you have " + sum + "\n\n");
          manager();
      }
      // roll for magical defense tthat combines with physical defense
      public void randomStats() {
          System.out.println("Lets pick our stats!");
          rand1 = rand.nextInt(6) + 1;
          rand2 = rand.nextInt(6) + 1;
          rand3 = rand.nextInt(6) + 1;
          rand4 = rand.nextInt(6) + 1;
          System.out.println("  " + rand1 + "  " + rand2 + "  " + rand3 + "  " + rand4);
          statAccuracy();}
 
      public void wizard() {
         System.out.println("\nCool! You chose the WIZARD fantasy class!");
         character.add("wizard");
          manager();    
      }
      public void acrobat() {
         System.out.println("\nCool! You chose the ACROBAT fantasy class!");
         character.add("acrobat");
          manager();
      }
      public void archer() {
          System.out.println("\nCool! You chose the ARCHER fantasy class!");
         character.add("archer");
          manager();
      }
      public void barbarian() {
          System.out.println("\nCool! You chose the BARBARIAN fantasy class!");
          character.add("barbarian");
          manager();
      }
      public void characterFantasy() {
          System.out.print("What character fantasy world do you choose?\n"
                  + "1 - for Wizard\n" +
                    "2 - for Acrobat\n" +
                    "3 - for Archer\n" +
                    "4 - for Barbarian\n>>>");
        int worldChoice;
                
        worldChoice = scan.nextInt();
        if (worldChoice == 1 ) {
               wizard();
        }else if (worldChoice == 2) {
                 acrobat();
        } else if (worldChoice == 3) {
               archer();
        } else if (worldChoice == 4) {
               barbarian();
        } else if (worldChoice != 0) {
             System.out.printf("Please enter a choice (0 to quit): \n" +
                   "What character fantasy world do you choose?\n" +
                    "1 - for Wizard\n"  +
                    "2 - for Acrobat\n" +
                    "3 - for Archer\n" +
                    "4 - for Barbarian\n>>>");
             characterFantasy();
        } else {
                System.exit(0);
      }    
      }
public void load() {
 
       System.out.print("Enter full file location: ");
       String fileLocation = scans.nextLine();
       
       File fileToLoad = new File(fileLocation.replace("\\", "\\\\"));
       BufferedReader br = null;
     
       
       try {
           br = new BufferedReader(new FileReader(fileToLoad));
       } catch (FileNotFoundException e) {
    
           System.out.println(e.getMessage());
           return;
       }

        String str = "";
        try {
           while ((str = br.readLine()) != null) {
               character.add(str);
           }
           br.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           return;
       }
       System.out.println();
   }

 public void save() {
       System.out.print("Enter full file location: ");
       String fileLocation = scans.nextLine();
       File fileToSave = new File(fileLocation.replace("\\", "\\\\"));
       /* check the file if it exists or not, create a new file accordingly */
       try {
           if (!fileToSave.exists()) {
               fileToSave.createNewFile();
           }
           /* FileWriter to write the contents to the passed file object */
           FileWriter file = new FileWriter(fileToSave);
           for (String str : character) {
               file.write(str + "\r\n");
           }
           file.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           return;
       }
       System.out.println();
   }

public void statAccuracy() {
           System.out.print("What do you choose for your ACCURACY stat?\n>>>");
             accuracy = scan.nextInt();
             statAttack();
          }
public void statAttack() {
     System.out.print("What do you choose for ATTACK stat?\n>>>");
          attack = scan.nextInt();
           statPhysical();
}
  
public void statPhysical() {
    
   System.out.print("What do you choose for PHYSICAL SAVE stat?\n>>>");
          physical = scan.nextInt();
          statMagical();
}

public void statMagical() {
    System.out.print("What do you choose for your MAGICAL SAVE stat?\n>>>");
          magical = scan.nextInt();
             
    System.out.println("\nAwesome! Now lets pick a fantsay world!");
          characterFantasy();          
      
      }
}





