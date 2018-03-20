package simplecalculator;

import java.util.Scanner;

public class Calculator {

			public static void main(String[] args){
	        int num1=0;
	        int num2=0;
	        char operator;
	        double answer = 0.0;
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter First number : ");
	        num1 = input.nextInt();
	        System.out.println("Enter Second number : ");
	        num2 = input.nextInt();
	        System.out.println("What you want to do? ");
	        operator = input.next().charAt(0);
	        
	        switch(operator){
	            
	            case '+' : answer = num1 + num2;
	                break;
	                
	            case '-' : answer = num1 - num2;
	                break;
	                
	            case '*' : answer = num1 * num2;
	                break;
	                
	            case '/' : answer = num1 / num2;
	                break;
	        }
	        
	        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
	    }
	    
	    
	    }





