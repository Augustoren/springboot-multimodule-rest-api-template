package br.com.augustoren.application.mapper;

import br.com.augustoren.application.dto.response.GetAddressResponseDto;
import br.com.augustoren.core.model.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GetAddressResponseMapper {

    GetAddressResponseDto toDto(AddressResponse addressResponse);

}
