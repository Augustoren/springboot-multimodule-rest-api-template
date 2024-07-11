package br.com.augustoren.application.controller;

import br.com.augustoren.application.mapper.GetAddressResponseMapper;
import br.com.augustoren.application.dto.response.GetAddressResponseDto;
import br.com.augustoren.core.model.response.AddressResponse;
import br.com.augustoren.core.port.command.GetAddressCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
@RequiredArgsConstructor
public class AddressGetController {

    private final GetAddressCommand command;
    private final GetAddressResponseMapper mapper;

    @GetMapping("/{cep}")
    public ResponseEntity<GetAddressResponseDto> getAddress(@PathVariable("cep") String cep) {
        AddressResponse address = command.getAddress(cep);
        GetAddressResponseDto addressDto = mapper.toDto(address);
        return ResponseEntity.ok(addressDto);
    }

}
