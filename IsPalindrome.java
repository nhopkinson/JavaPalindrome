import java.util.*;

class IsPalindrome
{  
    static Scanner console = new Scanner(System.in);

    public static void main(String args[])
    {  
        System.out.println("Enter a number to see if it is a Palindrome: ");
        int num,sum,temp;    
        int userInput = console.nextInt();
        sum = 0;
        temp = userInput;    
        
        while(userInput > 0){    
            num = userInput % 10;  
            sum = (sum * 10) + num;    
            userInput = userInput / 10;    
            }    
        if(temp == sum){
            
            System.out.println("This number is a palindrome ");
        }else{
            
            System.out.println("This is not a palindrome");
        }    
    }  
}  