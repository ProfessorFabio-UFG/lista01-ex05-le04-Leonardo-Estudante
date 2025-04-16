package main;

import java.time.LocalDate;

import models.*;

public class Main {
	public static void main(String[] args) {
		Morador mor = new Morador("Leo", "4104567", "62984132", LocalDate.of(1990,  5, 10), 'M', 12, 301, "123");
		Morador mor2 = new Morador("Ana Paula", "98765432100", "62991234567", LocalDate.of(1985, 8, 25), 'F', 3, 204, "ACESSO456");
		
		Apartamento apt = new Apartamento(301, 2, 1234.56, "Alugado");
		
		System.out.println("Lista de moradores antes da remoção de mor");
		apt.addMorador(mor);
		apt.addMorador(mor2);
		apt.listarMorador();
		
		System.out.println("\nLista de moradores após a remocação de mor");
		apt.removeMorador(mor);
		apt.listarMorador();
	}
}
