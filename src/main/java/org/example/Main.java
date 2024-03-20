package org.example;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        System.out.println("PLz Enter your name ");
        Scanner sc = new Scanner(System.in) ;
         String username = sc.next();
         sayHello(username);
         sc.close();
    }

    public  static void sayHello(String username){

        System.out.println(("hello " + username));

    }

}

