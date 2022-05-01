package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstStepsInCoding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());

        if(number >= -100 && number <= 100 && number !=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }








    }
}






