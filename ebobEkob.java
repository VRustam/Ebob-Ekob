package Ders4;

import java.util.Random;
import java.util.Scanner;

public class ebobEkob {
    public static void main(String[] args) {
       // Scanner yaz =new Scanner(System.in);
        Random r1=new Random();
        int reqem1= r1.nextInt(9999);
        int reqem2=r1.nextInt(9999);
        System.out.println("reqem 1 : " + reqem1 + " \nreqem 2 : " + reqem2);

        int min = reqem1 < reqem2 ? reqem1 : reqem2;
        int max = reqem1 > reqem2 ? reqem1 : reqem2;

       /* for(int i = min ; i>0; i --){
            if (min % i == 0 && max % i == 0) {
                System.out.println("min : " + i);

            }
        } */

        for(int i=max ; i>0;i++){
            if(min%i==0 && max % i==0){
                System.out.println("max : "+ i);
            }
        }

    }
}
