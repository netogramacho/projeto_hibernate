/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesDAO;

import Entidades.Autores;
import Entidades.Email;
import IEntidadesDAO.IAutoresDAO;
import java.util.ArrayList;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduar
 */
public class AutoresDAO implements IAutoresDAO {
    
    Autores autor = new Autores();
    Scanner imput = new Scanner(System.in);
    private EntityManagerFactory emf;
    private EntityManager em;
    int resposta;
    
    public EntityManagerFactory getEntityManagerFactory(){
        if(this.emf == null){
            this.emf =  Persistence.createEntityManagerFactory("HibernatePU");
        }
        return emf;         
    }
    
    @Override
    public void SalvarAutor(Autores autor) {
        this.getEntityManagerFactory();
        this.em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(autor);
            em.getTransaction().commit();
            System.out.println("Autor "+ autor.getNome() +" cadastrado!");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }
        //em.close();
        emf.close();
    }
    
}
