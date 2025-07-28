package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Entities.ProviderEntity;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<ProviderEntity, Long> {

}
