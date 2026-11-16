package com.mascotas.kafka;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("api/pagos")
@RestController 
public class PagosControlador {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("estado", "operacional");
    }

}
