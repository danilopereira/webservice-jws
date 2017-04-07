
package br.com.fiap.exemplo.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.exemplo.ws.client package. 
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

    private final static QName _Ola_QNAME = new QName("http://ws.exemplo.fiap.com.br/", "ola");
    private final static QName _OlaResponse_QNAME = new QName("http://ws.exemplo.fiap.com.br/", "olaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.exemplo.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OlaResponse }
     * 
     */
    public OlaResponse createOlaResponse() {
        return new OlaResponse();
    }

    /**
     * Create an instance of {@link Ola }
     * 
     */
    public Ola createOla() {
        return new Ola();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com.br/", name = "ola")
    public JAXBElement<Ola> createOla(Ola value) {
        return new JAXBElement<Ola>(_Ola_QNAME, Ola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OlaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.fiap.com.br/", name = "olaResponse")
    public JAXBElement<OlaResponse> createOlaResponse(OlaResponse value) {
        return new JAXBElement<OlaResponse>(_OlaResponse_QNAME, OlaResponse.class, null, value);
    }

}
