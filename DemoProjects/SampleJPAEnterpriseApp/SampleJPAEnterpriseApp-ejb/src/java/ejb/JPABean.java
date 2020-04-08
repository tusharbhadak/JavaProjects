/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Employee;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class JPABean implements JPABeanLocal {
    
    @PersistenceContext(unitName = "JPAPU")
    EntityManager em;

    @Override
    public Collection<Employee> getEmployeesOnSal(double sal) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  // Collection<Employee> emps2 = em.createNativeQuery("select * from employee where salary>5000").getResultList();
 //Collection<Employee> emps1 = em.createQuery("SELECT e FROM Employee e WHERE e.salary >= :salary").getResultList();
    Collection<Employee> emps = em.createNamedQuery("Employee.findBySalary")
            .setParameter("salary", 5000.00)
            .getResultList();
    return emps;
    
    }

    @Override
    public Collection<Employee> getAllEmployees() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Collection<Employee> employees = em.createNamedQuery("Employee.findAll").getResultList();
    return employees;
    }

    @Override
    public void addEmployee(int empno, String ename, double sal) {
         Employee e = new Employee();
        e.setEmpno(empno);
        e.setEname(ename);
        e.setSalary(sal);
               
        em.persist(e);
       
    
    }

    @Override
    public void updateEmployee(int empno, String ename, double sal) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     Employee e = (Employee) em.find(Employee.class, empno);
        e.setEmpno(empno);
        e.setEname(ename);
        e.setSalary(sal);
      
        em.merge(e);
        
            
    
    }

    @Override
    public void removeEmployee(int empno) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     Employee e = (Employee) em.find(Employee.class, empno);
        
                
        em.remove(e);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")



}
