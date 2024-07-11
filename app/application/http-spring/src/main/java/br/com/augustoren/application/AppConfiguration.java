package br.com.augustoren.application;

import br.com.augustoren.core.port.integration.ViacepIntegration;
import br.com.augustoren.core.usecase.search.SearchAddress;
import br.com.augustoren.viacep.api.ViacepApi;
import br.com.augustoren.viacep.mapper.ViacepMapper;
import br.com.augustoren.viacep.operation.ViacepOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "br.com.augustoren")
public class AppConfiguration {

    @Bean
    SearchAddress searchAddress(ViacepIntegration viacepIntegration) {
        return new SearchAddress(viacepIntegration);
    }

    @Bean
    ViacepOperation viacepOperation(ViacepApi api, ViacepMapper mapper) {
        return new ViacepOperation(api, mapper);
    }
}
