
package clientWsExo1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listerAvis complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listerAvis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refProduit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listerAvis", propOrder = {
    "refProduit"
})
public class ListerAvis {

    protected String refProduit;

    /**
     * Obtient la valeur de la propri�t� refProduit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefProduit() {
        return refProduit;
    }

    /**
     * D�finit la valeur de la propri�t� refProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefProduit(String value) {
        this.refProduit = value;
    }

}
