package com.company;

import java.util.*;
public class Main {
    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }

    public static void main(String[] args) {

        int n;
        Scanner imput = new Scanner(System.in);
        n= imput.nextInt();
        int i;
        for(i=1;i<=n;i++){
         if(i%sumaCifara(i)==0) System.out.println(i);
        }

    }
}
