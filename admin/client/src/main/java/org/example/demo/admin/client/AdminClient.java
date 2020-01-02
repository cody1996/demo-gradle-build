package org.example.demo.admin.client;

import org.example.demo.admin.api.dto.CodeDTO;
import org.springframework.web.client.RestTemplate;

/**
 * @author Cody
 */
public class AdminClient {

    private RestTemplate restTemplate;

    private String baseUrl;

    public AdminClient(RestTemplate restTemplate, String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    public CodeDTO getCode(long id) {
        String url = baseUrl + "/api/codes/{?}";
        return restTemplate.getForObject(url, CodeDTO.class, id);
    }
}
