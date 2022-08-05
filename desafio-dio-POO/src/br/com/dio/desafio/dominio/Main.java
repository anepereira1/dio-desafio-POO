package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("decrição curso java");
		curso1.setCargaHoraria(9);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso java");
		curso2.setDescricao("decrição curso java");
		curso2.setCargaHoraria(7);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAne = new Dev();
		devAne.setNome("Ane");
		devAne.inscreverBootcamp(bootcamp);
		devAne.progredir();
		
		System.out.println("-");
		System.out.println("Conteudos Inscritos Ane: " + devAne.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Ane: " + devAne.getConteudoConcluidos());
		System.out.println("XP: " + devAne.calcularTotalXp());
		
		System.out.println("--------");
		
		
		Dev devMag = new Dev();
		devMag.setNome("Mag");
		devMag.inscreverBootcamp(bootcamp);
		devMag.progredir();
		devMag.progredir();
		devMag.progredir();
		System.out.println("-");
		
		
		System.out.println("Conteudos Inscritos Mag: " + devMag.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Mag: " + devMag.getConteudoConcluidos());
		System.out.println("XP: " + devMag.calcularTotalXp());

	}

}
