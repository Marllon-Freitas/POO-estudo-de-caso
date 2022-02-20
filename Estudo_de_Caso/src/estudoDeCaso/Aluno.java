package estudoDeCaso;

import estudoDeCaso.enums.EscolaridadeEnum;

public class Aluno extends Pessoa {
	//Variáveis
	private EscolaridadeEnum escolaridade;
	private Curso cursando;

	//Métodos
	public EscolaridadeEnum getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(EscolaridadeEnum escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	public Curso getCursando() {
		return cursando;
	}
	public void setCursando(Curso cursando) {
		this.cursando = cursando;
	}
	
}
