package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
	
	Curso curso1 = new Curso();
	curso1.setTitulo("Java");
	curso1.setDescricao("Curso de Java para iniciates");
	curso1.setCargaHoraria(22);
	
	Curso curso2 = new Curso();
	curso2.setTitulo("JavaScript");
	curso2.setDescricao("Curso de JavaScript para iniciantes");
	curso2.setCargaHoraria(8);
	
	Mentoria mentoria = new Mentoria();
	mentoria.setTitulo("Programa��o Orientada a Objetos");
	mentoria.setDescricao("Xpto");
	mentoria.setData(LocalDate.now());
	
	Bootcamp bootcamp = new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescricao("Xpto");
	bootcamp.getConteudos().add(curso1);
	bootcamp.getConteudos().add(curso2);
	bootcamp.getConteudos().add(mentoria);
	
	// Dev 1
	Dev devVitoria = new Dev();
	devVitoria.setNome("Vit�ria Ferreira");
	devVitoria.inscreverBootcamp(bootcamp);
	System.out.println("Conteudos inscritos " + devVitoria.getNome() + devVitoria.getConteudoInscritos());
	
	devVitoria.progredir();
	
	System.out.println("Conteudos inscritos " + devVitoria.getNome() + devVitoria.getConteudoInscritos());
	System.out.println("Conteudos conclu�dos " + devVitoria.getNome() + devVitoria.getConteudosConcluidos());
	System.out.println("XP " + devVitoria.calcularTotalXP());
	
	// Dev 2
	Dev devJoao = new Dev();
	devJoao.setNome("Joao Neves");
	devJoao.inscreverBootcamp(bootcamp);
	System.out.println("Conteudos inscritos " + devJoao.getNome() + devJoao.getConteudoInscritos());
	
	devJoao.progredir();
	
	System.out.println("Conteudos inscritos " + devJoao.getNome() + devJoao.getConteudoInscritos());
	System.out.println("Conteudos concluidos " + devJoao.getNome() + devJoao.getConteudosConcluidos());
	System.out.println("XP " + devJoao.calcularTotalXP());
	
	
	
	}

}
