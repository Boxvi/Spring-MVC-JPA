package SpringMVCJPA.models.dao;

import test.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {

    List<Cliente> findAll();
}
