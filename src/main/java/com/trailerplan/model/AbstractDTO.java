package com.trailerplan.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractDTO implements Serializable {

    protected Long id;
    protected String name;
    protected String shortName;
    protected String message;
    protected Date objectDate;

    @JsonIgnore
    @NonNull
    protected final ObjectMapper objectMapper = new ObjectMapper();


}
