package org.quera.bime.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CompanyRequest implements Serializable {

    @JsonProperty("name")
    private String name;

}
