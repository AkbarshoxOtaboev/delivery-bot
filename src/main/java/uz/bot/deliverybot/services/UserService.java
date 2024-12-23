package uz.bot.deliverybot.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import uz.bot.deliverybot.entities.User;

public interface UserService {
    User save(User user);
    User create(User user);
    User findByUsername(String username);
    UserDetailsService getUserDetailsService();
    User getCurrentUser();
}
