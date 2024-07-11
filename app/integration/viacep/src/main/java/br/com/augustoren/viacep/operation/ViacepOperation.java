package br.com.augustoren.viacep.operation;

import br.com.augustoren.core.model.Address;
import br.com.augustoren.core.port.integration.ViacepIntegration;
import br.com.augustoren.viacep.api.ViacepApi;
import br.com.augustoren.viacep.dto.AddressDTO;
import br.com.augustoren.viacep.mapper.ViacepMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ViacepOperation implements ViacepIntegration {

    private final ViacepApi api;
    private final ViacepMapper mapper;

    @Override
    public Address getAddressByCep(String cep) {
        AddressDTO addressDTO = api.getEnderecoPorCep(cep);
        return mapper.toModel(addressDTO);
    }
}
