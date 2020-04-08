/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Address;
import entity.Customer;
import entity.Subscription;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@WebService
@Stateless
public class PublishBean implements PublishBeanLocal {
@PersistenceContext(unitName = "Publish")
EntityManager em;

    @Override
    public void addCustomer(String firstName, String lastName) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Customer c = new Customer();
        c.setFirstName(firstName);
        c.setLastName(lastName);
        em.persist(c);
    
    }

    @Override
    public void updateCustomer(int custid, String firstName, String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCustomer(int custid) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
      Customer c = (Customer) em.find(Customer.class, custid);
      em.remove(c);
    }

    @Override
    public Collection<Customer> getAllCustomers() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return em.createNamedQuery("Customer.findAll").getResultList();
    }

    @Override
    public Collection<Customer> getAllCustomersByFirstName(String firstName) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    return em.createNamedQuery("Customer.findByFirstName").setParameter("firstName", firstName).getResultList();
    }

    @Override
    public Collection<Customer> getAllCustomersByLastName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(int custid) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (Customer) em.find(Customer.class, custid);
    }

    @Override
    public void addAddressToCustomer(String street, String city, String state, String zip, int custid) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        Customer c = (Customer) em.find(Customer.class, custid);
        Collection<Address> addresses = c.getAddressCollection();
        
        Address a = new Address();
        a.setStreet(street); a.setCity(city); a.setState(state);
        a.setZip(zip);
        a.setCustomer(c);
        
        addresses.add(a);
        c.setAddressCollection(addresses);
        em.persist(a);
        em.merge(c);
    
    
    
    
    
    }

    @Override
    public void removeAddressFromCustomer(int addressid, int custid) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Customer c = (Customer) em.find(Customer.class, custid);
        Address address = (Address) em.find(Address.class, addressid);
        Collection<Address> addresses = c.getAddressCollection();
        
        if(addresses.contains(address))
        {
            addresses.remove(address);
            
             c.setAddressCollection(addresses);
            em.remove(address);
            em.merge(c);
        }
        
        
        
      
       
    
    
    
    
    
    }

    @Override
    public Collection<Address> getAllAddressesOfCustomer(int custid) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         Customer c = (Customer) em.find(Customer.class, custid);
         return c.getAddressCollection();
    }

    @Override
    public Collection<Address> getAddressesByCity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomerByAddress(int addressid) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Address address = (Address) em.find(Address.class, addressid);
     
       return address.getCustomer();
    }

    @Override
    public void createSubscription(String title, String type) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Subscription s = new Subscription();
        s.setTitle(title); s.setType(type);
        em.persist(s);
    
    }

    @Override
    public void updateSubscription(int subid, String title, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSubscription(int subid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Subscription> getSubscriptionsByType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Subscription> getSubscriptionsByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSubscriptionsToCustomer(int custid, Collection<Integer> subIds) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         Customer c = (Customer) em.find(Customer.class, custid);
         Collection<Subscription> subscriptions = c.getSubscriptionCollection();
         
         for(Integer sid : subIds)
         {
           Subscription s = (Subscription) em.find(Subscription.class, sid);
           Collection<Customer> customers = s.getCustomerCollection();
            
           if(!subscriptions.contains(s))
           {
               subscriptions.add(s);
               customers.add(c);
               s.setCustomerCollection(customers);
               c.setSubscriptionCollection(subscriptions);
               em.merge(c);
               
               
           }
             
             
             
             
             
         }
         
    
    
    
    
    
    }

    @Override
    public void removeSubscriptionsFromCustomer(int custid, Collection<Integer> subIds) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    Customer c = (Customer) em.find(Customer.class, custid);
         Collection<Subscription> subscriptions = c.getSubscriptionCollection();
         
         for(Integer sid : subIds)
         {
           Subscription s = (Subscription) em.find(Subscription.class, sid);
           Collection<Customer> customers = s.getCustomerCollection();
            
           if(subscriptions.contains(s))
           {
               subscriptions.remove(s);
               customers.remove(c);
               s.setCustomerCollection(customers);
               c.setSubscriptionCollection(subscriptions);
               em.merge(c);
               
               
           }
             
             
             
             
             
         }
         
    }

    @Override
    public Collection<Customer> getAllCustomersOfSubscription(int subid) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Subscription s = (Subscription) em.find(Subscription.class, subid);
        
    return s.getCustomerCollection();
    }

    @Override
    public Collection<Subscription> getAllSubscriptionsOfCustomer(int custid) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      Customer c = (Customer) em.find(Customer.class, custid);
 
    return c.getSubscriptionCollection();
    }



}
