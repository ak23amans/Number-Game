/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number_game;

import java.util.Scanner;

/**
 *
 * @author Ankit
 */
class randomgen{
    public int genrate(int max,int min){
        return (int)(Math.random()*(max-min)+min);
    }

}




public class Number_Game {

    /**
     * @param args the command line arguments
     */


//main
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc=new Scanner(System.in);
        randomgen rg=new randomgen();
        int totalAttempt=0;
        int win=0;
        while(true){
            System.out.println("Enter the maximun number?");
            int max=sc.nextInt();
            System.out.println("Enter the minimum number?");
            int min=sc.nextInt();
            sc.nextLine();
            
            int cnum=rg.genrate(max, min);
            int attempt=0;
            
            while (true) {                
                System.out.println("Enter the Guess number between"+max+"and"+min);
                int guessNum=sc.nextInt();
                attempt++;
                
                if (guessNum>cnum) {
                    System.out.println("It's greater ");
                }
                else if (guessNum<cnum) {
                    System.out.println("it's smaller");
                }
                else{
                    System.out.println("it's Correct guess");
                     win++;
                     break;
                           
                }
            }
            totalAttempt +=attempt;
            System.out.println("Attempt= "+attempt);
            System.out.println("Wins= "+win);
            
            double winrate=(double)win/totalAttempt*100;
            System.out.printf("Winrate %.2f%%\n",winrate);
            System.out.println("Do  you want to play Again (yes/No)");
            String pAgin=sc.next();
            if (pAgin.equalsIgnoreCase("no")) {
                sc.close();
                System.exit(0);
            }
        }
    }
    

}

