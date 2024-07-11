package br.com.augustoren.core.port.integration;

import br.com.augustoren.core.model.Address;

public interface ViacepIntegration {

    Address getAddressByCep(String cep);

}
