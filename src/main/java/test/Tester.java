/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Book;
import entity.Customer;
import enums.CustomerType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oerte
 */
public class Tester {
    
    public static void main(String[] args) {
        
        
        //Persistence.generateSchema("pu", null);
        Book b1 = new Book("Star Wars");
        Book b2 = new Book("Die Säulen der Erde");
        Customer c1 = new Customer("Joerg", "Oertel",CustomerType.GOLD);
        Customer c2 = new Customer("Karl", "Man",CustomerType.RUSTY);
        c1.addPhone("28123663", "Hallo Phone");
        c2.addPhone("526985", "Hallo other Phone");
        
        
        c1.setHobbie("running");
        System.out.println(b1);
        System.out.println(b2);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(b1);
            em.persist(b2);
            em.persist(c1);
            em.persist(c2);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        System.out.println(b1);
        System.out.println(b2);
    }
    
}
