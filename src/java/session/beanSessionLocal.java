/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Aeroport;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author gai
 */
@Local
public interface beanSessionLocal {
        String hello();

    /**
     *
     * @return
     */
    public Collection<entity.Aeroport> getAllAeroport();
}
