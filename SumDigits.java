import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
    // Scanner to allow/read user input 
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long input = value.nextLong();
        System.out.println("The sum of the digits in " + input + " is: " + sumDigits(input));
        value.close();
    }

    // Correct method header: public static int sumDigits(long n)
    public static int sumDigits(long n) {
        int sum = 0;
        
    // Extracting and calculating the sum of the digits in the integer  
        while (n > 0) {
            sum += n % 10;  
            n = n / 10;     
        }
        
    // Results
        return sum;  
    }
}
// Pseudocode
// Start
    // PRINT "Enter a number: "
    // READ the user input and as 'number'
    // CALL sumDigits(number) and store the result in 'digitSum'
    // PRINT "The sum of digits in " + number + " is: " + digitSum
// END

// FUNCTION sumDigits(n)
    // SET sum = 0
    // WHILE n > 0
        // ADD n % 10 to sum
        // SET n = n / 10
    // END WHILE
    
    // RETURN sum
// END FUNCTION
