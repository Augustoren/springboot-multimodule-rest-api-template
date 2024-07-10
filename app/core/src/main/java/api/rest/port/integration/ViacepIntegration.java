package api.rest.port.integration;

import api.rest.model.Endereco;

public interface ViacepIntegration {

    Endereco getEnderecoPorCep(String cep);

}
