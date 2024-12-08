package mp.minicursospring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @param <T> tipo da entidade
 * @param <ID> tipo da chave primária
 */
@NoRepositoryBean
public interface GenericCrudRepository<T, ID> extends JpaRepository<T, ID> {


}
