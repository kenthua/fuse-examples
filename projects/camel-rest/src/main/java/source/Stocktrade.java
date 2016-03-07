
package source;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "custId",
    "vip",
    "stockId",
    "shares"
})
public class Stocktrade {

    @JsonProperty("name")
    private String name;
    @JsonProperty("custId")
    private String custId;
    @JsonProperty("vip")
    private int vip;
    @JsonProperty("stockId")
    private String stockId;
    @JsonProperty("shares")
    private int shares;

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The custId
     */
    @JsonProperty("custId")
    public String getCustId() {
        return custId;
    }

    /**
     * 
     * @param custId
     *     The custId
     */
    @JsonProperty("custId")
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 
     * @return
     *     The vip
     */
    @JsonProperty("vip")
    public int getVip() {
        return vip;
    }

    /**
     * 
     * @param vip
     *     The vip
     */
    @JsonProperty("vip")
    public void setVip(int vip) {
        this.vip = vip;
    }

    /**
     * 
     * @return
     *     The stockId
     */
    @JsonProperty("stockId")
    public String getStockId() {
        return stockId;
    }

    /**
     * 
     * @param stockId
     *     The stockId
     */
    @JsonProperty("stockId")
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    /**
     * 
     * @return
     *     The shares
     */
    @JsonProperty("shares")
    public int getShares() {
        return shares;
    }

    /**
     * 
     * @param shares
     *     The shares
     */
    @JsonProperty("shares")
    public void setShares(int shares) {
        this.shares = shares;
    }

}
