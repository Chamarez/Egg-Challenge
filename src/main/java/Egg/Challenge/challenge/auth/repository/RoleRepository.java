package Egg.Challenge.challenge.auth.repository;
import java.util.Optional;

import Egg.Challenge.challenge.auth.models.ERole;
import Egg.Challenge.challenge.auth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}