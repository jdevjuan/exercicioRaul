package Exercicio01;

import java.util.Objects;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Aniversariante outro = (Aniversariante) obj;

		return Objects.equals(this.nome, outro.nome)
				&& Objects.equals(this.dataAniversario, outro.dataAniversario);

		
	}
}