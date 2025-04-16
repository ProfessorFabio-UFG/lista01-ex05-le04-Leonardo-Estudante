package models;

import java.util.ArrayList;

public class Apartamento {
	private int numero;
	private int andar;
	private double metragem;
	private String situacao;
	private ArrayList<Morador> listMorador;

	public Apartamento(int numero, int andar, double metragem, String situacao) {
		super();
		this.numero = numero;
		this.andar = andar;
		this.metragem = metragem;
		this.situacao = situacao;
		this.listMorador = new ArrayList<Morador>();
		;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public ArrayList<Morador> getListMorador() {
		return listMorador;
	}

	public void setListMorador(ArrayList<Morador> listMorador) {
		this.listMorador = listMorador;
	}

	public void addMorador(Morador mor) {
		if (mor == null) {
			System.out.println("Erro, morador não instanciado");
		}
		
		listMorador.add(mor);
		System.out.println("Morador com o Cpf: " + mor.getCpf() + " adicionado a lista de moradores");
	}

	public void removeMorador(Morador mor) {
		if (mor == null) {
			System.out.println("Erro, morador não instanciado");
		}

		listMorador.removeIf(m -> m.getCpf().equals(mor.getCpf()));
		System.out.println("Morador com o CPF: " + mor.getCpf() + " removido da lista de moradores");
	}
	
	public void listarMorador() {
		for(Morador m : listMorador) {
			System.out.println(m);
		}
	}

}
