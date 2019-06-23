/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.descompila.model.bean.dao;

import br.com.david.model.bean.Categoria;
import br.com.descompila.model.bean.connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author David Alex Farina
 */
public class CategoriaDAO {
    
    public Categoria save(Categoria categoria){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            if(categoria.getId() == null){/*Salvar caso for null*/
                em.persist(categoria);
            }else{
                em.merge(categoria);/*Atualiza caso seja diferente de null*/
            }     
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
           em.close();
        }
        return categoria;
    }
    public Categoria findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        Categoria categoria = null;
        
        try {
            categoria = em.find(Categoria.class, id);
        } catch (Exception e) {           
            System.err.println(e);
        }finally{
            em.close();
        }
        return categoria;
    }   
    
    public List<Categoria> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Categoria> categorias = null;
        
        try {
            categorias = em.createQuery("from Categoria c").getResultList();
            
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return categorias;
    }
    
    public Categoria remove(Integer id){
        
        EntityManager em = new ConnectionFactory().getConnection();
        Categoria categoria =  null;
        try {
            
            categoria = em.find(Categoria.class, id);
            
            em.getTransaction().begin();
            em.remove(categoria);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
       return categoria;
    }
}
