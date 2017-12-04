package com.example.thymelife.model.dao;

import com.example.thymelife.model.entity.Cliente;

import java.util.List;

/**
 * Created by administrador on 10/11/17.
 */
public interface ClienteDao {

    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);
}
