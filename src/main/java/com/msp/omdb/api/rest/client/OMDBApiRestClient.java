package com.msp.omdb.api.rest.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class OMDBApiRestClient {

    private static final String OMDB_API_URL = "https://www.omdbapi.com/";

    private final RestTemplate restTemplate;

    /*public OMDBApiRestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }*/

    public ResponseEntity<String> getMoveInfo(String apiKey, String title) {
        try {
            String url = OMDB_API_URL + "?apikey=" + apiKey + "&t=" + title;
            return restTemplate.getForEntity(url, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
