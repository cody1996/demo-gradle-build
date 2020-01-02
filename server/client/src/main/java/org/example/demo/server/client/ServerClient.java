package org.example.demo.server.client;

import org.example.demo.server.api.dto.UserDTO;
import org.springframework.web.client.RestTemplate;

/**
 * @author Cody
 */
public class ServerClient {
    private RestTemplate restTemplate;

    private String baseUrl;

    public ServerClient(RestTemplate restTemplate, String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    public UserDTO getUser(long id) {
        String url = baseUrl + "/api/users/{?}";
        return restTemplate.getForObject(url, UserDTO.class, id);
    }
}
