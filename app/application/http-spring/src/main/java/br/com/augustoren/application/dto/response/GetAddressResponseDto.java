package br.com.augustoren.application.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class GetAddressResponseDto {

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
