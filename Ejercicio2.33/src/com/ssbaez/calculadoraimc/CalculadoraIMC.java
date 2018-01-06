package com.ssbaez.calculadoraimc;

import java.util.Scanner;

public class CalculadoraIMC {
	
	public static void main(String[] args){
		
		float peso,
			  altura,
			  imc;
		
		int selec,
			cons = 703;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora del indice de masa corporal\n");
		System.out.println("Seleccione el sistema metrico que desea utilizar");
		System.out.println("\n    "+ "1. Ingles     2. Internacional");
		System.out.print("\nSelección: ");
		
		selec = input.nextInt();
		
		if(selec == 1){
			System.out.println("Ha seleccionado el sistema metrico ingles\n");
			System.out.print("Ingrese su peso (libras): ");
			peso = input.nextFloat();
			
			System.out.print("\nIngrese su altua (pulgadas): ");
			altura = input.nextFloat();
			
			
			imc = (peso*cons)/(altura*altura);
			
			if(imc < 18.5){
				System.out.println("\nVALORES DE BMI"
								 + "\nBajo de peso: menos de 18.5"
								 + "\nNormal:       entre 18.5 y 24.9"
								 + "\nSobrepeso:    entre 25 y 29.9"
								 + "\nObesidad:     30 o mas"
								 + "\n\nSu IMC es: " + imc + " **BAJO DE PESO**");
			}
			else if(imc >= 18.5 && imc <= 24.9){
				System.out.println("\nVALORES DE BMI"
						 		 + "\nBajo de peso: menos de 18.5"
						 		 + "\nNormal:       entre 18.5 y 24.9"
						 		 + "\nSobrepeso:    entre 25 y 29.9"
						 		 + "\nObesidad:     30 o mas"
						 		 + "\n\nSu IMC es: " + imc + " **NORMAL**");
			}
			else if(imc >= 25 && imc <= 29.9){
				System.out.println("\nVALORES DE BMI"
				 		 		 + "\nBajo de peso: menos de 18.5"
				 		 		 + "\nNormal:       entre 18.5 y 24.9"
				 		 		 + "\nSobrepeso:    entre 25 y 29.9"
				 		 		 + "\nObesidad:     30 o mas"
				 		 		 + "\n\nSu IMC es: " + imc + " **SOBREPESO**");
			}
			else{
				System.out.println("\nVALORES DE BMI"
		 		 		 		 + "\nBajo de peso: menos de 18.5"
		 		 		 		 + "\nNormal:       entre 18.5 y 24.9"
		 		 		 		 + "\nSobrepeso:    entre 25 y 29.9"
		 		 		 		 + "\nObesidad:     30 o mas"
		 		 		 		 + "\n\nSu IMC es: " + imc + " **OBESIDAD**");
			}
		}
		
		
		else if(selec == 2){
			System.out.println("Ha seleccionado el Sistema Metrico Internacional\n");
			System.out.print("Ingrese su peso (kilogramos): ");
			peso = input.nextFloat();
			
			System.out.print("\nIngrese su altua (metros): ");
			altura = input.nextFloat();
			
			
			imc = peso/(altura*altura);
			
			if(imc < 18.5){
				System.out.println("\nVALORES DE BMI"
						 		 + "\nBajo de peso: menos de 18.5"
						 		 + "\nNormal:       entre 18.5 y 24.9"
						 		 + "\nSobrepeso:    entre 25 y 29.9"
						 		 + "\nObesidad:     30 o mas"
						 		 + "\n\nSu IMC es: " + imc + " **BAJO DE PESO**");
			}
			else if(imc >= 18.5 && imc <= 24.9){
				System.out.println("\nVALORES DE BMI"
						 		 + "\nBajo de peso: menos de 18.5"
						 		 + "\nNormal:       entre 18.5 y 24.9"
						 		 + "\nSobrepeso:    entre 25 y 29.9"
						 		 + "\nObesidad:     30 o mas"
						 		 + "\n\nSu IMC es: " + imc + " **NORMAL**");
			}
			else if(imc >= 25 && imc <= 29.9){
				System.out.println("\nVALORES DE BMI"
				 		 		 + "\nBajo de peso: menos de 18.5"
				 		 		 + "\nNormal:       entre 18.5 y 24.9"
				 		 		 + "\nSobrepeso:    entre 25 y 29.9"
				 		 		 + "\nObesidad:     30 o mas"
				 		 		 + "\n\nSu IMC es: " + imc + " **SOBREPESO**");
			}
			else{
				System.out.println("\nVALORES DE BMI"
		 		 		 		 + "\nBajo de peso: menos de 18.5"
		 		 		 		 + "\nNormal:       entre 18.5 y 24.9"
		 		 		 		 + "\nSobrepeso:    entre 25 y 29.9"
		 		 		 		 + "\nObesidad:     30 o mas"
		 		 		 		 + "\n\nSu IMC es: " + imc + " **OBESIDAD**");
			}
		}
		
		
		else{
			System.out.println("\n***Selección errónea***");
		}
		
		
	}

}
