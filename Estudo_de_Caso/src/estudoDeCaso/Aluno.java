package estudoDeCaso;

import estudoDeCaso.enums.EscolaridadeEnum;

public class Aluno extends Pessoa {
	//Vari�veis
	private EscolaridadeEnum escolaridade;

	//M�todos
	public EscolaridadeEnum getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(EscolaridadeEnum escolaridade) {
		this.escolaridade = escolaridade;
	}
	
}
