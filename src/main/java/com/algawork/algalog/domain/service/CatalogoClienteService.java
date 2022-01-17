package com.algawork.algalog.domain.service;

import com.algawork.algalog.domain.model.Cliente;
import com.algawork.algalog.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CatalogoClienteService {
    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente){
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
                .stream()
                .anyMatch(emailExistente -> !emailExistente.equals(cliente));
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long clienteId){
        clienteRepository.deleteById(clienteId);
    }
}
