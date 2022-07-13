package com.pokemon.pokemon.provider;

import com.pokemon.pokemon.model.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PokemonProvider {


    public Example getPokemonByName(final String pokemonName) {
        RestTemplate restTemplate = new RestTemplate();
        String pokemonUrl = "https://pokeapi.co/api/v2/pokemon/" + pokemonName;
        ResponseEntity<Example> response = restTemplate.getForEntity(pokemonUrl, Example.class);
        return response.getBody();
    }


}
