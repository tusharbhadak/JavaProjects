/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Employee;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface JPABeanLocal {
    
    Collection<Employee> getAllEmployees();
    void addEmployee(int empno, String ename, double sal);
      void updateEmployee(int empno, String ename, double sal);
     void removeEmployee(int empno);
     Collection<Employee> getEmployeesOnSal(double sal);
    
    
    
}
