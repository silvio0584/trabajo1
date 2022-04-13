package com.trabajo1;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabajo1.componente.Dependencia;

@SpringBootApplication
public class Trabajo1Application implements CommandLineRunner {

	Dependencia dependencia;
	
	public Trabajo1Application(Dependencia dependencia) {
		super();
		this.dependencia = dependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*//suma
		this.dependencia.salidaMensaje(this.dependencia.suma(dependencia.leerTeclado(), dependencia.leerTeclado()));
		//resta
		this.dependencia.salidaMensaje(this.dependencia.resta(dependencia.leerTeclado(), dependencia.leerTeclado()));
		//multiplicacion
		this.dependencia.salidaMensaje(this.dependencia.multiplica(dependencia.leerTeclado(), dependencia.leerTeclado()));
		//division
		this.dependencia.salidaMensaje(this.dependencia.divide(dependencia.leerTeclado(), dependencia.leerTeclado()));
		//mayor de dos numeros
		this.dependencia.salidaMensaje(this.dependencia.mayor(this.dependencia.leerTeclado(),this.dependencia.leerTeclado()));
		*///tabla del:
		ArrayList<String> vector= this.dependencia.table(this.dependencia.leerTeclado());
		for(String valor:vector) {
			dependencia.salidaMensaje(valor);
		}
	}

}
