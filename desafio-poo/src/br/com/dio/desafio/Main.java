package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
	
	Curso curso1 = new Curso();

	curso1.setCargaHoraria(22);
	
	Curso curso2 = new Curso();

	curso2.setCargaHoraria(8);
	
	Mentoria mentoria = new Mentoria();

	mentoria.setData(LocalDate.now());
	
	System.out.println(curso1);
	System.out.println(curso2);
	System.out.println(mentoria);
	
	
	}

}
