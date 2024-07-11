package br.com.augustoren.viacep.mapper;


import br.com.augustoren.core.model.Address;
import br.com.augustoren.viacep.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViacepMapper {

    Address toModel(AddressDTO dto);
}
