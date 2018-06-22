package br.com.paulogabriel.pdm.Classes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface EscolaService {

    @GET("escolas")
    Call<List<Escola>> getEscola();
}
