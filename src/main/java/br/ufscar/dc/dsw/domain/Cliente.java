package br.ufscar.dc.dsw.domain;

public class Cliente extends BaseUser {
	
	private boolean adm;
	private String telefone;
    private String sexo;
    private String data_nascimento;
	
	private boolean isAdm() {
		return adm;
	}
	private void setAdm(boolean adm) {
		this.adm = adm;
	}
	
	private String getTelefone() {
		return telefone;
	}
	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	private String getSexo() {
		return sexo;
	}
	private void setSexo(String sexo) {
		this.sexo = sexo;
	}
	private String getData_nascimento() {
		return data_nascimento;
	}
	private void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
}
