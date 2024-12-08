package mp.minicursospring.service;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @param <T> tipo da entidade
 * @param <ID> tipo da chave primária
 */
public abstract class GenericCrud<T, ID> {
    protected abstract JpaRepository<T, ID> getRepository();

    public List<T> listar(){
        return getRepository().findAll();
    }

    public Optional<T> buscarPorId(ID id){
        return getRepository().findById(id);
    }
    public T salvar(T entidade){
        return getRepository().save(entidade);
    }

    public void deletarPorId(ID id){
        getRepository().deleteById(id);
    }
}
