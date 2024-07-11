package br.com.augustoren.viacep.api;

import br.com.augustoren.viacep.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-viacep", url = "${integration.viacep.url}")
public interface ViacepApi {

    @GetMapping("${integration.viacep.endpoint}")
    AddressDTO getEnderecoPorCep(@PathVariable("cep") String cep);

}
