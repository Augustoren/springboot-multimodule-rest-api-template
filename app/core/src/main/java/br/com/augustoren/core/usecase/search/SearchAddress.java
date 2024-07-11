package br.com.augustoren.core.usecase.search;

import br.com.augustoren.core.model.Address;
import br.com.augustoren.core.port.command.GetAddressCommand;
import br.com.augustoren.core.port.integration.ViacepIntegration;
import br.com.augustoren.core.model.response.AddressResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SearchAddress implements GetAddressCommand {

    private final ViacepIntegration viacepIntegration;

    @Override
    public AddressResponse getAddress(String cep) {
        final var address = viacepIntegration.getAddressByCep(cep);
        return buildAddressResponse(address);
    }

    private AddressResponse buildAddressResponse(Address address) {
        return AddressResponse.builder()
                .cep(address.getCep())
                .localidade(address.getLocalidade())
                .logradouro(address.getLogradouro())
                .bairro(address.getBairro())
                .uf(address.getUf())
                .build();
    }
}
