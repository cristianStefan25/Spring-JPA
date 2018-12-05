/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ro.cristian.db.ProdusDB;

/**
 *
 * @author crist
 */
@Repository
public class ProductDao {

    @PersistenceContext
    private EntityManager em;

    public void adaugaProdus(ProdusDB produs) {
        em.persist(produs);
        em.flush();
    }
}
