
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="stockId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "custId",
    "vip",
    "stockId",
    "shares"
})
@XmlRootElement(name = "stocktrading")
public class Stocktrading {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String custId;
    protected byte vip;
    @XmlElement(required = true)
    protected String stockId;
    protected byte shares;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     */
    public byte getVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     */
    public void setVip(byte value) {
        this.vip = value;
    }

    /**
     * Gets the value of the stockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * Sets the value of the stockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockId(String value) {
        this.stockId = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     */
    public byte getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     */
    public void setShares(byte value) {
        this.shares = value;
    }

}
