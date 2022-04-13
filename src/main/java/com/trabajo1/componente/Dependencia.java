package com.trabajo1.componente;

import java.util.ArrayList;

public interface Dependencia {
	void salidaMensaje(String Mensaje);
	int leerTeclado();
	String suma(int a, int b);
	String resta(int a, int b);
	String multiplica(int a, int b);
	String divide(int a, int b);	
	String mayor(int a, int b);
	ArrayList<String> table(int tabladel);
}
