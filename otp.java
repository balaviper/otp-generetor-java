       
package javaapplication1;

import java.util.*;

public class otp {

    static char[] otp(int l){
     
        String num = "0123456789";
        
        Random r = new Random();
        char[] otp = new char[l];
        
        for(int i=0;i<l;i++)
        {
           otp[i]=num.charAt(r.nextInt(num.length()));
        }
       return otp; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(otp(5));
        
    }
}
