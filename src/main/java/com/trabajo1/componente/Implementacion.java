package com.trabajo1.componente;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Implementacion implements Dependencia {

	@Override
	public void salidaMensaje(String Mensaje) {
		System.out.println("la respuesta es: ");
		System.out.println(Mensaje);
		
	}

	@Override
	public int leerTeclado() {
		System.out.println("ingrese un valor:");
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}

	@Override
	public String suma(int a, int b) {
		int suma=a+b;
		return String.valueOf(suma);
	}

	@Override
	public String resta(int a, int b) {
		int resta=a-b;
		return String.valueOf(resta);
	}

	@Override
	public String multiplica(int a, int b) {
		int multiplica=a*b;
		return String.valueOf(multiplica);
	}

	@Override
	public String divide(int a, int b) {
		int divide=a/b;
		return String.valueOf(divide);
	}

	@Override
	public String mayor(int a, int b) {
		if (a>b) {
			return("a es mayor que b:"+a);
		}else {
			return("b es mayor que a:"+b);
		}
			}

	@Override
	public ArrayList<String> table(int tabladel) {
		ArrayList<String> listar=new ArrayList<>();
		for(int i=0;i<10;i++) {
			listar.add(String.valueOf(i*tabladel));		
			
		}
		return listar;
	}
}
