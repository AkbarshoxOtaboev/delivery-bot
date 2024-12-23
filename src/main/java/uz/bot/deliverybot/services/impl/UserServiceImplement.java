package uz.bot.deliverybot.services.impl;

import org.springframework.security.core.userdetails.UserDetailsService;
import uz.bot.deliverybot.entities.User;
import uz.bot.deliverybot.services.UserService;

public class UserServiceImplement implements UserService {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public UserDetailsService getUserDetailsService() {
        return null;
    }

    @Override
    public User getCurrentUser() {
        return null;
    }
}
