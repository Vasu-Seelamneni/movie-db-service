package com.msp.omdb.api.controller;

import com.msp.omdb.api.model.OMDBApiResponse;
import com.msp.omdb.api.rest.client.OMDBApiRestClient;
import com.msp.omdb.api.service.OMDBService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/api/omdb")
public class OMDBApiController {

    private final OMDBApiRestClient omdbApiRestClient;
    private final OMDBService omdbService;

    public OMDBApiController(OMDBApiRestClient omdbApiRestClient, OMDBService omdbService) {
        this.omdbApiRestClient = omdbApiRestClient;
        this.omdbService = omdbService;
    }

    @GetMapping("/movie")
    public ResponseEntity<OMDBApiResponse> getMovieByTitle(@RequestParam String apiKey, @RequestParam String title) {

        ResponseEntity<String> response = omdbApiRestClient.getMoveInfo(apiKey, title); // <1>
        if(response.getStatusCode() == HttpStatus.OK){
            try{
                OMDBApiResponse omdbApiResponse = omdbService.parseResponse(response);
                return ResponseEntity.ok(omdbApiResponse);
            } catch (Exception e) {
                log.debug("Parse response error: {}", e.getMessage());
            }
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

    }
}
