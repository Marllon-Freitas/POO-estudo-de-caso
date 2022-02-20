package estudoDeCaso;

import java.util.Date;
import estudoDeCaso.enums.StatusMatriculaEnum;

public class Matricula {
	//Variáveis
	private Aluno aluno;
	private Curso curso;
	private Date data;
	private StatusMatriculaEnum statusMatricula;
	
	//Métodos
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public StatusMatriculaEnum getStatusMatricula() {
		return statusMatricula;
	}
	public void setStatusMatricula(StatusMatriculaEnum statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	
}
