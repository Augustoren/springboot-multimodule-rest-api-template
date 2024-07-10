package restapitemplate.mapper;

import api.rest.model.Endereco;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import restapitemplate.dto.EnderecoDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-10T17:40:56-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class ViacepMapperImpl implements ViacepMapper {

    @Override
    public Endereco toModel(EnderecoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Endereco.EnderecoBuilder endereco = Endereco.builder();

        endereco.cep( dto.getCep() );
        endereco.logradouro( dto.getLogradouro() );
        endereco.bairro( dto.getBairro() );
        endereco.localidade( dto.getLocalidade() );
        endereco.uf( dto.getUf() );

        return endereco.build();
    }
}
