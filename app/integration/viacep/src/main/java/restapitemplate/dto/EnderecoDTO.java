package restapitemplate.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    @JsonIgnore
    private String complemento;
    @JsonIgnore
    private String ibge;
    @JsonIgnore
    private String gia;
    @JsonIgnore
    private String ddd;
    @JsonIgnore
    private String siafi;

}