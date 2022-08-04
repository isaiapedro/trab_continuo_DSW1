package br.ufscar.dc.dsw.domain;

public class BaseUser {
	
	private String email;
    private String senha;
    private String nome;
    private String CPF;

	public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(final String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

	private String getCPF() {
		return CPF;
	}

	private void setCPF(final String cPF) {
		this.CPF = cPF;
	}
	
}