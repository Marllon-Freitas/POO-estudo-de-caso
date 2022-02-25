package estudoDeCaso;

import java.util.Date;
//import java.sql.Time;

public class Curso {
	//Variáveis
	private Integer id;
	private String nome;
	private AreaCurso area;
	private Turma turma;
	private Integer cargaHoraria;
	public final Integer maxCargaHoraria = 300;
	
	//Métodos
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public AreaCurso getArea() {
		return area;
	}
	public void setArea(AreaCurso area) {
		this.area = area;
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		if(cargaHoraria <= maxCargaHoraria) {			
			this.cargaHoraria = cargaHoraria;
		}
	}
}
