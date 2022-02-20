package estudoDeCaso;

import estudoDeCaso.enums.EscolaridadeEnum;

public class Aluno extends Pessoa {
	//Variáveis
	private EscolaridadeEnum escolaridade;

	//Métodos
	public EscolaridadeEnum getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(EscolaridadeEnum escolaridade) {
		this.escolaridade = escolaridade;
	}
	
}
