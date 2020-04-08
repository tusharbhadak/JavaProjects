/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import ejb.JPABeanLocal;
import entity.Employee;
import java.util.Collection;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author root
 */
@WebService(serviceName = "JPAWebService")
@Stateless()
public class JPAWebService {

    @EJB
    private JPABeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getAllEmployees")
    public Collection<Employee> getAllEmployees() {
        return ejbRef.getAllEmployees();
    }

    @WebMethod(operationName = "addEmployee")
    @Oneway
    public void addEmployee(@WebParam(name = "empno") int empno, @WebParam(name = "ename") String ename, @WebParam(name = "sal") double sal) {
        ejbRef.addEmployee(empno, ename, sal);
    }

    @WebMethod(operationName = "updateEmployee")
    @Oneway
    public void updateEmployee(@WebParam(name = "empno") int empno, @WebParam(name = "ename") String ename, @WebParam(name = "sal") double sal) {
        ejbRef.updateEmployee(empno, ename, sal);
    }

    @WebMethod(operationName = "removeEmployee")
    @Oneway
    public void removeEmployee(@WebParam(name = "empno") int empno) {
        ejbRef.removeEmployee(empno);
    }

    @WebMethod(operationName = "getEmployeesOnSal")
    public Collection<Employee> getEmployeesOnSal(@WebParam(name = "sal") double sal) {
        return ejbRef.getEmployeesOnSal(sal);
    }
    
}
