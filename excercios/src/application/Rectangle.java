package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dimension;

public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and heigth");
		
		Dimension dimension = new Dimension();
		
		dimension.width = sc.nextDouble();
		dimension.heigth = sc.nextDouble();
		
		System.out.println(dimension);
		
		sc.close();

	}

}