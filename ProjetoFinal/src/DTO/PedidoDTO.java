/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ronil
 */
public class PedidoDTO {
    
        private int id_pedido;
        private int num_pedido;
        private String produto_pedido;
        private double valor;
        private int quantidade_pedido;
        private String tipoPedido_pedido;
        private double preco_pedido;  
     
        String[] porPeso = {"Pão Francês", "Presunto", "Mussarela", "Queijo Prato", "Mortadela", "Peito de Peru", "Lombo", "Salame"};
        
    
    
    
    public boolean porPeso(){
        for(int i=0; i<porPeso.length; i++){
            if(porPeso[i].equals(this.getProduto_pedido())){
                this.setValor(0);
                return true;
            }
            
        }
        return false;
    }
   
    
    public boolean paes(){
            switch (this.getProduto_pedido()){
                case "Baguete":
                    this.setValor(24);
                    return true;
                case "Broa de Milho":
                    this.setValor(1);
                    return true;
                case "Brioche":
                    this.setValor(13.75);
                    return true;
                case "Pão de Leite":
                    this.setValor(5.60);
                    return true;
                case "Pão Italiano":
                    this.setValor(10);
                    return true;
            }
        return false;  
    }
    
    
    public boolean doces(){
        
            switch (this.getProduto_pedido()){
                case "Torta de Limão":
                    this.setValor(6.70);
                    return true;
                case "Torta de Morango":
                    this.setValor(6.70);
                    return true;
                case "Sonho":
                    this.setValor(3.00);
                    return true;
                case "Bolo de Briguadeiro":
                    this.setValor(6.70);
                    return true;
                case "Bolo de Cenoura":
                    this.setValor(5.70);
                    return true;
                case "Bomba de Chocolate":
                    this.setValor(3.70);
                    return true;
            
        }
        return false;
    }
    
    public boolean lanches(){
            switch (this.getProduto_pedido()){
                case "Hamburguer":
                    this.setValor(21);
                    return true;
                case "Coxinha":
                    this.setValor(3.50);
                    return true;
                case "Bauru":
                    this.setValor(3.80);
                    return true;
                case "Beirute":
                    this.setValor(25);
                    return true;
                case "Misto Quente":
                    this.setValor(3.50);
                    return true;
                case "Sanduíche Natural":
                    this.setValor(5);
                    return true;
                case "Sanduíche Mortadela":
                    this.setValor(3);
                    return true;
                case "Torta Salgada":
                    this.setValor(4.40);
                    return true;
            }
        return false;  
    }
    
    public boolean bebidas(){
            switch (this.getProduto_pedido()){
                case "Coca-Cola 300ml":
                    this.setValor(3.60);
                    return true;
                case "Coca-Cola 300ml / Copo com gelo":
                    this.setValor(3.50);
                    return true;
                case "Coca-Cola 1,5L":
                    this.setValor(7);
                    return true;
                case "Coca-Cola 1,5L / Copo com gelo":
                    this.setValor(7);
                    return true;
                case "Água Mineral 500ml":
                    this.setValor(4);
                    return true;
                case "Água com Gás 500ml":
                    this.setValor(4);
                    return true;
                case "Cerveja Brahma 350ml":
                    this.setValor(2.99);
                    return true;
                case "Cerveja Brahma 350ml / Copo com gelo":
                    this.setValor(2.99);
                    return true;
                case "Cerveja Brahma 1L":
                    this.setValor(6.80);
                    return true;
                case "Cerveja Brahma 1L / Copo com gelo":
                    this.setValor(6.80);
                    return true;
                case "Suco de Laranja":
                    this.setValor(5);
                    return true;
                case "Suco de Laranja / Copo com gelo":
                    this.setValor(5);
                    return true;
                case "Café":
                    this.setValor(5);
                    return true;
                case "Capuccinno":
                    this.setValor(5);
                    return true;
            }
        return false;  
    }
    
    
    
    public String mensagem(){
        return "Este produto tem o preço baseado no peso, portanto não tem um valor fixo! \n Por favor, leve até o caixa ou procure um atendente para te ajudar !!";
    }
    
    
    
    
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getProduto_pedido() {
        return produto_pedido;
    }

    public void setProduto_pedido(String produto_pedido) {
        this.produto_pedido = produto_pedido;
    }

    public int getQuantidade_pedido() {
        return quantidade_pedido;
    }

    public void setQuantidade_pedido(int quantidade_pedido) {
        this.quantidade_pedido = quantidade_pedido;
    }

    public String getTipoPedido_pedido() {
        return tipoPedido_pedido;
    }

    public void setTipoPedido_pedido(String tipoPedido_pedido) {
        this.tipoPedido_pedido = tipoPedido_pedido;
    }

    public double getPreco_pedido() {
        return preco_pedido;
    }

    public void setPreco_pedido(double preco_pedido) {
        this.preco_pedido = preco_pedido;
    }
}
  