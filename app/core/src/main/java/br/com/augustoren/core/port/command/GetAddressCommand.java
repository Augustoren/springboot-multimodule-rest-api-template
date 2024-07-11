package br.com.augustoren.core.port.command;

import br.com.augustoren.core.model.response.AddressResponse;

public interface GetAddressCommand {

    AddressResponse getAddress(String cep);

}
