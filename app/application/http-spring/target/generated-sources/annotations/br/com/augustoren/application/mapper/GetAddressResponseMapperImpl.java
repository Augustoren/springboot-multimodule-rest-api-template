package br.com.augustoren.application.mapper;

import br.com.augustoren.application.dto.response.GetAddressResponseDto;
import br.com.augustoren.core.model.response.AddressResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T10:17:40-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class GetAddressResponseMapperImpl implements GetAddressResponseMapper {

    @Override
    public GetAddressResponseDto toDto(AddressResponse addressResponse) {
        if ( addressResponse == null ) {
            return null;
        }

        GetAddressResponseDto.GetAddressResponseDtoBuilder getAddressResponseDto = GetAddressResponseDto.builder();

        getAddressResponseDto.cep( addressResponse.getCep() );
        getAddressResponseDto.logradouro( addressResponse.getLogradouro() );
        getAddressResponseDto.bairro( addressResponse.getBairro() );
        getAddressResponseDto.localidade( addressResponse.getLocalidade() );
        getAddressResponseDto.uf( addressResponse.getUf() );

        return getAddressResponseDto.build();
    }
}
