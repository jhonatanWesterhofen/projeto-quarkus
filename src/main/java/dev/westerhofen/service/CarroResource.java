package dev.westerhofen.service;

import java.util.List;

import dev.westerhofen.dto.RegisterCarDTO;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/carro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarroResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Carro> list() {
        return Carro.listAll();
    }

    @POST
    @Transactional
    public void newCar(RegisterCarDTO dto) {
        Carro carro = new Carro();

        carro.nome = dto.getNome();
        carro.ano = dto.getAno();
        carro.persist();
    }   
}