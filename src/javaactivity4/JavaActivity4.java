
package javaactivity4;

import java.util.Scanner;


public class JavaActivity4{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        
    int score;
        System.out.println("Your Entrance Exam Score:");
        score = scn.nextInt();
        
    if (score >= 70){
    double GPA = 3.5;
         System.out.println("Your GPA is above: " + GPA); 
         System.out.println("Congratulation!");
    }else if (score <= 70){
    double GPA = 3.0;
         System.out.println("Your GPA is below:" + GPA);
         System.out.println("Sorry,you are not eligible for admission");
        }
    scn.close();
    }
    
    
}