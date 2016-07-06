package Compilador;

	import java.io.*;
	public class Ejemplo{
	public void suma(int a, int b){
	  System.out.println("La suma de A + B es: "+a+b);
	}
	public static void main(String []args){
	 int num1=2,num2=4;
	 Ejemplo obj=new Ejemplo();
	 obj.suma(num1,num2);
	 }
	}
