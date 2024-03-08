/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author diogo
 */
public class Livros {
    
    private String titulo;
    private String autor;
    private String ano_publi;
    private String codigo;
    private int qtd;
    
    
    // COnstrutor
    public Livros(String titulo, String autor, String ano_publi, String codigo, int qtd){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publi = ano_publi;
        this.codigo = codigo;
        this.qtd = qtd;
        
}
    // METODOS
    public boolean Emprestimo(int livro){
       livro=10;
        if (qtd>0){
            qtd =- livro;
            
            
            return true;
            
        }
        else{
            return false;
        } 
}
    
    
   public boolean Devolucao(int livro){
   if(qtd<10){
      qtd+=livro;
   
       return true;
   }
   return false;
   
   
   } 
   
    
    //Encapsulamento
    

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ano_publi
     */
    public String getAno_publi() {
        return ano_publi;
    }

    /**
     * @param ano_publi the ano_publi to set
     */
    public void setAno_publi(String ano_publi) {
        this.ano_publi = ano_publi;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
   public int getQtd() {
        return qtd;
    }

    /**
        * @param qtd the codigo to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    } 
    
    
    
}
