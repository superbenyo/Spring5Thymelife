package com.example.thymelife.control.service;

import com.example.thymelife.model.entity.Cliente;

import java.util.List;

/**
 * Created by administrador on 1/12/17.
 */
public interface ClienteService {
    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);
}
