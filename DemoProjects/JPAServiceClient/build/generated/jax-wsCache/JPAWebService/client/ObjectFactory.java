
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddEmployee_QNAME = new QName("http://service/", "addEmployee");
    private final static QName _Employee_QNAME = new QName("http://service/", "employee");
    private final static QName _GetAllEmployees_QNAME = new QName("http://service/", "getAllEmployees");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://service/", "getAllEmployeesResponse");
    private final static QName _GetEmployeesOnSal_QNAME = new QName("http://service/", "getEmployeesOnSal");
    private final static QName _GetEmployeesOnSalResponse_QNAME = new QName("http://service/", "getEmployeesOnSalResponse");
    private final static QName _RemoveEmployee_QNAME = new QName("http://service/", "removeEmployee");
    private final static QName _UpdateEmployee_QNAME = new QName("http://service/", "updateEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetEmployeesOnSal }
     * 
     */
    public GetEmployeesOnSal createGetEmployeesOnSal() {
        return new GetEmployeesOnSal();
    }

    /**
     * Create an instance of {@link GetEmployeesOnSalResponse }
     * 
     */
    public GetEmployeesOnSalResponse createGetEmployeesOnSalResponse() {
        return new GetEmployeesOnSalResponse();
    }

    /**
     * Create an instance of {@link RemoveEmployee }
     * 
     */
    public RemoveEmployee createRemoveEmployee() {
        return new RemoveEmployee();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesOnSal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeesOnSal }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEmployeesOnSal")
    public JAXBElement<GetEmployeesOnSal> createGetEmployeesOnSal(GetEmployeesOnSal value) {
        return new JAXBElement<GetEmployeesOnSal>(_GetEmployeesOnSal_QNAME, GetEmployeesOnSal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesOnSalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeesOnSalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEmployeesOnSalResponse")
    public JAXBElement<GetEmployeesOnSalResponse> createGetEmployeesOnSalResponse(GetEmployeesOnSalResponse value) {
        return new JAXBElement<GetEmployeesOnSalResponse>(_GetEmployeesOnSalResponse_QNAME, GetEmployeesOnSalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "removeEmployee")
    public JAXBElement<RemoveEmployee> createRemoveEmployee(RemoveEmployee value) {
        return new JAXBElement<RemoveEmployee>(_RemoveEmployee_QNAME, RemoveEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

}
