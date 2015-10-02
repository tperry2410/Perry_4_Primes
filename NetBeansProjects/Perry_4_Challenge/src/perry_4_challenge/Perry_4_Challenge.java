package perry_4_challenge;

public class Perry_4_Challenge {
    
    public static void main(String[] args) {
        for (int i = 0; i < 501; i++){
            
            if (isTwo(i) & isEleven(i)){
                System.out.println("Ninja");
            }
            
            else if (isThree(i) & isEleven(i)){
                System.out.println("Herr Direktor");
            }
            
            else if (isFive(i) & isEleven(i)) {
                System.out.println("Animate this!");
            }
            
            else if (isTwo(i) & isThree(i) & isFive(i)){
                System.out.println("Team Building");
            }
            
            else if (isTwo(i) & isThree(i)){
                System.out.println("chismé");
            }
            
            else if (isThree(i) & isFive(i)){
                System.out.println("Old School");
            }
            
            else if (isTwo(i)){
                System.out.println("Davis");
            }
            
            else if (isThree(i)){
                System.out.println("Chaughton");
            }
            
            else if (isFive(i)){
                System.out.println("Vidal");
            }
            else {
                System.out.println(i);
            }
        }
        
    }
    
    static boolean isTwo(int n) {
        return (n % 2 == 0);
    }
    
    static boolean isThree(int m) {
        return (m % 3 == 0);
    }
    
    static boolean isFive(int o) {
        return (o % 5 == 0);
    }
    
    static boolean isEleven(int p) {
        return (p % 11 ==0);
    }
}
