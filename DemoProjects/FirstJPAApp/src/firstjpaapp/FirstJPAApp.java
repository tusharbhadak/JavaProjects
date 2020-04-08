/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjpaapp;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author root
 */
public class FirstJPAApp {
    EntityManagerFactory emf;
    EntityManager em;
    Collection<Employee> employees;

    /**
     * @param args the command line arguments
     */
    
    
    
    public FirstJPAApp() {
       
        emf = Persistence.createEntityManagerFactory("fpu");
        em = emf.createEntityManager();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        FirstJPAApp app = new FirstJPAApp();
        //app.addEmployee(17, "Pramod Shukla", 9000.00);
       // app.updateEmployee(17, "Suman Tiwari", 10000.00);
        app.removeEmployee(17);
        Collection<Employee> emps =  app.getAllEmployees();
        
        for(Employee e : emps)
        {
            System.out.println(e.getEmpno()+"\t"+ e.getEname()+"\t"+ e.getSalary());
        }
    }
    
    Collection<Employee> getAllEmployees()
    {
       employees = em.createNamedQuery("Employee.findAll").getResultList();
        
        
        
        return employees;
    }
    
    public void addEmployee(int empno, String ename, double sal)
    {
        Employee e = new Employee();
        e.setEmpno(empno);
        e.setEname(ename);
        e.setSalary(sal);
        
        em.getTransaction().begin();
        
        em.persist(e);
        em.getTransaction().commit();
            
        
    }
    
     public void updateEmployee(int empno, String ename, double sal)
    {
        Employee e = (Employee) em.find(Employee.class, empno);
        e.setEmpno(empno);
        e.setEname(ename);
        e.setSalary(sal);
        
        em.getTransaction().begin();
        
        em.merge(e);
        em.getTransaction().commit();
            
        
    }
     
     public void removeEmployee(int empno)
     {
         Employee e = (Employee) em.find(Employee.class, empno);
        
         em.getTransaction().begin();
        
        em.remove(e);
        em.getTransaction().commit();
     }
}
