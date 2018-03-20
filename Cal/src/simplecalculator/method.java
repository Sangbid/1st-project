package simplecalculator;
import java.util.Scanner;
public class method {
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
	            
	            case '+' : answer = addition(num1,num2);
	                break;
	            case '-' : answer = subtraction(num1,num2);
	                break;
	            case '*' : answer = multiplication(num1,num2);
	                break;
	            case '/' : answer = division(num1,num2);
	                break;
	        }
	        
	        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
	        
	        
	}
	    
	    public static int addition(int x,int y){
	        return x+y;
	    }
	    public static int subtraction(int x,int y){
	        return x-y;
	    }
	    public static int multiplication(int x,int y){
	        return x*y;
	    }
	    public static int division(int x,int y){
	        return x/y;
	    }
	}



