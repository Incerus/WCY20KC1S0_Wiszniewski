
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _IOException_QNAME = new QName("http://WebService/", "IOException");
    private final static QName _Generuj_QNAME = new QName("http://WebService/", "generuj");
    private final static QName _GenerujResponse_QNAME = new QName("http://WebService/", "generujResponse");
    private final static QName _Pobierz_QNAME = new QName("http://WebService/", "pobierz");
    private final static QName _PobierzResponse_QNAME = new QName("http://WebService/", "pobierzResponse");
    private final static QName _Usun_QNAME = new QName("http://WebService/", "usun");
    private final static QName _UsunResponse_QNAME = new QName("http://WebService/", "usunResponse");
    private final static QName _Wstaw_QNAME = new QName("http://WebService/", "wstaw");
    private final static QName _WstawResponse_QNAME = new QName("http://WebService/", "wstawResponse");
    private final static QName _Wyswietl_QNAME = new QName("http://WebService/", "wyswietl");
    private final static QName _WyswietlResponse_QNAME = new QName("http://WebService/", "wyswietlResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Generuj }
     * 
     */
    public Generuj createGeneruj() {
        return new Generuj();
    }

    /**
     * Create an instance of {@link GenerujResponse }
     * 
     */
    public GenerujResponse createGenerujResponse() {
        return new GenerujResponse();
    }

    /**
     * Create an instance of {@link Pobierz }
     * 
     */
    public Pobierz createPobierz() {
        return new Pobierz();
    }

    /**
     * Create an instance of {@link PobierzResponse }
     * 
     */
    public PobierzResponse createPobierzResponse() {
        return new PobierzResponse();
    }

    /**
     * Create an instance of {@link Usun }
     * 
     */
    public Usun createUsun() {
        return new Usun();
    }

    /**
     * Create an instance of {@link UsunResponse }
     * 
     */
    public UsunResponse createUsunResponse() {
        return new UsunResponse();
    }

    /**
     * Create an instance of {@link Wstaw }
     * 
     */
    public Wstaw createWstaw() {
        return new Wstaw();
    }

    /**
     * Create an instance of {@link WstawResponse }
     * 
     */
    public WstawResponse createWstawResponse() {
        return new WstawResponse();
    }

    /**
     * Create an instance of {@link Wyswietl }
     * 
     */
    public Wyswietl createWyswietl() {
        return new Wyswietl();
    }

    /**
     * Create an instance of {@link WyswietlResponse }
     * 
     */
    public WyswietlResponse createWyswietlResponse() {
        return new WyswietlResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Generuj }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Generuj }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "generuj")
    public JAXBElement<Generuj> createGeneruj(Generuj value) {
        return new JAXBElement<Generuj>(_Generuj_QNAME, Generuj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerujResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerujResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "generujResponse")
    public JAXBElement<GenerujResponse> createGenerujResponse(GenerujResponse value) {
        return new JAXBElement<GenerujResponse>(_GenerujResponse_QNAME, GenerujResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pobierz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Pobierz }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "pobierz")
    public JAXBElement<Pobierz> createPobierz(Pobierz value) {
        return new JAXBElement<Pobierz>(_Pobierz_QNAME, Pobierz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PobierzResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "pobierzResponse")
    public JAXBElement<PobierzResponse> createPobierzResponse(PobierzResponse value) {
        return new JAXBElement<PobierzResponse>(_PobierzResponse_QNAME, PobierzResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usun }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Usun }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "usun")
    public JAXBElement<Usun> createUsun(Usun value) {
        return new JAXBElement<Usun>(_Usun_QNAME, Usun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsunResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsunResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "usunResponse")
    public JAXBElement<UsunResponse> createUsunResponse(UsunResponse value) {
        return new JAXBElement<UsunResponse>(_UsunResponse_QNAME, UsunResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wstaw }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wstaw }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "wstaw")
    public JAXBElement<Wstaw> createWstaw(Wstaw value) {
        return new JAXBElement<Wstaw>(_Wstaw_QNAME, Wstaw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WstawResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WstawResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "wstawResponse")
    public JAXBElement<WstawResponse> createWstawResponse(WstawResponse value) {
        return new JAXBElement<WstawResponse>(_WstawResponse_QNAME, WstawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wyswietl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wyswietl }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "wyswietl")
    public JAXBElement<Wyswietl> createWyswietl(Wyswietl value) {
        return new JAXBElement<Wyswietl>(_Wyswietl_QNAME, Wyswietl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WyswietlResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WyswietlResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "wyswietlResponse")
    public JAXBElement<WyswietlResponse> createWyswietlResponse(WyswietlResponse value) {
        return new JAXBElement<WyswietlResponse>(_WyswietlResponse_QNAME, WyswietlResponse.class, null, value);
    }

}
