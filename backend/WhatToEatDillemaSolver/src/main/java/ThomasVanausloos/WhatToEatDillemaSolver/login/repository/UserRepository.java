package ThomasVanausloos.WhatToEatDillemaSolver.login.repository;


import ThomasVanausloos.WhatToEatDillemaSolver.login.domain.User;
import org.springframework.data.repository.Repository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class UserRepository {

        @PersistenceContext
        private EntityManager entityManager;

        public List<User> getAllUsers() {
                return entityManager.createQuery("SELECT e FROM User e", User.class).getResultList();
        }

        public User getUserByUserName(String username) {
                return entityManager.createQuery("SELECT e FROM User e WHERE username = :username", User.class)
                        .setParameter("username", username)
                        .getSingleResult();
        }

        public User getUserByUserID(String user_id) {
                return entityManager.createQuery("SELECT e FROM User e WHERE user_id = :user_id", User.class)
                        .setParameter("user_id", user_id)
                        .getSingleResult();
        }

        public void saveUser(User user){
                entityManager.persist(user);
        }

}
