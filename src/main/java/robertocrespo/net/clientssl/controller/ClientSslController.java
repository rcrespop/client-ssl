package robertocrespo.net.clientssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import robertocrespo.net.clientssl.service.ClientSslService;

import java.io.IOException;

@RestController
@RequestMapping("/client-ssl")
public class ClientSslController {

    private ClientSslService sslService;

    @Autowired
    public ClientSslController(ClientSslService sslService) {

        this.sslService = sslService;
    }

    @GetMapping("/test")
    public String testSSL()  {
        return "CLIENT SSL: " + sslService.testSSL();
    }



}

