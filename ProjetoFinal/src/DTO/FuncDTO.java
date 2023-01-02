/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author danil
 */
public class FuncDTO {
    
    private int cod_func;
    private String nome_func;
    private String senha_func;
    private String tipo;

    public FuncDTO(int cod_func, String nome_func, String tipo) {
        this.cod_func = cod_func;
        this.nome_func = nome_func;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "id: " + this.cod_func + " nome: " + this.nome_func +
                " cargo: " + this.tipo;
    }
    
    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getSenha_func() {
        return senha_func;
    }

    public void setSenha_func(String senha_func) {
        this.senha_func = senha_func;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
