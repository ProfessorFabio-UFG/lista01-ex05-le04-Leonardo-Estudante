package models;

import java.time.LocalDate;

public class Morador {
	private String nome;
	private String cpf;
	private String celular;
	private LocalDate dataNascimento;
	private char sexo;
	private int bloco;
	private int apto;
	private String codigoAcesso;
	
	public Morador(String nome, String cpf, String celular, LocalDate dataNascimento, char sexo, int bloco, int apto,
			String codigoAcesso) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.bloco = bloco;
		this.apto = apto;
		this.codigoAcesso = codigoAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getBloco() {
		return bloco;
	}

	public void setBloco(int bloco) {
		this.bloco = bloco;
	}

	public int getApto() {
		return apto;
	}

	public void setApto(int apto) {
		this.apto = apto;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	@Override
	public String toString() {
		return "Morador [nome=" + nome + ", cpf=" + cpf + ", celular=" + celular + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", bloco=" + bloco + ", apto=" + apto + ", codigoAcesso=" + codigoAcesso + "]";
	}
	
}
