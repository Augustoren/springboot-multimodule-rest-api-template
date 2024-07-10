package restapitemplate.mapper;


import api.rest.model.Endereco;
import org.mapstruct.Mapper;
import restapitemplate.dto.EnderecoDTO;

@Mapper(componentModel = "spring")
public interface ViacepMapper {

    Endereco toModel(EnderecoDTO dto);
}
