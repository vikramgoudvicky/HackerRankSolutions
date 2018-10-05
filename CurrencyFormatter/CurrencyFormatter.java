package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
        String us=usFormat.format(payment);
        NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=chinaFormat.format(payment);
        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=franceFormat.format(payment);
        NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String india = indiaFormat.format(payment);
        //String india="Rs."+payment;
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


	}

}
