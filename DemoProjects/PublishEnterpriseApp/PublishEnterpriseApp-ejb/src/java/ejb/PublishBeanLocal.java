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
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface PublishBeanLocal {
    
    void addCustomer(String firstName, String lastName);
    void updateCustomer(int custid, String firstName, String lastName);
    void removeCustomer(int custid);
    Collection<Customer> getAllCustomers();
    Collection<Customer> getAllCustomersByFirstName(String firstName);
   Collection<Customer> getAllCustomersByLastName(String lastName);
    Customer getCustomer(int custid);
    
    void addAddressToCustomer(String street, String city, String state, String zip, int custid);
    void removeAddressFromCustomer(int addressid, int custid);
    Collection<Address> getAllAddressesOfCustomer(int custid);
    Collection<Address> getAddressesByCity(String city);
    Customer getCustomerByAddress(int addressid);
    
    void createSubscription(String title, String type);
    void updateSubscription(int subid, String title, String type);
    void removeSubscription(int subid);
    Collection<Subscription> getSubscriptionsByType(String type);
    Collection<Subscription> getSubscriptionsByTitle(String title);
    
    void addSubscriptionsToCustomer(int custid, Collection<Integer> subIds);
    void removeSubscriptionsFromCustomer(int custid, Collection<Integer> subIds);
    Collection<Customer> getAllCustomersOfSubscription(int subid);
    Collection<Subscription> getAllSubscriptionsOfCustomer(int custid);
   }
