package SpringMVCJPA.models.dao;

import SpringMVCJPA.models.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDaoImpl implements IClienteDao{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return  entityManager.createQuery("from Cliente").getResultList();
        //return entityManager.createQuery("from clientes").getResultList();
    }

    @Transactional
    @Override
    public void save(Cliente cliente) {
        entityManager.persist(cliente);
    }
}
