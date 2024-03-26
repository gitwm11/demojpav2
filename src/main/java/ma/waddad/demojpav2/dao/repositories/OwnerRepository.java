package ma.waddad.demojpav2.dao.repositories;

import ma.waddad.demojpav2.dao.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
}
