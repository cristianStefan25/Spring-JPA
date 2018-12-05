/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.cristian.dao.ProductDao;
import ro.cristian.db.ProdusDB;

/**
 *
 * @author crist
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao dao;

    @Transactional
    public void adaugaZeceProduse() {
        for (int i = 1; i <= 10; i++) {
            ProdusDB p = new ProdusDB();
            p.setNume("Produs " + i);
            dao.adaugaProdus(p);
        }
    }
}
