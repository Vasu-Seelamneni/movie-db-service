package com.msp.omdb.api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msp.omdb.api.model.OMDBApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class OMDBService {

    /*public String getMovieByTitle(String title) {
        log.debug("Get movie by title: {}", title);
        return null;
    }*/

    public OMDBApiResponse parseResponse(ResponseEntity<String> response) throws IOException {
        log.debug("Parse response: {}", response.getBody());
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(response.getBody(), OMDBApiResponse.class);
    }
}
