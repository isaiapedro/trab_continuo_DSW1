package br.ufscar.dc.dsw.domain;

public class Prestador extends BaseUser{

	private String area;
    private String especialidade;
    //????????? curriculo em PDF;
	
	private String getArea() {
		return area;
	}
	private void setArea(String area) {
		this.area = area;
	}
	private String getEspecialidade() {
		return especialidade;
	}
	private void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}    
}
