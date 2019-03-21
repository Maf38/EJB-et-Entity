/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import entity.Aeroport;
import java.util.Collection;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import session.beanSessionLocal;

/**
 *
 * @author gai
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService {

    @EJB
    private beanSessionLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "hello")
    public String hello() {
        return ejbRef.hello();
    }
    
    @WebMethod(operationName = "getAllAeroport")
    public Collection<entity.Aeroport> getAllAeroport(){
        return ejbRef.getAllAeroport();
    }
    

    
}
