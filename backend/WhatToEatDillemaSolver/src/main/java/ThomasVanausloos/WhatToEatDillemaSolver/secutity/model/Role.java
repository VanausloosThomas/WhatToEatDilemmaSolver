package ThomasVanausloos.WhatToEatDillemaSolver.secutity.model;


import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID")
    private int role_id;
    @Column(name="ROLENAME")
    private String roleName;

    public Role() {}

    public Role(String roleName) {

        this.roleName = roleName;
    }

    public String getRoleName() {

        return roleName;
    }
}
