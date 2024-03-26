package com.aulaCrud.demo.service;

import com.aulaCrud.demo.entity.Client;
import com.aulaCrud.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public Client salvar(Client client) {
        return clientRepository.save(client);

    }

    public List<Client> listaClient(){
        return clientRepository.findAll();
    }

    public Optional<Client> buscarPorId(Long id){
        return clientRepository.findById(id);
    }

    public void removerPorId(Long id){
        clientRepository.deleteById(id);
    }

}
