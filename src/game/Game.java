/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author ameliablack
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        user characters = new user();
        Scanner scan = new Scanner(System.in);
        
        characters.mainMenu();
    }
}


    
    
