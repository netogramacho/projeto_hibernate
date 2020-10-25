/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesDAO;

import Entidades.Editora;
import IEntidadesDAO.IEditoraDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduar
 */
public class EditoraDAO implements IEditoraDAO{
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public EntityManagerFactory getEntityManagerFactory(){
        if(this.emf == null){
            this.emf =  Persistence.createEntityManagerFactory("HibernatePU");
        }
        return emf;         
    }

    @Override
    public void SalvarEditora(Editora editora) {
        this.getEntityManagerFactory();
        em.getTransaction().begin();
        try{
            em.persist(editora);
            em.getTransaction().commit();
            System.out.println("Editora cadastrada!");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        } 
    }
    
}
