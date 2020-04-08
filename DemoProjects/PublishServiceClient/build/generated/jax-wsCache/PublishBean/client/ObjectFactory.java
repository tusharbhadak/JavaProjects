
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

    private final static QName _AddAddressToCustomer_QNAME = new QName("http://ejb/", "addAddressToCustomer");
    private final static QName _AddAddressToCustomerResponse_QNAME = new QName("http://ejb/", "addAddressToCustomerResponse");
    private final static QName _AddCustomer_QNAME = new QName("http://ejb/", "addCustomer");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://ejb/", "addCustomerResponse");
    private final static QName _AddSubscriptionsToCustomer_QNAME = new QName("http://ejb/", "addSubscriptionsToCustomer");
    private final static QName _AddSubscriptionsToCustomerResponse_QNAME = new QName("http://ejb/", "addSubscriptionsToCustomerResponse");
    private final static QName _Address_QNAME = new QName("http://ejb/", "address");
    private final static QName _CreateSubscription_QNAME = new QName("http://ejb/", "createSubscription");
    private final static QName _CreateSubscriptionResponse_QNAME = new QName("http://ejb/", "createSubscriptionResponse");
    private final static QName _Customer_QNAME = new QName("http://ejb/", "customer");
    private final static QName _GetAddressesByCity_QNAME = new QName("http://ejb/", "getAddressesByCity");
    private final static QName _GetAddressesByCityResponse_QNAME = new QName("http://ejb/", "getAddressesByCityResponse");
    private final static QName _GetAllAddressesOfCustomer_QNAME = new QName("http://ejb/", "getAllAddressesOfCustomer");
    private final static QName _GetAllAddressesOfCustomerResponse_QNAME = new QName("http://ejb/", "getAllAddressesOfCustomerResponse");
    private final static QName _GetAllCustomers_QNAME = new QName("http://ejb/", "getAllCustomers");
    private final static QName _GetAllCustomersByFirstName_QNAME = new QName("http://ejb/", "getAllCustomersByFirstName");
    private final static QName _GetAllCustomersByFirstNameResponse_QNAME = new QName("http://ejb/", "getAllCustomersByFirstNameResponse");
    private final static QName _GetAllCustomersByLastName_QNAME = new QName("http://ejb/", "getAllCustomersByLastName");
    private final static QName _GetAllCustomersByLastNameResponse_QNAME = new QName("http://ejb/", "getAllCustomersByLastNameResponse");
    private final static QName _GetAllCustomersOfSubscription_QNAME = new QName("http://ejb/", "getAllCustomersOfSubscription");
    private final static QName _GetAllCustomersOfSubscriptionResponse_QNAME = new QName("http://ejb/", "getAllCustomersOfSubscriptionResponse");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://ejb/", "getAllCustomersResponse");
    private final static QName _GetAllSubscriptionsOfCustomer_QNAME = new QName("http://ejb/", "getAllSubscriptionsOfCustomer");
    private final static QName _GetAllSubscriptionsOfCustomerResponse_QNAME = new QName("http://ejb/", "getAllSubscriptionsOfCustomerResponse");
    private final static QName _GetCustomer_QNAME = new QName("http://ejb/", "getCustomer");
    private final static QName _GetCustomerByAddress_QNAME = new QName("http://ejb/", "getCustomerByAddress");
    private final static QName _GetCustomerByAddressResponse_QNAME = new QName("http://ejb/", "getCustomerByAddressResponse");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://ejb/", "getCustomerResponse");
    private final static QName _GetSubscriptionsByTitle_QNAME = new QName("http://ejb/", "getSubscriptionsByTitle");
    private final static QName _GetSubscriptionsByTitleResponse_QNAME = new QName("http://ejb/", "getSubscriptionsByTitleResponse");
    private final static QName _GetSubscriptionsByType_QNAME = new QName("http://ejb/", "getSubscriptionsByType");
    private final static QName _GetSubscriptionsByTypeResponse_QNAME = new QName("http://ejb/", "getSubscriptionsByTypeResponse");
    private final static QName _RemoveAddressFromCustomer_QNAME = new QName("http://ejb/", "removeAddressFromCustomer");
    private final static QName _RemoveAddressFromCustomerResponse_QNAME = new QName("http://ejb/", "removeAddressFromCustomerResponse");
    private final static QName _RemoveCustomer_QNAME = new QName("http://ejb/", "removeCustomer");
    private final static QName _RemoveCustomerResponse_QNAME = new QName("http://ejb/", "removeCustomerResponse");
    private final static QName _RemoveSubscription_QNAME = new QName("http://ejb/", "removeSubscription");
    private final static QName _RemoveSubscriptionResponse_QNAME = new QName("http://ejb/", "removeSubscriptionResponse");
    private final static QName _RemoveSubscriptionsFromCustomer_QNAME = new QName("http://ejb/", "removeSubscriptionsFromCustomer");
    private final static QName _RemoveSubscriptionsFromCustomerResponse_QNAME = new QName("http://ejb/", "removeSubscriptionsFromCustomerResponse");
    private final static QName _Subscription_QNAME = new QName("http://ejb/", "subscription");
    private final static QName _UpdateCustomer_QNAME = new QName("http://ejb/", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://ejb/", "updateCustomerResponse");
    private final static QName _UpdateSubscription_QNAME = new QName("http://ejb/", "updateSubscription");
    private final static QName _UpdateSubscriptionResponse_QNAME = new QName("http://ejb/", "updateSubscriptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAddressToCustomer }
     * 
     */
    public AddAddressToCustomer createAddAddressToCustomer() {
        return new AddAddressToCustomer();
    }

    /**
     * Create an instance of {@link AddAddressToCustomerResponse }
     * 
     */
    public AddAddressToCustomerResponse createAddAddressToCustomerResponse() {
        return new AddAddressToCustomerResponse();
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link AddSubscriptionsToCustomer }
     * 
     */
    public AddSubscriptionsToCustomer createAddSubscriptionsToCustomer() {
        return new AddSubscriptionsToCustomer();
    }

    /**
     * Create an instance of {@link AddSubscriptionsToCustomerResponse }
     * 
     */
    public AddSubscriptionsToCustomerResponse createAddSubscriptionsToCustomerResponse() {
        return new AddSubscriptionsToCustomerResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link CreateSubscription }
     * 
     */
    public CreateSubscription createCreateSubscription() {
        return new CreateSubscription();
    }

    /**
     * Create an instance of {@link CreateSubscriptionResponse }
     * 
     */
    public CreateSubscriptionResponse createCreateSubscriptionResponse() {
        return new CreateSubscriptionResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link GetAddressesByCity }
     * 
     */
    public GetAddressesByCity createGetAddressesByCity() {
        return new GetAddressesByCity();
    }

    /**
     * Create an instance of {@link GetAddressesByCityResponse }
     * 
     */
    public GetAddressesByCityResponse createGetAddressesByCityResponse() {
        return new GetAddressesByCityResponse();
    }

    /**
     * Create an instance of {@link GetAllAddressesOfCustomer }
     * 
     */
    public GetAllAddressesOfCustomer createGetAllAddressesOfCustomer() {
        return new GetAllAddressesOfCustomer();
    }

    /**
     * Create an instance of {@link GetAllAddressesOfCustomerResponse }
     * 
     */
    public GetAllAddressesOfCustomerResponse createGetAllAddressesOfCustomerResponse() {
        return new GetAllAddressesOfCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link GetAllCustomersByFirstName }
     * 
     */
    public GetAllCustomersByFirstName createGetAllCustomersByFirstName() {
        return new GetAllCustomersByFirstName();
    }

    /**
     * Create an instance of {@link GetAllCustomersByFirstNameResponse }
     * 
     */
    public GetAllCustomersByFirstNameResponse createGetAllCustomersByFirstNameResponse() {
        return new GetAllCustomersByFirstNameResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomersByLastName }
     * 
     */
    public GetAllCustomersByLastName createGetAllCustomersByLastName() {
        return new GetAllCustomersByLastName();
    }

    /**
     * Create an instance of {@link GetAllCustomersByLastNameResponse }
     * 
     */
    public GetAllCustomersByLastNameResponse createGetAllCustomersByLastNameResponse() {
        return new GetAllCustomersByLastNameResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomersOfSubscription }
     * 
     */
    public GetAllCustomersOfSubscription createGetAllCustomersOfSubscription() {
        return new GetAllCustomersOfSubscription();
    }

    /**
     * Create an instance of {@link GetAllCustomersOfSubscriptionResponse }
     * 
     */
    public GetAllCustomersOfSubscriptionResponse createGetAllCustomersOfSubscriptionResponse() {
        return new GetAllCustomersOfSubscriptionResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link GetAllSubscriptionsOfCustomer }
     * 
     */
    public GetAllSubscriptionsOfCustomer createGetAllSubscriptionsOfCustomer() {
        return new GetAllSubscriptionsOfCustomer();
    }

    /**
     * Create an instance of {@link GetAllSubscriptionsOfCustomerResponse }
     * 
     */
    public GetAllSubscriptionsOfCustomerResponse createGetAllSubscriptionsOfCustomerResponse() {
        return new GetAllSubscriptionsOfCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerByAddress }
     * 
     */
    public GetCustomerByAddress createGetCustomerByAddress() {
        return new GetCustomerByAddress();
    }

    /**
     * Create an instance of {@link GetCustomerByAddressResponse }
     * 
     */
    public GetCustomerByAddressResponse createGetCustomerByAddressResponse() {
        return new GetCustomerByAddressResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionsByTitle }
     * 
     */
    public GetSubscriptionsByTitle createGetSubscriptionsByTitle() {
        return new GetSubscriptionsByTitle();
    }

    /**
     * Create an instance of {@link GetSubscriptionsByTitleResponse }
     * 
     */
    public GetSubscriptionsByTitleResponse createGetSubscriptionsByTitleResponse() {
        return new GetSubscriptionsByTitleResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionsByType }
     * 
     */
    public GetSubscriptionsByType createGetSubscriptionsByType() {
        return new GetSubscriptionsByType();
    }

    /**
     * Create an instance of {@link GetSubscriptionsByTypeResponse }
     * 
     */
    public GetSubscriptionsByTypeResponse createGetSubscriptionsByTypeResponse() {
        return new GetSubscriptionsByTypeResponse();
    }

    /**
     * Create an instance of {@link RemoveAddressFromCustomer }
     * 
     */
    public RemoveAddressFromCustomer createRemoveAddressFromCustomer() {
        return new RemoveAddressFromCustomer();
    }

    /**
     * Create an instance of {@link RemoveAddressFromCustomerResponse }
     * 
     */
    public RemoveAddressFromCustomerResponse createRemoveAddressFromCustomerResponse() {
        return new RemoveAddressFromCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomer }
     * 
     */
    public RemoveCustomer createRemoveCustomer() {
        return new RemoveCustomer();
    }

    /**
     * Create an instance of {@link RemoveCustomerResponse }
     * 
     */
    public RemoveCustomerResponse createRemoveCustomerResponse() {
        return new RemoveCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscription }
     * 
     */
    public RemoveSubscription createRemoveSubscription() {
        return new RemoveSubscription();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionResponse }
     * 
     */
    public RemoveSubscriptionResponse createRemoveSubscriptionResponse() {
        return new RemoveSubscriptionResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionsFromCustomer }
     * 
     */
    public RemoveSubscriptionsFromCustomer createRemoveSubscriptionsFromCustomer() {
        return new RemoveSubscriptionsFromCustomer();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionsFromCustomerResponse }
     * 
     */
    public RemoveSubscriptionsFromCustomerResponse createRemoveSubscriptionsFromCustomerResponse() {
        return new RemoveSubscriptionsFromCustomerResponse();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscription }
     * 
     */
    public UpdateSubscription createUpdateSubscription() {
        return new UpdateSubscription();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionResponse }
     * 
     */
    public UpdateSubscriptionResponse createUpdateSubscriptionResponse() {
        return new UpdateSubscriptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAddressToCustomer")
    public JAXBElement<AddAddressToCustomer> createAddAddressToCustomer(AddAddressToCustomer value) {
        return new JAXBElement<AddAddressToCustomer>(_AddAddressToCustomer_QNAME, AddAddressToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAddressToCustomerResponse")
    public JAXBElement<AddAddressToCustomerResponse> createAddAddressToCustomerResponse(AddAddressToCustomerResponse value) {
        return new JAXBElement<AddAddressToCustomerResponse>(_AddAddressToCustomerResponse_QNAME, AddAddressToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionsToCustomer")
    public JAXBElement<AddSubscriptionsToCustomer> createAddSubscriptionsToCustomer(AddSubscriptionsToCustomer value) {
        return new JAXBElement<AddSubscriptionsToCustomer>(_AddSubscriptionsToCustomer_QNAME, AddSubscriptionsToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionsToCustomerResponse")
    public JAXBElement<AddSubscriptionsToCustomerResponse> createAddSubscriptionsToCustomerResponse(AddSubscriptionsToCustomerResponse value) {
        return new JAXBElement<AddSubscriptionsToCustomerResponse>(_AddSubscriptionsToCustomerResponse_QNAME, AddSubscriptionsToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createSubscription")
    public JAXBElement<CreateSubscription> createCreateSubscription(CreateSubscription value) {
        return new JAXBElement<CreateSubscription>(_CreateSubscription_QNAME, CreateSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createSubscriptionResponse")
    public JAXBElement<CreateSubscriptionResponse> createCreateSubscriptionResponse(CreateSubscriptionResponse value) {
        return new JAXBElement<CreateSubscriptionResponse>(_CreateSubscriptionResponse_QNAME, CreateSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByCity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByCity }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByCity")
    public JAXBElement<GetAddressesByCity> createGetAddressesByCity(GetAddressesByCity value) {
        return new JAXBElement<GetAddressesByCity>(_GetAddressesByCity_QNAME, GetAddressesByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByCityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByCityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByCityResponse")
    public JAXBElement<GetAddressesByCityResponse> createGetAddressesByCityResponse(GetAddressesByCityResponse value) {
        return new JAXBElement<GetAddressesByCityResponse>(_GetAddressesByCityResponse_QNAME, GetAddressesByCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAddressesOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAddressesOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllAddressesOfCustomer")
    public JAXBElement<GetAllAddressesOfCustomer> createGetAllAddressesOfCustomer(GetAllAddressesOfCustomer value) {
        return new JAXBElement<GetAllAddressesOfCustomer>(_GetAllAddressesOfCustomer_QNAME, GetAllAddressesOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAddressesOfCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAddressesOfCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllAddressesOfCustomerResponse")
    public JAXBElement<GetAllAddressesOfCustomerResponse> createGetAllAddressesOfCustomerResponse(GetAllAddressesOfCustomerResponse value) {
        return new JAXBElement<GetAllAddressesOfCustomerResponse>(_GetAllAddressesOfCustomerResponse_QNAME, GetAllAddressesOfCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomers")
    public JAXBElement<GetAllCustomers> createGetAllCustomers(GetAllCustomers value) {
        return new JAXBElement<GetAllCustomers>(_GetAllCustomers_QNAME, GetAllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByFirstName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByFirstName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersByFirstName")
    public JAXBElement<GetAllCustomersByFirstName> createGetAllCustomersByFirstName(GetAllCustomersByFirstName value) {
        return new JAXBElement<GetAllCustomersByFirstName>(_GetAllCustomersByFirstName_QNAME, GetAllCustomersByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByFirstNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByFirstNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersByFirstNameResponse")
    public JAXBElement<GetAllCustomersByFirstNameResponse> createGetAllCustomersByFirstNameResponse(GetAllCustomersByFirstNameResponse value) {
        return new JAXBElement<GetAllCustomersByFirstNameResponse>(_GetAllCustomersByFirstNameResponse_QNAME, GetAllCustomersByFirstNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByLastName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByLastName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersByLastName")
    public JAXBElement<GetAllCustomersByLastName> createGetAllCustomersByLastName(GetAllCustomersByLastName value) {
        return new JAXBElement<GetAllCustomersByLastName>(_GetAllCustomersByLastName_QNAME, GetAllCustomersByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByLastNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersByLastNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersByLastNameResponse")
    public JAXBElement<GetAllCustomersByLastNameResponse> createGetAllCustomersByLastNameResponse(GetAllCustomersByLastNameResponse value) {
        return new JAXBElement<GetAllCustomersByLastNameResponse>(_GetAllCustomersByLastNameResponse_QNAME, GetAllCustomersByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersOfSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersOfSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersOfSubscription")
    public JAXBElement<GetAllCustomersOfSubscription> createGetAllCustomersOfSubscription(GetAllCustomersOfSubscription value) {
        return new JAXBElement<GetAllCustomersOfSubscription>(_GetAllCustomersOfSubscription_QNAME, GetAllCustomersOfSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersOfSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersOfSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersOfSubscriptionResponse")
    public JAXBElement<GetAllCustomersOfSubscriptionResponse> createGetAllCustomersOfSubscriptionResponse(GetAllCustomersOfSubscriptionResponse value) {
        return new JAXBElement<GetAllCustomersOfSubscriptionResponse>(_GetAllCustomersOfSubscriptionResponse_QNAME, GetAllCustomersOfSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllSubscriptionsOfCustomer")
    public JAXBElement<GetAllSubscriptionsOfCustomer> createGetAllSubscriptionsOfCustomer(GetAllSubscriptionsOfCustomer value) {
        return new JAXBElement<GetAllSubscriptionsOfCustomer>(_GetAllSubscriptionsOfCustomer_QNAME, GetAllSubscriptionsOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsOfCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsOfCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllSubscriptionsOfCustomerResponse")
    public JAXBElement<GetAllSubscriptionsOfCustomerResponse> createGetAllSubscriptionsOfCustomerResponse(GetAllSubscriptionsOfCustomerResponse value) {
        return new JAXBElement<GetAllSubscriptionsOfCustomerResponse>(_GetAllSubscriptionsOfCustomerResponse_QNAME, GetAllSubscriptionsOfCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByAddress")
    public JAXBElement<GetCustomerByAddress> createGetCustomerByAddress(GetCustomerByAddress value) {
        return new JAXBElement<GetCustomerByAddress>(_GetCustomerByAddress_QNAME, GetCustomerByAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByAddressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByAddressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByAddressResponse")
    public JAXBElement<GetCustomerByAddressResponse> createGetCustomerByAddressResponse(GetCustomerByAddressResponse value) {
        return new JAXBElement<GetCustomerByAddressResponse>(_GetCustomerByAddressResponse_QNAME, GetCustomerByAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsByTitle")
    public JAXBElement<GetSubscriptionsByTitle> createGetSubscriptionsByTitle(GetSubscriptionsByTitle value) {
        return new JAXBElement<GetSubscriptionsByTitle>(_GetSubscriptionsByTitle_QNAME, GetSubscriptionsByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsByTitleResponse")
    public JAXBElement<GetSubscriptionsByTitleResponse> createGetSubscriptionsByTitleResponse(GetSubscriptionsByTitleResponse value) {
        return new JAXBElement<GetSubscriptionsByTitleResponse>(_GetSubscriptionsByTitleResponse_QNAME, GetSubscriptionsByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsByType")
    public JAXBElement<GetSubscriptionsByType> createGetSubscriptionsByType(GetSubscriptionsByType value) {
        return new JAXBElement<GetSubscriptionsByType>(_GetSubscriptionsByType_QNAME, GetSubscriptionsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsByTypeResponse")
    public JAXBElement<GetSubscriptionsByTypeResponse> createGetSubscriptionsByTypeResponse(GetSubscriptionsByTypeResponse value) {
        return new JAXBElement<GetSubscriptionsByTypeResponse>(_GetSubscriptionsByTypeResponse_QNAME, GetSubscriptionsByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressFromCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddressFromCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAddressFromCustomer")
    public JAXBElement<RemoveAddressFromCustomer> createRemoveAddressFromCustomer(RemoveAddressFromCustomer value) {
        return new JAXBElement<RemoveAddressFromCustomer>(_RemoveAddressFromCustomer_QNAME, RemoveAddressFromCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressFromCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddressFromCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAddressFromCustomerResponse")
    public JAXBElement<RemoveAddressFromCustomerResponse> createRemoveAddressFromCustomerResponse(RemoveAddressFromCustomerResponse value) {
        return new JAXBElement<RemoveAddressFromCustomerResponse>(_RemoveAddressFromCustomerResponse_QNAME, RemoveAddressFromCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCustomer")
    public JAXBElement<RemoveCustomer> createRemoveCustomer(RemoveCustomer value) {
        return new JAXBElement<RemoveCustomer>(_RemoveCustomer_QNAME, RemoveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCustomerResponse")
    public JAXBElement<RemoveCustomerResponse> createRemoveCustomerResponse(RemoveCustomerResponse value) {
        return new JAXBElement<RemoveCustomerResponse>(_RemoveCustomerResponse_QNAME, RemoveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscription")
    public JAXBElement<RemoveSubscription> createRemoveSubscription(RemoveSubscription value) {
        return new JAXBElement<RemoveSubscription>(_RemoveSubscription_QNAME, RemoveSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionResponse")
    public JAXBElement<RemoveSubscriptionResponse> createRemoveSubscriptionResponse(RemoveSubscriptionResponse value) {
        return new JAXBElement<RemoveSubscriptionResponse>(_RemoveSubscriptionResponse_QNAME, RemoveSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionsFromCustomer")
    public JAXBElement<RemoveSubscriptionsFromCustomer> createRemoveSubscriptionsFromCustomer(RemoveSubscriptionsFromCustomer value) {
        return new JAXBElement<RemoveSubscriptionsFromCustomer>(_RemoveSubscriptionsFromCustomer_QNAME, RemoveSubscriptionsFromCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionsFromCustomerResponse")
    public JAXBElement<RemoveSubscriptionsFromCustomerResponse> createRemoveSubscriptionsFromCustomerResponse(RemoveSubscriptionsFromCustomerResponse value) {
        return new JAXBElement<RemoveSubscriptionsFromCustomerResponse>(_RemoveSubscriptionsFromCustomerResponse_QNAME, RemoveSubscriptionsFromCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "subscription")
    public JAXBElement<Subscription> createSubscription(Subscription value) {
        return new JAXBElement<Subscription>(_Subscription_QNAME, Subscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateSubscription")
    public JAXBElement<UpdateSubscription> createUpdateSubscription(UpdateSubscription value) {
        return new JAXBElement<UpdateSubscription>(_UpdateSubscription_QNAME, UpdateSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateSubscriptionResponse")
    public JAXBElement<UpdateSubscriptionResponse> createUpdateSubscriptionResponse(UpdateSubscriptionResponse value) {
        return new JAXBElement<UpdateSubscriptionResponse>(_UpdateSubscriptionResponse_QNAME, UpdateSubscriptionResponse.class, null, value);
    }

}
