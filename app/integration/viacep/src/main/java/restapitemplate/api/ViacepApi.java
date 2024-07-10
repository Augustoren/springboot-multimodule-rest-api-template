package restapitemplate.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import restapitemplate.dto.EnderecoDTO;

@FeignClient(name = "api-viacep", url = "${integration.viacep.url}")
public interface ViacepApi {

    @GetMapping("${integration.viacep.endpoint}")
    EnderecoDTO getEnderecoPorCep(@PathVariable("cep") String cep);

}
