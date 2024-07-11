package br.com.augustoren.core.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Value
@Builder
@EqualsAndHashCode
public class AddressResponse implements Serializable {

    @JsonProperty("cep")
    String cep;
    @JsonProperty("logradouro")
    String logradouro;
    @JsonProperty("bairro")
    String bairro;
    @JsonProperty("localidade")
    String localidade;
    @JsonProperty("uf")
    String uf;

}
