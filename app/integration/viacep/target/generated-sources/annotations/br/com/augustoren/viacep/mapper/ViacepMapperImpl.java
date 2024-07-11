package br.com.augustoren.viacep.mapper;

import br.com.augustoren.core.model.Address;
import br.com.augustoren.viacep.dto.AddressDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T09:59:32-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class ViacepMapperImpl implements ViacepMapper {

    @Override
    public Address toModel(AddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Address.AddressBuilder address = Address.builder();

        address.cep( dto.getCep() );
        address.logradouro( dto.getLogradouro() );
        address.bairro( dto.getBairro() );
        address.localidade( dto.getLocalidade() );
        address.uf( dto.getUf() );

        return address.build();
    }
}
