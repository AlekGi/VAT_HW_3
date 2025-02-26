
package org.homework;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pairedWines",
    "pairingText",
    "productMatches"
})
@Generated("jsonschema2pojo")
public class WinePairing {

    @JsonProperty("pairedWines")
    private List<String> pairedWines;
    @JsonProperty("pairingText")
    private String pairingText;
    @JsonProperty("productMatches")
    private List<ProductMatch> productMatches;

    @JsonProperty("pairedWines")
    public List<String> getPairedWines() {
        return pairedWines;
    }

    @JsonProperty("pairedWines")
    public void setPairedWines(List<String> pairedWines) {
        this.pairedWines = pairedWines;
    }

    @JsonProperty("pairingText")
    public String getPairingText() {
        return pairingText;
    }

    @JsonProperty("pairingText")
    public void setPairingText(String pairingText) {
        this.pairingText = pairingText;
    }

    @JsonProperty("productMatches")
    public List<ProductMatch> getProductMatches() {
        return productMatches;
    }

    @JsonProperty("productMatches")
    public void setProductMatches(List<ProductMatch> productMatches) {
        this.productMatches = productMatches;
    }

}
