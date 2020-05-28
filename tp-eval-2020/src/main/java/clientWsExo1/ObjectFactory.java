
package clientWsExo1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientWsExo1 package. 
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

    private final static QName _EnregistrerAvisResponse_QNAME = new QName("http://exo1.eval.interop.ensim.fr/", "enregistrerAvisResponse");
    private final static QName _ListerAvis_QNAME = new QName("http://exo1.eval.interop.ensim.fr/", "listerAvis");
    private final static QName _ListerAvisResponse_QNAME = new QName("http://exo1.eval.interop.ensim.fr/", "listerAvisResponse");
    private final static QName _EnregistrerAvis_QNAME = new QName("http://exo1.eval.interop.ensim.fr/", "enregistrerAvis");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientWsExo1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnregistrerAvis }
     * 
     */
    public EnregistrerAvis createEnregistrerAvis() {
        return new EnregistrerAvis();
    }

    /**
     * Create an instance of {@link EnregistrerAvisResponse }
     * 
     */
    public EnregistrerAvisResponse createEnregistrerAvisResponse() {
        return new EnregistrerAvisResponse();
    }

    /**
     * Create an instance of {@link ListerAvis }
     * 
     */
    public ListerAvis createListerAvis() {
        return new ListerAvis();
    }

    /**
     * Create an instance of {@link ListerAvisResponse }
     * 
     */
    public ListerAvisResponse createListerAvisResponse() {
        return new ListerAvisResponse();
    }

    /**
     * Create an instance of {@link Avis }
     * 
     */
    public Avis createAvis() {
        return new Avis();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerAvisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exo1.eval.interop.ensim.fr/", name = "enregistrerAvisResponse")
    public JAXBElement<EnregistrerAvisResponse> createEnregistrerAvisResponse(EnregistrerAvisResponse value) {
        return new JAXBElement<EnregistrerAvisResponse>(_EnregistrerAvisResponse_QNAME, EnregistrerAvisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerAvis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exo1.eval.interop.ensim.fr/", name = "listerAvis")
    public JAXBElement<ListerAvis> createListerAvis(ListerAvis value) {
        return new JAXBElement<ListerAvis>(_ListerAvis_QNAME, ListerAvis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerAvisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exo1.eval.interop.ensim.fr/", name = "listerAvisResponse")
    public JAXBElement<ListerAvisResponse> createListerAvisResponse(ListerAvisResponse value) {
        return new JAXBElement<ListerAvisResponse>(_ListerAvisResponse_QNAME, ListerAvisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerAvis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exo1.eval.interop.ensim.fr/", name = "enregistrerAvis")
    public JAXBElement<EnregistrerAvis> createEnregistrerAvis(EnregistrerAvis value) {
        return new JAXBElement<EnregistrerAvis>(_EnregistrerAvis_QNAME, EnregistrerAvis.class, null, value);
    }

}
