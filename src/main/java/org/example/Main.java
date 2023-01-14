package org.example;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        int elemanSayisi=r.nextInt(10);
        int dizi[]=new int[elemanSayisi];
        for(int i=0; i< dizi.length; i++)
        {
            dizi[i]=r.nextInt(50);
            System.out.print(dizi[i]+" ");
            if(dizi[i]%3==0)
            {
                System.out.println("FİZZZZ");
            }
            if(dizi[i]%5==0)
            {
                System.out.println("BUZZZZ");
            }
            if(dizi[i]%3==0 && dizi[i]%5==0)
            {
                System.out.println("FİZZZZBUZZZZ");
            }
            else if(dizi[i]%3!=0 && dizi[i]%5!=0){
                System.out.println("NONE");
            }
        }
    }
}