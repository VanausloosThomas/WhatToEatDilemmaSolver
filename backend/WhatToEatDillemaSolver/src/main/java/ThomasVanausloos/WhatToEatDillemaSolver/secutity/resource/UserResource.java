package ThomasVanausloos.WhatToEatDillemaSolver.secutity.resource;

import ThomasVanausloos.WhatToEatDillemaSolver.secutity.model.User;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class UserResource {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager
                .createQuery("select u from User u", User.class)
                .getResultList();
    }

    public User getUserById(String  id){
        return entityManager
                .createQuery("select u from User u where user_id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public User getUserByUsername(String username) {
        return entityManager
                .createQuery("select u from User u where email= :username",User.class)
                .setParameter("username", username)
                .getSingleResult();
    }
}
