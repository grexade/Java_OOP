package com.company;

import javax.swing.*;
import java.util.Scanner;


public class Main {

    static final double LUX_PRICE = 24.99;
    static final double ECO_PRICE = 9.99;

    public static void main(String[] args) {
	// write your code here

        double length,width;
        String lengthStr, widthStr;
        String output="";

        Scanner sc = new Scanner (System.in);

        System.out.print("\n Please enter the length of the room : ");
        lengthStr = sc.next();
        length = validateNumbers (lengthStr);

        System.out.print("\n Please enter the width of the room : ");
        widthStr = sc.next();
        width = validateNumbers (widthStr);

        output = "\n TOTAL LUX PRICE = " + calculateLUX (length, width) +" TL"
                +"\n TOTAL ECO PRICE = " + calculateECO (length, width) + " TL";

        System.out.print("\n " + output);
        //int outputStr = Integer.parseInt(output);
        //System.out.println(String.format("%,d", output));
    }

    static double calculateLUX (double length, double width){
        double lux =0;
        lux = length * width * LUX_PRICE;
        return lux;
    }

    static double calculateECO (double length, double width){
        double eco =0;
        eco = length * width * ECO_PRICE;
        return eco;
    }

    static double validateNumbers (String nStr){

        double n=0;

        try {
            n = Double.parseDouble(nStr);
        }

        catch(NumberFormatException ex){
            System.out.println ("Error : Please enter numbers " + "\n Compiler Error:" + ex.getMessage());
        }

        return n;
    }
}
