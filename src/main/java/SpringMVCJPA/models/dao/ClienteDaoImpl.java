package SpringMVCJPA.models.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import test.models.entity.Cliente;

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
        return entityManager.createQuery("from Client").getResultList();
    }
}
