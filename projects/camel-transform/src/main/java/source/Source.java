
package source;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "org.blogdemo.example.TradeOrder"
})
public class Source {

    @JsonProperty("org.blogdemo.example.TradeOrder")
    private OrgBlogdemoExampleTradeOrder orgBlogdemoExampleTradeOrder;

    /**
     * 
     * @return
     *     The orgBlogdemoExampleTradeOrder
     */
    @JsonProperty("org.blogdemo.example.TradeOrder")
    public OrgBlogdemoExampleTradeOrder getOrgBlogdemoExampleTradeOrder() {
        return orgBlogdemoExampleTradeOrder;
    }

    /**
     * 
     * @param orgBlogdemoExampleTradeOrder
     *     The org.blogdemo.example.TradeOrder
     */
    @JsonProperty("org.blogdemo.example.TradeOrder")
    public void setOrgBlogdemoExampleTradeOrder(OrgBlogdemoExampleTradeOrder orgBlogdemoExampleTradeOrder) {
        this.orgBlogdemoExampleTradeOrder = orgBlogdemoExampleTradeOrder;
    }

}
