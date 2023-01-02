/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author danil
 */
public class ProdDTO {
    private int cod_prod;
    private String nome_prod;
    private String unid_prod;
    private double preco_prod;
    
    

    public ProdDTO(int cod_prod, String nome_prod, String unid_prod, double preco_prod) {
        this.cod_prod = cod_prod;
        this.nome_prod = nome_prod;
        this.unid_prod = unid_prod;
        this.preco_prod = preco_prod;
    }

     @Override
    public String toString() {
        return "id: " + this.cod_prod + " nome: " + this.nome_prod +
                " un: " + this.unid_prod + " preco: " + this.preco_prod;
    }
    
//    public void setCategoria(){
//        this.categoria = categoria;
//    }
//    
//    public String getCategoria(){
//        return categoria;
//    }
    
    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getUnid_prod() {
        return unid_prod;
    }

    public void setUnid_prod(String unid_prod) {
        this.unid_prod = unid_prod;
    }

    public double getPreco_prod() {
        return preco_prod;
    }

    public void setPreco_prod(double preco_prod) {
        this.preco_prod = preco_prod;
    }
}
