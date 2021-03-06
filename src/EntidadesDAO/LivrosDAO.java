/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesDAO;

import Entidades.Livros;
import IEntidadesDAO.ILivrosDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduar
 */
public class LivrosDAO implements ILivrosDAO{
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public EntityManagerFactory getEntityManagerFactory(){
        if(this.emf == null){
            this.emf =  Persistence.createEntityManagerFactory("HibernatePU");
        }
        return emf;         
    }    

    @Override
    public void SalvarAutor(Livros livro) {
        
        this.getEntityManagerFactory();
        this.em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(livro);
            em.getTransaction().commit();
            System.out.println("Autor cadastrado!");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        } 
        em.close();
        emf.close();
    }          
}
