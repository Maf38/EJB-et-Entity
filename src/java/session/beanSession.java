/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Aeroport;
import entity.Constructeur;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author gai
 */
@Stateless
public class beanSession implements beanSessionLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
    EntityManager em;

    @Override
    public String hello() {
        Short id = 2;
        Constructeur c = em.find(Constructeur.class, id);
        return "Coucou" + c.getNomConstructeur();

    }

    public Collection<entity.Aeroport> getAllAeroport() {
        String ejbql = "select a.nomAeroport from Aeroport a ";
        Collection<Aeroport> lesAeroports;
        try {
            Query query = em.createQuery(ejbql);
            lesAeroports = (Collection<entity.Aeroport>) query.getResultList();
            
        }
        catch(Exception ex){
        
            lesAeroports = null;
            System.out.println("Exception JPQL" + ex.getMessage());
        }
        return lesAeroports;
    }

    
}
