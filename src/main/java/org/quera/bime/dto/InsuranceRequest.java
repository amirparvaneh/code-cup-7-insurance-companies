package org.quera.bime.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.quera.bime.model.Type;

import java.io.Serializable;

@Getter
@Setter
public class InsuranceRequest implements Serializable {

    @JsonProperty(value = "type")
    private Type type;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "price")
    private Double price;
    @JsonProperty(value = "company_id")
    private Long company_id;
    @JsonProperty(value = "min_age")
    private Integer integer;
}
