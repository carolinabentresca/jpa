/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import entity.Personal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JPA {

    
    public static void main(String[] args) {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
     EntityManager em = emf.createEntityManager();
     EntityTransaction et = em.getTransaction();
     
     et.begin();
     
     //Insert
     Personal per = new Personal();
     per.setId(55);
     per.setNombre("coco");
     per.setApellido("rey");
     per.setEmail("cocoRey@email.com");
     per.setActividad("vendedor");
     em.persist(per);
     
    /* 
     //Update
     Personal per1 = em.find(Personal.class,55);
     per1.setNombre("coco");
     per1.setApellido("rey");
     per1.setEmail("coco33Rey@email.com");
     per1.setActividad("vendedor");
     em.merge(per1);
     */
    
    
    /*
     //Delete
     Personal per2 = em.find(Personal.class,55);
     em.remove(per2);
     */  
    
     et.commit();
    }
    
}
