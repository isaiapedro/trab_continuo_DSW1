package br.ufscar.dc.dsw.domain;

public class BaseUser {
    private String nomeLogin, nome, senha, email;

    public void setNomeLogin(final String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(final String senha) {
        this.senha = senha;
    }
}