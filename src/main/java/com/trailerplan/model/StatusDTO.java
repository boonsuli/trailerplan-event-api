package com.trailerplan.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDTO extends AbstractDTO implements Serializable {

    public StatusDTO(final String message) {
        super();
        super.setMessage(message);
        super.setObjectDate(new Date());
    }

    public String toJson() throws IOException {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper.writeValueAsString(this);
    }
}
