
package source;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "stocktrade"
})
public class Source {

    @JsonProperty("stocktrade")
    private Stocktrade stocktrade;

    /**
     * 
     * @return
     *     The stocktrade
     */
    @JsonProperty("stocktrade")
    public Stocktrade getStocktrade() {
        return stocktrade;
    }

    /**
     * 
     * @param stocktrade
     *     The stocktrade
     */
    @JsonProperty("stocktrade")
    public void setStocktrade(Stocktrade stocktrade) {
        this.stocktrade = stocktrade;
    }

}
