/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.descompila.model.bean.tests;

import br.com.david.model.bean.Categoria;
import br.com.david.model.bean.Produto;
import br.com.descompila.model.bean.dao.ProdutoDAO;

/**
 *
 * @author David Alex Farina
 */
public class ProdutoTest {
    public static void main(String[] args) {
        /*Método para inserir novo produto*/
       /* ProdutoDAO dao = new ProdutoDAO();
        
        Categoria categoria = new Categoria();
        categoria.setId(4);
                
        Produto produto = new Produto();                        
        produto.setDescricao("Arroz");
        produto.setQtd(10);
        produto.setValor(4.50);
        produto.setCategoria(categoria);
        
        dao.save(produto);
       */ 
       
       
       /*Método para atualizar produto*/
      /* ProdutoDAO dao = new ProdutoDAO();
        
        Categoria categoria = new Categoria();
        categoria.setId(3);
                
        Produto produto = new Produto();  
        produto.setId(5);
        produto.setDescricao("Carne");
        produto.setQtd(3);
        produto.setValor(19.90);
        produto.setCategoria(categoria);
        
        dao.save(produto);*/
      
      
      /*Método para busca produto por id*/
       /*ProdutoDAO dao = new ProdutoDAO();
        
        Produto produto = dao.findById(3);
        System.out.println("Descrição: "+produto.getDescricao());        
      System.out.println("Valor: "+produto.getValor());
        System.out.println("QTD: "+produto.getQtd());
        System.out.println("Categoria: "+produto.getCategoria().getDescricao());*/
        
       
      /*Método para litar tudo*/ 
       /*ProdutoDAO dao = new ProdutoDAO();
        
        for(Produto produto : dao.findAll()){
        System.out.println("Descrição: "+produto.getDescricao());        
        System.out.println("QTD: "+produto.getQtd());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Categoria: "+produto.getCategoria().getDescricao());
    }*/
       
        /*Método para remover*/ 
        ProdutoDAO dao = new ProdutoDAO();
        dao.remove(6);
        
        
    }
}
