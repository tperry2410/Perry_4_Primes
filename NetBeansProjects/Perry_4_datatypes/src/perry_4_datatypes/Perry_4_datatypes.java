/*
    To change this license header, choose License Headers in Project Properties.
    To change this template file, choose Tools | Templates
    and open the template in the editor.
 */
package perry_4_datatypes;

/**
    @author TimPerry
*/
public class Perry_4_datatypes {
    public static void main(String[] args) {
        
        /* 
            Space for comments
            used to explain code
            code explaination is an expectation
            in D22.
        */
        
        int i = 51;
        float a = 7.11f;
        double b = 14.22;
        short c = 100;
        char d1 = '1';
        char d2 = 'd';
        char d3 = 122;
        String e = "Why certainly.";
        boolean f = false;
        boolean g = i % 2 == 1;
        /*
            here we will look at some mathematical
            operators
        */
        
        /*
            + this add two numbers and more
            - this subtracts two numbers or more
            * this multipliles two numbers or more
            / this divides two numbers or more
            % this is modulo. shows you the remainder
        */
        System.out.println(i + " an integer");
        System.out.println(a + " a float");
        System.out.println(b + " a double");
        System.out.println(c + " a short");
        System.out.println(d1 + " a char");
        System.out.println(d2 + " a char");
        System.out.println(d3 + " a char");
        System.out.println(e + " a string");
        System.out.println(f + " a boolean");
        System.out.println(g + " a boolean");
        
        for (i = 0; i < 200; i++) {
            System.out.println(i % 4 == 0);
        }
        
        /*
            % checks for the remainder
             i % 2 checks if a number is
             even or odd
        */
        
        /*
            a number valuse for char
            maps to a character
        */
        i = 0;
        a = 0;
        e = "ninja";
        System.out.println(i + (int)a + " an integer" 
                + " plus a float");
        
        /*
            upcast to float is automatic
            i.e. 7 + 0.0 = 7.0
        */
        
        i = 22;
        a = 0;
        e = "ninja";
        System.out.println(e + i + " an/" + "a string plus an integer");
        
        /*
            adding an int and a string
            concatenates (combines) the int
            and string as a string
        */
        
        a = 2.5f;
        b = 3.2;
        System.out.println(a + b + " a float" + " plus a double");
        
        b = 3.1;
        c = 16;
        System.out.println(b + c + " a double" + " a short");
        
        
        for (i = 0; i < 500; i++) {
            
            /*
                If is a conditional (flow)
                statement. If a condition is true
                the following command will
                be executed.
            */
            
            if ( i % 2 == 0){ 
                System.out.println(i +" is even");
            } else {
                System.out.println(i + " is odd");
            }
            
        }
        
    }
    
}
