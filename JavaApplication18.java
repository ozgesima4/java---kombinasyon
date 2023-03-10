
package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int n,r,sayi,fak=1,nfak=1,rfak=1;
         
         System.out.println("C(n,r) icin sirasiyla n ve r sayilarini gir:");
         n=input.nextInt();
         r=input.nextInt();
        sayi=n-r;
        
        for(int i=n;i>1;i--){
            nfak*=i;
        }
        
        for(int i=r;i>1;i--){
            rfak*=i;
        }
        
         for(int i=sayi;i>1;i--){
             fak*=i;
          }
         System.out.println(nfak/(rfak*(fak)));
         
    }
    
}
