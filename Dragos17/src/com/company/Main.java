package com.company;

public class Main {

    public static void main(String[] args) {
	 int age=10;
        switch(age){
            case 10:
                System.out.println("Way too young");
                break;
            case 15:
                System.out.println("Just right");
                break;
            case 20:
                System.out.println("Way too old");
                break;
            default:
                System.out.println("not allowed");
                break;

        }
    }
}
