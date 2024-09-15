package com.example.astra.responses;

import org.springframework.stereotype.Repository;

import jakarta.validation.constraints.NotBlank;


public record AstraRecordDto(@NotBlank String nome, String combustivel, String partida, String chegada, double km){

}
