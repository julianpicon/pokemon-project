package com.pokemon.pokemon.api;

import com.pokemon.pokemon.model.Example;
import com.pokemon.pokemon.provider.PokemonProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private PokemonProvider pokemonProvider;

    @GetMapping("/pokemon/{pokemonName}")
    public Example getPokemonByName(final @PathVariable("pokemonName") String pokemonName) {
        return this.pokemonProvider.getPokemonByName(pokemonName);
    }
}
