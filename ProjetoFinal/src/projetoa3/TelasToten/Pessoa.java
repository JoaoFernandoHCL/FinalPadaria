/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author 822161390
 */
public class Pessoa {
    private String email;
    private String senha;
    private String nome;
    private int cpf;

    public Pessoa(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public Pessoa() {}

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public boolean autentificacao(String email, String senha) {
        if (getEmail().equals(email) && getSenha().equals(senha)){
            return true;
        } else {
        return false;
        }    
    }
}
