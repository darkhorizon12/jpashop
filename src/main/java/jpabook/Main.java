package jpabook;

import jpabook.jpashop.domain.Book;
import jpabook.jpashop.domain.Item;
import jpabook.jpashop.domain.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;

/**
 * @author Kim Juon
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hello");

        EntityManager em = factory.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {

//            Book book = new Book();
//            book.setName("JPA");
//            book.setAuthor("김영한");
//
//            em.persist(book);

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        factory.close();
    }
}