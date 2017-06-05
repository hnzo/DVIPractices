/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanToEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author hnzo
 */
public class personStart {
    
    
    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("DVI-Uebung1PU")
                .createEntityManager();
    }
}
