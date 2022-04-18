package Egg.Challenge.challenge.orders.repository;

import Egg.Challenge.challenge.auth.models.ERole;
import Egg.Challenge.challenge.auth.models.Role;
import Egg.Challenge.challenge.orders.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long>{
    Optional<Order> findById(Order id);
}