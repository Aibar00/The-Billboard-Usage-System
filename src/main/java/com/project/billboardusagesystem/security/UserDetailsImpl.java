package com.project.billboardusagesystem.security;

import com.project.billboardusagesystem.model.UserEntity;
import jakarta.persistence.OneToMany;
import lombok.NonNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserDetailsImpl implements UserDetails {
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    private String contactInfo;
    private String role;

    public UserDetailsImpl(String name, String surname, String username, String email, String password, String contactInfo, String role) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.contactInfo = contactInfo;
        this.role = role;
    }

    public static UserDetailsImpl build(UserEntity user){
        return new UserDetailsImpl(
                user.getName(),
                user.getSurname(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getContactInfo(),
                user.getRole()
        );
    }

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
}
