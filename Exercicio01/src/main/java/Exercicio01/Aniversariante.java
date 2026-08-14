package Exercicio01;

import java.util.Objects;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}

	public Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Aniversariante)) {
			return false;
		}

		Aniversariante outro = (Aniversariante) obj;

		return Objects.equals(this.nome, outro.nome)
				&& Objects.equals(this.dataAniversario, outro.dataAniversario);
	}

	public String getNome() {
		return nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}
}