package robertocrespo.net.clientssl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ClientSslService {

    private static final Logger log = LoggerFactory.getLogger(ClientSslService.class);

    @Autowired
    RestTemplate restTemplate;


    public String testSSL() {

        String response;

        try {
            String fooResourceUrl = "https://localhost:8443/server-ssl";
            response = restTemplate.getForObject(fooResourceUrl + "/test", String.class);
            return response;

        }catch(Exception e){

            response = "Error: "+e.getMessage();
        }
        return response;
    }

}
