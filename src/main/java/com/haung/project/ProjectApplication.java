package com.haung.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

// @SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ProjectApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		int i = 99;

		while (i < 1000 || i > 1000000) {
			System.out.println("Enter a number between $1000 and $1000000" );
			System.out.print("Principal ($1k - $1m)");
			 i = scanner.nextInt();
		}

		double z = 33;
		while (z > 30 || z <= 0) {
			System.out.println("Enter a value between 0 and 30");
			System.out.print("Annual Interest Rate");
			z = scanner.nextDouble();

		}

		int period = 31;
		while (period > 30 || period <= 0) {
			System.out.println("Enter a value between 0 and 30");
			System.out.print("Period (Years)");
			period = scanner.nextInt();

		}

		
	}

}
