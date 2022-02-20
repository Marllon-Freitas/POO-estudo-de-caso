package estudoDeCaso;

import java.util.Date;
//import java.sql.Time;

public class Curso {
	//Variáveis
	private Integer id;
	private String nome;
	private AreaCurso area;
	private Integer cargaHoraria;
	private Date dataInicio;
	private Date dataFim;
	private Date horarioInicio;
	private Date horarioFim;
	public final Integer maxCargaHoraria = 300;
	
	//Métodos
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
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Date getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	
	public Date getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(Date horarioFim) {
		this.horarioFim = horarioFim;
	}
	
}
