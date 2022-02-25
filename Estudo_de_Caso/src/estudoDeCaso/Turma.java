package estudoDeCaso;

import java.util.Date;

public class Turma {
    //Variáveis
	private Integer id;
	private Date dataInicio;
	private Date dataFim;
	private Date horarioInicio;
	private Date horarioFim;
	
	//Métodos
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
