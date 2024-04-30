package com.project.billboardusagesystem.model;

import lombok.Data;

@Data
public class SignUpRequest {
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    private String contactInfo;
    private String role;
}
