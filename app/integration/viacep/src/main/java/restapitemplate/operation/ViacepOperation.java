package restapitemplate.operation;

import api.rest.model.Endereco;
import api.rest.port.integration.ViacepIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import restapitemplate.api.ViacepApi;
import restapitemplate.dto.EnderecoDTO;
import restapitemplate.mapper.ViacepMapper;

@Component
@RequiredArgsConstructor
public class ViacepOperation implements ViacepIntegration {

    private final ViacepApi api;
    private final ViacepMapper mapper;

    @Override
    public Endereco getEnderecoPorCep(String cep) {
        EnderecoDTO enderecoDTO = api.getEnderecoPorCep(cep);
        return mapper.toModel(enderecoDTO);
    }
}
