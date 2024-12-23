package uz.bot.deliverybot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.bot.deliverybot.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}
