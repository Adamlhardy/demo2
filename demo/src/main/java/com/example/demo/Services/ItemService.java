package com.example.demo.Services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Models.Items;

@Service
public class ItemService {
    final String url = "http://localhost:8080/api/items";
    public List<Items> getAllItems() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Items>> result = restTemplate.exchange(url, 
        HttpMethod.GET, 
        null, 
        new ParameterizedTypeReference<List<Items>>() {    
        });

        return result.getBody();
    }

    public void deleteItem(String id) {
        String deleteUrl = url + "/" + id;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(deleteUrl); //sends in the delete request
    }
} 
