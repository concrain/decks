
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the humana.websecurity.sl.webservice.messagetypes package. 
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

    private final static QName _ResponseGetActiveUsersForEntity_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetActiveUsersForEntity");
    private final static QName _ResponseGetAttributesForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetAttributesForUser");
    private final static QName _ResponseMenuXML_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseMenuXML");
    private final static QName _RequestFunctionsForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestFunctionsForUser");
    private final static QName _ResponseMenusForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseMenusForUser");
    private final static QName _RequestGetUserDemographicsByUserID_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetUserDemographicsByUserID");
    private final static QName _RequestEntityListFromAccessId_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestEntityListFromAccessId");
    private final static QName _ResponseGetUserAgreements_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetUserAgreements");
    private final static QName _RequestKeyType_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestKeyType");
    private final static QName _RequestGetFuncListForSysApp_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetFuncListForSysApp");
    private final static QName _ResponseBoolRoot_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseBoolRoot");
    private final static QName _RequestGetUserDemographicsByAkaName_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetUserDemographicsByAkaName");
    private final static QName _ResponseOrganizationList_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseOrganizationList");
    private final static QName _ResponseEntityAID_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseEntityAID");
    private final static QName _RequestAIDForEntity_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestAIDForEntity");
    private final static QName _RequestAIDQualified_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestAIDQualified");
    private final static QName _ResponseGetUserDemographics_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetUserDemographics");
    private final static QName _RequestForBFWithAIDsForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestForBFWithAIDsForUser");
    private final static QName _RequestForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestForUser");
    private final static QName _ResponseGetDemographicsForEntity_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetDemographicsForEntity");
    private final static QName _ResponseBFForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseBFForUser");
    private final static QName _RequestMenusForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestMenusForUser");
    private final static QName _RequestGetAttributesForUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetAttributesForUser");
    private final static QName _ResponseGetBFListForSystemApplication_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetBFListForSystemApplication");
    private final static QName _RequestGetActiveUsersForEntity_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetActiveUsersForEntity");
    private final static QName _RequestGetDemographicsForEntity_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetDemographicsForEntity");
    private final static QName _ResponseGetAttributesForEntityUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseGetAttributesForEntityUser");
    private final static QName _ResponseUserDTO_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "ResponseUserDTO");
    private final static QName _RequestGetAttributesForEntityUser_QNAME = new QName("urn:Humana:WebSecurity:SL:WebService:MessageTypes", "RequestGetAttributesForEntityUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: humana.websecurity.sl.webservice.messagetypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseGetActiveUsersForEntityBase }
     * 
     */
    public ResponseGetActiveUsersForEntityBase createResponseGetActiveUsersForEntityBase() {
        return new ResponseGetActiveUsersForEntityBase();
    }

    /**
     * Create an instance of {@link Function }
     * 
     */
    public Function createFunction() {
        return new Function();
    }

    /**
     * Create an instance of {@link ResponseEntityAIDBase }
     * 
     */
    public ResponseEntityAIDBase createResponseEntityAIDBase() {
        return new ResponseEntityAIDBase();
    }

    /**
     * Create an instance of {@link ResponseGetUserDemographics }
     * 
     */
    public ResponseGetUserDemographics createResponseGetUserDemographics() {
        return new ResponseGetUserDemographics();
    }

    /**
     * Create an instance of {@link RequestForBFWithAIDsForUser }
     * 
     */
    public RequestForBFWithAIDsForUser createRequestForBFWithAIDsForUser() {
        return new RequestForBFWithAIDsForUser();
    }

    /**
     * Create an instance of {@link ResponseGetAttributesForEntityUser }
     * 
     */
    public ResponseGetAttributesForEntityUser createResponseGetAttributesForEntityUser() {
        return new ResponseGetAttributesForEntityUser();
    }

    /**
     * Create an instance of {@link ResponseOrganizationList }
     * 
     */
    public ResponseOrganizationList createResponseOrganizationList() {
        return new ResponseOrganizationList();
    }

    /**
     * Create an instance of {@link ResponseBool }
     * 
     */
    public ResponseBool createResponseBool() {
        return new ResponseBool();
    }

    /**
     * Create an instance of {@link RequestKeyType }
     * 
     */
    public RequestKeyType createRequestKeyType() {
        return new RequestKeyType();
    }

    /**
     * Create an instance of {@link ResponseBFForUser }
     * 
     */
    public ResponseBFForUser createResponseBFForUser() {
        return new ResponseBFForUser();
    }

    /**
     * Create an instance of {@link ResponseGetActiveUsersForEntity }
     * 
     */
    public ResponseGetActiveUsersForEntity createResponseGetActiveUsersForEntity() {
        return new ResponseGetActiveUsersForEntity();
    }

    /**
     * Create an instance of {@link ResponseGetBFListForSystemApplication }
     * 
     */
    public ResponseGetBFListForSystemApplication createResponseGetBFListForSystemApplication() {
        return new ResponseGetBFListForSystemApplication();
    }

    /**
     * Create an instance of {@link RequestEntityListFromAccessId }
     * 
     */
    public RequestEntityListFromAccessId createRequestEntityListFromAccessId() {
        return new RequestEntityListFromAccessId();
    }

    /**
     * Create an instance of {@link RequestGetFuncListForSysApp }
     * 
     */
    public RequestGetFuncListForSysApp createRequestGetFuncListForSysApp() {
        return new RequestGetFuncListForSysApp();
    }

    /**
     * Create an instance of {@link ResponseUserDTO }
     * 
     */
    public ResponseUserDTO createResponseUserDTO() {
        return new ResponseUserDTO();
    }

    /**
     * Create an instance of {@link RequestAIDForEntity }
     * 
     */
    public RequestAIDForEntity createRequestAIDForEntity() {
        return new RequestAIDForEntity();
    }

    /**
     * Create an instance of {@link ResponseGetDemographicsForEntity }
     * 
     */
    public ResponseGetDemographicsForEntity createResponseGetDemographicsForEntity() {
        return new ResponseGetDemographicsForEntity();
    }

    /**
     * Create an instance of {@link ResponseEntityAID }
     * 
     */
    public ResponseEntityAID createResponseEntityAID() {
        return new ResponseEntityAID();
    }

    /**
     * Create an instance of {@link ResponseGetAttributesForUser }
     * 
     */
    public ResponseGetAttributesForUser createResponseGetAttributesForUser() {
        return new ResponseGetAttributesForUser();
    }

    /**
     * Create an instance of {@link RequestForUser }
     * 
     */
    public RequestForUser createRequestForUser() {
        return new RequestForUser();
    }

    /**
     * Create an instance of {@link RequestGetActiveUsersForEntity }
     * 
     */
    public RequestGetActiveUsersForEntity createRequestGetActiveUsersForEntity() {
        return new RequestGetActiveUsersForEntity();
    }

    /**
     * Create an instance of {@link RequestGetAttributesForUser }
     * 
     */
    public RequestGetAttributesForUser createRequestGetAttributesForUser() {
        return new RequestGetAttributesForUser();
    }

    /**
     * Create an instance of {@link RequestGetDemographicsForEntity }
     * 
     */
    public RequestGetDemographicsForEntity createRequestGetDemographicsForEntity() {
        return new RequestGetDemographicsForEntity();
    }

    /**
     * Create an instance of {@link ResponseGetUserAgreements }
     * 
     */
    public ResponseGetUserAgreements createResponseGetUserAgreements() {
        return new ResponseGetUserAgreements();
    }

    /**
     * Create an instance of {@link ResponseMenusForUser }
     * 
     */
    public ResponseMenusForUser createResponseMenusForUser() {
        return new ResponseMenusForUser();
    }

    /**
     * Create an instance of {@link ResponseMenuXML }
     * 
     */
    public ResponseMenuXML createResponseMenuXML() {
        return new ResponseMenuXML();
    }

    /**
     * Create an instance of {@link RequestMenusForUser }
     * 
     */
    public RequestMenusForUser createRequestMenusForUser() {
        return new RequestMenusForUser();
    }

    /**
     * Create an instance of {@link RequestGetAttributesForEntityUser }
     * 
     */
    public RequestGetAttributesForEntityUser createRequestGetAttributesForEntityUser() {
        return new RequestGetAttributesForEntityUser();
    }

    /**
     * Create an instance of {@link RequestGetUserDemographicsByUserID }
     * 
     */
    public RequestGetUserDemographicsByUserID createRequestGetUserDemographicsByUserID() {
        return new RequestGetUserDemographicsByUserID();
    }

    /**
     * Create an instance of {@link RequestAIDQualified }
     * 
     */
    public RequestAIDQualified createRequestAIDQualified() {
        return new RequestAIDQualified();
    }

    /**
     * Create an instance of {@link RequestFunctionsForUser }
     * 
     */
    public RequestFunctionsForUser createRequestFunctionsForUser() {
        return new RequestFunctionsForUser();
    }

    /**
     * Create an instance of {@link RequestGetUserDemographicsByAkaName }
     * 
     */
    public RequestGetUserDemographicsByAkaName createRequestGetUserDemographicsByAkaName() {
        return new RequestGetUserDemographicsByAkaName();
    }

    /**
     * Create an instance of {@link ResponseGetUserDemographicsBase }
     * 
     */
    public ResponseGetUserDemographicsBase createResponseGetUserDemographicsBase() {
        return new ResponseGetUserDemographicsBase();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link RequestEntityListFromAccessIdBase }
     * 
     */
    public RequestEntityListFromAccessIdBase createRequestEntityListFromAccessIdBase() {
        return new RequestEntityListFromAccessIdBase();
    }

    /**
     * Create an instance of {@link UserAttribute }
     * 
     */
    public UserAttribute createUserAttribute() {
        return new UserAttribute();
    }

    /**
     * Create an instance of {@link ResponseMenuXMLBase }
     * 
     */
    public ResponseMenuXMLBase createResponseMenuXMLBase() {
        return new ResponseMenuXMLBase();
    }

    /**
     * Create an instance of {@link RequestGetFuncListForSysAppBase }
     * 
     */
    public RequestGetFuncListForSysAppBase createRequestGetFuncListForSysAppBase() {
        return new RequestGetFuncListForSysAppBase();
    }

    /**
     * Create an instance of {@link MenuTemplate }
     * 
     */
    public MenuTemplate createMenuTemplate() {
        return new MenuTemplate();
    }

    /**
     * Create an instance of {@link ResponseGetUserAgreementsBase }
     * 
     */
    public ResponseGetUserAgreementsBase createResponseGetUserAgreementsBase() {
        return new ResponseGetUserAgreementsBase();
    }

    /**
     * Create an instance of {@link ArrayOfComment }
     * 
     */
    public ArrayOfComment createArrayOfComment() {
        return new ArrayOfComment();
    }

    /**
     * Create an instance of {@link RequestAIDQualifiedBase }
     * 
     */
    public RequestAIDQualifiedBase createRequestAIDQualifiedBase() {
        return new RequestAIDQualifiedBase();
    }

    /**
     * Create an instance of {@link ArrayOfMenuTemplate }
     * 
     */
    public ArrayOfMenuTemplate createArrayOfMenuTemplate() {
        return new ArrayOfMenuTemplate();
    }

    /**
     * Create an instance of {@link CodeDescriptionType }
     * 
     */
    public CodeDescriptionType createCodeDescriptionType() {
        return new CodeDescriptionType();
    }

    /**
     * Create an instance of {@link RequestGetUserDemographicsByUserIDBase }
     * 
     */
    public RequestGetUserDemographicsByUserIDBase createRequestGetUserDemographicsByUserIDBase() {
        return new RequestGetUserDemographicsByUserIDBase();
    }

    /**
     * Create an instance of {@link RequestGetAttributesForEntityUserBase }
     * 
     */
    public RequestGetAttributesForEntityUserBase createRequestGetAttributesForEntityUserBase() {
        return new RequestGetAttributesForEntityUserBase();
    }

    /**
     * Create an instance of {@link RequestKeyTypeBase }
     * 
     */
    public RequestKeyTypeBase createRequestKeyTypeBase() {
        return new RequestKeyTypeBase();
    }

    /**
     * Create an instance of {@link ResponseMenusForUserBase }
     * 
     */
    public ResponseMenusForUserBase createResponseMenusForUserBase() {
        return new ResponseMenusForUserBase();
    }

    /**
     * Create an instance of {@link ResponseUserDTOBase }
     * 
     */
    public ResponseUserDTOBase createResponseUserDTOBase() {
        return new ResponseUserDTOBase();
    }

    /**
     * Create an instance of {@link ResponseMessageBase }
     * 
     */
    public ResponseMessageBase createResponseMessageBase() {
        return new ResponseMessageBase();
    }

    /**
     * Create an instance of {@link ResponseGetDemographicsForEntityBase }
     * 
     */
    public ResponseGetDemographicsForEntityBase createResponseGetDemographicsForEntityBase() {
        return new ResponseGetDemographicsForEntityBase();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link RequestGetDemographicsForEntityBase }
     * 
     */
    public RequestGetDemographicsForEntityBase createRequestGetDemographicsForEntityBase() {
        return new RequestGetDemographicsForEntityBase();
    }

    /**
     * Create an instance of {@link RequestMenusForUserBase }
     * 
     */
    public RequestMenusForUserBase createRequestMenusForUserBase() {
        return new RequestMenusForUserBase();
    }

    /**
     * Create an instance of {@link ActiveUser }
     * 
     */
    public ActiveUser createActiveUser() {
        return new ActiveUser();
    }

    /**
     * Create an instance of {@link ResponseBoolBase }
     * 
     */
    public ResponseBoolBase createResponseBoolBase() {
        return new ResponseBoolBase();
    }

    /**
     * Create an instance of {@link RequestForUserBase }
     * 
     */
    public RequestForUserBase createRequestForUserBase() {
        return new RequestForUserBase();
    }

    /**
     * Create an instance of {@link ArrayOfFunction }
     * 
     */
    public ArrayOfFunction createArrayOfFunction() {
        return new ArrayOfFunction();
    }

    /**
     * Create an instance of {@link RequestForBFWithAIDsForUserBase }
     * 
     */
    public RequestForBFWithAIDsForUserBase createRequestForBFWithAIDsForUserBase() {
        return new RequestForBFWithAIDsForUserBase();
    }

    /**
     * Create an instance of {@link ResponseBFForUserBase }
     * 
     */
    public ResponseBFForUserBase createResponseBFForUserBase() {
        return new ResponseBFForUserBase();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link RequestAIDForEntityBase }
     * 
     */
    public RequestAIDForEntityBase createRequestAIDForEntityBase() {
        return new RequestAIDForEntityBase();
    }

    /**
     * Create an instance of {@link ArrayOfAgreementDTO }
     * 
     */
    public ArrayOfAgreementDTO createArrayOfAgreementDTO() {
        return new ArrayOfAgreementDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrganization }
     * 
     */
    public ArrayOfOrganization createArrayOfOrganization() {
        return new ArrayOfOrganization();
    }

    /**
     * Create an instance of {@link RequestFunctionsForUserBase }
     * 
     */
    public RequestFunctionsForUserBase createRequestFunctionsForUserBase() {
        return new RequestFunctionsForUserBase();
    }

    /**
     * Create an instance of {@link EntityUserAttribute }
     * 
     */
    public EntityUserAttribute createEntityUserAttribute() {
        return new EntityUserAttribute();
    }

    /**
     * Create an instance of {@link EntityAddress }
     * 
     */
    public EntityAddress createEntityAddress() {
        return new EntityAddress();
    }

    /**
     * Create an instance of {@link RequestGetUserDemographicsByAkaNameBase }
     * 
     */
    public RequestGetUserDemographicsByAkaNameBase createRequestGetUserDemographicsByAkaNameBase() {
        return new RequestGetUserDemographicsByAkaNameBase();
    }

    /**
     * Create an instance of {@link ResponseGetAttributesForEntityUserBase }
     * 
     */
    public ResponseGetAttributesForEntityUserBase createResponseGetAttributesForEntityUserBase() {
        return new ResponseGetAttributesForEntityUserBase();
    }

    /**
     * Create an instance of {@link RequestGetAttributesForUserBase }
     * 
     */
    public RequestGetAttributesForUserBase createRequestGetAttributesForUserBase() {
        return new RequestGetAttributesForUserBase();
    }

    /**
     * Create an instance of {@link AgreementDTO }
     * 
     */
    public AgreementDTO createAgreementDTO() {
        return new AgreementDTO();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link ResponseGetAttributesForUserBase }
     * 
     */
    public ResponseGetAttributesForUserBase createResponseGetAttributesForUserBase() {
        return new ResponseGetAttributesForUserBase();
    }

    /**
     * Create an instance of {@link AccessIdentifier }
     * 
     */
    public AccessIdentifier createAccessIdentifier() {
        return new AccessIdentifier();
    }

    /**
     * Create an instance of {@link ResponseOrganizationListBase }
     * 
     */
    public ResponseOrganizationListBase createResponseOrganizationListBase() {
        return new ResponseOrganizationListBase();
    }

    /**
     * Create an instance of {@link ResponseGetBFListForSystemApplicationBase }
     * 
     */
    public ResponseGetBFListForSystemApplicationBase createResponseGetBFListForSystemApplicationBase() {
        return new ResponseGetBFListForSystemApplicationBase();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ResponseGetActiveUsersForEntityBase.ActiveUsers }
     * 
     */
    public ResponseGetActiveUsersForEntityBase.ActiveUsers createResponseGetActiveUsersForEntityBaseActiveUsers() {
        return new ResponseGetActiveUsersForEntityBase.ActiveUsers();
    }

    /**
     * Create an instance of {@link Function.AccessIds }
     * 
     */
    public Function.AccessIds createFunctionAccessIds() {
        return new Function.AccessIds();
    }

    /**
     * Create an instance of {@link ResponseEntityAIDBase.AccessIds }
     * 
     */
    public ResponseEntityAIDBase.AccessIds createResponseEntityAIDBaseAccessIds() {
        return new ResponseEntityAIDBase.AccessIds();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetActiveUsersForEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetActiveUsersForEntity")
    public JAXBElement<ResponseGetActiveUsersForEntity> createResponseGetActiveUsersForEntity(ResponseGetActiveUsersForEntity value) {
        return new JAXBElement<ResponseGetActiveUsersForEntity>(_ResponseGetActiveUsersForEntity_QNAME, ResponseGetActiveUsersForEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetAttributesForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetAttributesForUser")
    public JAXBElement<ResponseGetAttributesForUser> createResponseGetAttributesForUser(ResponseGetAttributesForUser value) {
        return new JAXBElement<ResponseGetAttributesForUser>(_ResponseGetAttributesForUser_QNAME, ResponseGetAttributesForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMenuXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseMenuXML")
    public JAXBElement<ResponseMenuXML> createResponseMenuXML(ResponseMenuXML value) {
        return new JAXBElement<ResponseMenuXML>(_ResponseMenuXML_QNAME, ResponseMenuXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestFunctionsForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestFunctionsForUser")
    public JAXBElement<RequestFunctionsForUser> createRequestFunctionsForUser(RequestFunctionsForUser value) {
        return new JAXBElement<RequestFunctionsForUser>(_RequestFunctionsForUser_QNAME, RequestFunctionsForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMenusForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseMenusForUser")
    public JAXBElement<ResponseMenusForUser> createResponseMenusForUser(ResponseMenusForUser value) {
        return new JAXBElement<ResponseMenusForUser>(_ResponseMenusForUser_QNAME, ResponseMenusForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetUserDemographicsByUserID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetUserDemographicsByUserID")
    public JAXBElement<RequestGetUserDemographicsByUserID> createRequestGetUserDemographicsByUserID(RequestGetUserDemographicsByUserID value) {
        return new JAXBElement<RequestGetUserDemographicsByUserID>(_RequestGetUserDemographicsByUserID_QNAME, RequestGetUserDemographicsByUserID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestEntityListFromAccessId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestEntityListFromAccessId")
    public JAXBElement<RequestEntityListFromAccessId> createRequestEntityListFromAccessId(RequestEntityListFromAccessId value) {
        return new JAXBElement<RequestEntityListFromAccessId>(_RequestEntityListFromAccessId_QNAME, RequestEntityListFromAccessId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetUserAgreements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetUserAgreements")
    public JAXBElement<ResponseGetUserAgreements> createResponseGetUserAgreements(ResponseGetUserAgreements value) {
        return new JAXBElement<ResponseGetUserAgreements>(_ResponseGetUserAgreements_QNAME, ResponseGetUserAgreements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestKeyType")
    public JAXBElement<RequestKeyType> createRequestKeyType(RequestKeyType value) {
        return new JAXBElement<RequestKeyType>(_RequestKeyType_QNAME, RequestKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetFuncListForSysApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetFuncListForSysApp")
    public JAXBElement<RequestGetFuncListForSysApp> createRequestGetFuncListForSysApp(RequestGetFuncListForSysApp value) {
        return new JAXBElement<RequestGetFuncListForSysApp>(_RequestGetFuncListForSysApp_QNAME, RequestGetFuncListForSysApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseBoolRoot")
    public JAXBElement<ResponseBool> createResponseBoolRoot(ResponseBool value) {
        return new JAXBElement<ResponseBool>(_ResponseBoolRoot_QNAME, ResponseBool.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetUserDemographicsByAkaName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetUserDemographicsByAkaName")
    public JAXBElement<RequestGetUserDemographicsByAkaName> createRequestGetUserDemographicsByAkaName(RequestGetUserDemographicsByAkaName value) {
        return new JAXBElement<RequestGetUserDemographicsByAkaName>(_RequestGetUserDemographicsByAkaName_QNAME, RequestGetUserDemographicsByAkaName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseOrganizationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseOrganizationList")
    public JAXBElement<ResponseOrganizationList> createResponseOrganizationList(ResponseOrganizationList value) {
        return new JAXBElement<ResponseOrganizationList>(_ResponseOrganizationList_QNAME, ResponseOrganizationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseEntityAID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseEntityAID")
    public JAXBElement<ResponseEntityAID> createResponseEntityAID(ResponseEntityAID value) {
        return new JAXBElement<ResponseEntityAID>(_ResponseEntityAID_QNAME, ResponseEntityAID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestAIDForEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestAIDForEntity")
    public JAXBElement<RequestAIDForEntity> createRequestAIDForEntity(RequestAIDForEntity value) {
        return new JAXBElement<RequestAIDForEntity>(_RequestAIDForEntity_QNAME, RequestAIDForEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestAIDQualified }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestAIDQualified")
    public JAXBElement<RequestAIDQualified> createRequestAIDQualified(RequestAIDQualified value) {
        return new JAXBElement<RequestAIDQualified>(_RequestAIDQualified_QNAME, RequestAIDQualified.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetUserDemographics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetUserDemographics")
    public JAXBElement<ResponseGetUserDemographics> createResponseGetUserDemographics(ResponseGetUserDemographics value) {
        return new JAXBElement<ResponseGetUserDemographics>(_ResponseGetUserDemographics_QNAME, ResponseGetUserDemographics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForBFWithAIDsForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestForBFWithAIDsForUser")
    public JAXBElement<RequestForBFWithAIDsForUser> createRequestForBFWithAIDsForUser(RequestForBFWithAIDsForUser value) {
        return new JAXBElement<RequestForBFWithAIDsForUser>(_RequestForBFWithAIDsForUser_QNAME, RequestForBFWithAIDsForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestForUser")
    public JAXBElement<RequestForUser> createRequestForUser(RequestForUser value) {
        return new JAXBElement<RequestForUser>(_RequestForUser_QNAME, RequestForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetDemographicsForEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetDemographicsForEntity")
    public JAXBElement<ResponseGetDemographicsForEntity> createResponseGetDemographicsForEntity(ResponseGetDemographicsForEntity value) {
        return new JAXBElement<ResponseGetDemographicsForEntity>(_ResponseGetDemographicsForEntity_QNAME, ResponseGetDemographicsForEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBFForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseBFForUser")
    public JAXBElement<ResponseBFForUser> createResponseBFForUser(ResponseBFForUser value) {
        return new JAXBElement<ResponseBFForUser>(_ResponseBFForUser_QNAME, ResponseBFForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMenusForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestMenusForUser")
    public JAXBElement<RequestMenusForUser> createRequestMenusForUser(RequestMenusForUser value) {
        return new JAXBElement<RequestMenusForUser>(_RequestMenusForUser_QNAME, RequestMenusForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetAttributesForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetAttributesForUser")
    public JAXBElement<RequestGetAttributesForUser> createRequestGetAttributesForUser(RequestGetAttributesForUser value) {
        return new JAXBElement<RequestGetAttributesForUser>(_RequestGetAttributesForUser_QNAME, RequestGetAttributesForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetBFListForSystemApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetBFListForSystemApplication")
    public JAXBElement<ResponseGetBFListForSystemApplication> createResponseGetBFListForSystemApplication(ResponseGetBFListForSystemApplication value) {
        return new JAXBElement<ResponseGetBFListForSystemApplication>(_ResponseGetBFListForSystemApplication_QNAME, ResponseGetBFListForSystemApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetActiveUsersForEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetActiveUsersForEntity")
    public JAXBElement<RequestGetActiveUsersForEntity> createRequestGetActiveUsersForEntity(RequestGetActiveUsersForEntity value) {
        return new JAXBElement<RequestGetActiveUsersForEntity>(_RequestGetActiveUsersForEntity_QNAME, RequestGetActiveUsersForEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetDemographicsForEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetDemographicsForEntity")
    public JAXBElement<RequestGetDemographicsForEntity> createRequestGetDemographicsForEntity(RequestGetDemographicsForEntity value) {
        return new JAXBElement<RequestGetDemographicsForEntity>(_RequestGetDemographicsForEntity_QNAME, RequestGetDemographicsForEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetAttributesForEntityUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseGetAttributesForEntityUser")
    public JAXBElement<ResponseGetAttributesForEntityUser> createResponseGetAttributesForEntityUser(ResponseGetAttributesForEntityUser value) {
        return new JAXBElement<ResponseGetAttributesForEntityUser>(_ResponseGetAttributesForEntityUser_QNAME, ResponseGetAttributesForEntityUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseUserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "ResponseUserDTO")
    public JAXBElement<ResponseUserDTO> createResponseUserDTO(ResponseUserDTO value) {
        return new JAXBElement<ResponseUserDTO>(_ResponseUserDTO_QNAME, ResponseUserDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetAttributesForEntityUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes", name = "RequestGetAttributesForEntityUser")
    public JAXBElement<RequestGetAttributesForEntityUser> createRequestGetAttributesForEntityUser(RequestGetAttributesForEntityUser value) {
        return new JAXBElement<RequestGetAttributesForEntityUser>(_RequestGetAttributesForEntityUser_QNAME, RequestGetAttributesForEntityUser.class, null, value);
    }

}
