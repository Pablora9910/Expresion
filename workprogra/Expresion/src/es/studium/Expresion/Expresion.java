package es.studium.Expresion;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		float resultado = 0;
		System.out.println( "Dame la incógnitat a" );
		a=teclado.nextInt();
		System.out.println( "Dame la incógnitat b" );
		b=teclado.nextInt();
		System.out.println( "Dame la incógnitat c" );
		c=teclado.nextInt();
		resultado=expresion(a,b,c);
		System.out.println( "El resultado es " + resultado);
		teclado.close();
	}
	
	public static float expresion(int a, int b, int c)
	{
		float resultado;
		resultado=((float)b*(float)b-4*(float)a*(float)c)/2*(float)a;
		return(resultado);
	}

}





/*
PROGRAMA ejercicio16
VARIABLES
	ENTERO a,b,c
	REAL r
INICIO
	ESCRIBIR "Introduce la incongnita a:"
	LEER a
	ESCRIBIR "Introduce la incongnita b:"
	LEER b
	ESCRIBIR "Introduce la incongnita c:"
	LEER c
	r = funCalculo(a,b,c)
	ESCRIBIR "Resultado: "+ r
FIN

FUNCION funCalculo (ENTERO a,ENTERO b,ENTERO c) DEVUELVE REAL

VARIABLES
	REAL r
INICIO
	r=((b*b)-4*a*c)/2*a
	DEVOLVER r 
FIN*/