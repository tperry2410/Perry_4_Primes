package perry_4_prime_methods;

public class Perry_4_counter {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            
            /*
                What happens in the loop,
                will happen again and again
                until the loop exits.
            */
            
            if (isEven(i)){
                System.out.println(i + " is even");
            } 
            
            else {
                System.out.println(i + " is odd");   
            } 
            
            if(isPrime(i)) {
                System.out.println(i + " is a prime");
            }
            
        }
        
    }
    
    /*
        method - is like a little program
        it can recive and return values to other methods
    */
    
    static boolean isEven(int n) {
        return (n % 2 == 0);
    }
    
    static boolean isOdd(int n) {
        return (n % 2 == 1);
    }
    
    static boolean isPrime(int p){
        int divisor = 0;
        
        for (int i = 2; i < p; i++){
            
            if(p % 1 == 0) {
                divisor += 1;
            }
            
        }
        
        if (divisor > 0) {
            return false;
        }
        
        else {
            return true;
        }
        //return (divisor == 0);
    }
    
}