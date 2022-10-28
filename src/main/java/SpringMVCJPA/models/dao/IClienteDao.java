package SpringMVCJPA.models.dao;


import SpringMVCJPA.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {

    List<Cliente> findAll();

    void save(Cliente cliente);
}

