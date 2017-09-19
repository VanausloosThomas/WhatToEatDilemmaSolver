package ThomasVanausloos.WhatToEatDillemaSolver.secutity.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

import static java.util.UUID.randomUUID;

@Entity
@Table(name = "USER")
public class User implements UserDetails{

    public static final String COLUM_USER_ID = "USER_ID";
    public static final String COLUMN_FIRSTNAME = "FIRSTNAME";
    public static final String COLUMN_LASTNAME = "LASTNAME";
    public static final String COLUMN_EMAIL = "EMAIL";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";
    public static final String COLUMN_ENABLED = "ENABLED";


    //<editor-fold desc="Fields">
    @Id
    @Column(name = COLUM_USER_ID)
    private String id = randomUUID().toString();

    @Column(name = COLUMN_FIRSTNAME)
    private String firstName;

    @Column(name = COLUMN_LASTNAME)
    private String lastName;

    @Column(name = COLUMN_EMAIL)
    private String email;

    @Column(name = COLUMN_USERNAME)
    private String username;

    @Column(name = COLUMN_PASSWORD)
    private String password;

    @Column(name = COLUMN_ENABLED)
    private Boolean enabled;

    @ManyToMany
    @JoinTable(name = "USERROLES",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles;
    //</editor-fold>


    //<editor-fold desc="Constructor">
    public User() {
    }
    //</editor-fold>

    //<editor-fold desc="Overriden methods">
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    //</editor-fold>

    //<editor-fold desc="Getter and Setter">
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    //</editor-fold>

}
