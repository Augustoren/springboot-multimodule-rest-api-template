package api.rest.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}