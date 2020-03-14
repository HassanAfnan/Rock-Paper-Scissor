/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bol = true;
        while(bol)
        {
        System.out.println("******************* ROCK PAPER SCISSOR *********************");
        System.out.println("Lets play Rock Paper and Scissor");
        System.out.println("Enter your choice:\n1- Rock \n2- Paper \n3- Scissor \n4- Exit");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        Random rand = new Random();
        int cs = rand.nextInt(3) + 1;
            if(cs == 1)
            {
                System.out.println("Computer selected Rock");
                if(i == 1)
                {
                    System.out.println("Tie");  
                }
                else if(i == 2)
                {
                    System.out.println("You Win");
                }
                else if(i == 3)
                {
                    System.out.println("You Lose"); 
                }
            }    
                
            if(cs == 2)
            {
                System.out.println("Computer selected Paper");
                if(i == 1)
                {
                    System.out.println("You Lose");  
                }
                else if(i == 2)
                {
                    System.out.println("Tie");
                }
                else if(i == 3)
                {
                    System.out.println("You Win"); 
                }
            }
        
            if(cs == 3)
            {
                System.out.println("Computer selected Scissor");
                if(i == 1)
                {
                    System.out.println("You Win");  
                }
                else if(i == 2)
                {
                    System.out.println("You Loss");
                }
                else if(i == 3)
                {
                    System.out.println("Tie"); 
                }
            }
            
            if(i == 4)
            {
                bol = false;
            }
        }
      }
    }  
