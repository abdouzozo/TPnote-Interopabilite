
package clientWsExo1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour avis complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="avis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paysAvis" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refFourniss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "avis", propOrder = {
    "commentaire",
    "date",
    "id",
    "note",
    "paysAvis",
    "refFourniss",
    "refProduit"
})
public class Avis {

    protected String commentaire;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected String id;
    protected int note;
    @XmlElement(nillable = true)
    protected List<String> paysAvis;
    protected String refFourniss;
    protected String refProduit;

    /**
     * Obtient la valeur de la propri�t� commentaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * D�finit la valeur de la propri�t� commentaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaire(String value) {
        this.commentaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * D�finit la valeur de la propri�t� date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� note.
     * 
     */
    public int getNote() {
        return note;
    }

    /**
     * D�finit la valeur de la propri�t� note.
     * 
     */
    public void setNote(int value) {
        this.note = value;
    }

    /**
     * Gets the value of the paysAvis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paysAvis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaysAvis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaysAvis() {
        if (paysAvis == null) {
            paysAvis = new ArrayList<String>();
        }
        return this.paysAvis;
    }

    /**
     * Obtient la valeur de la propri�t� refFourniss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefFourniss() {
        return refFourniss;
    }

    /**
     * D�finit la valeur de la propri�t� refFourniss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefFourniss(String value) {
        this.refFourniss = value;
    }

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
