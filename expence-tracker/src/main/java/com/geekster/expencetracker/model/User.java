package com.geekster.expencetracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @Column(name="user_name")
    @NotBlank(message = "Name is mandatory")
    private String userName;
    @Column(name="password")
    @NotBlank(message = "password is mandatory")
    private String password;
//    @Column(name="email")
//    @NotBlank(message = "Email is mandatory")
//    @Email(message = "Email is not valid")
//    private String email;
//    @Column(name="phone_number")
//    @Size(min=12,max=12,message = "phone number is not valid")
//    @Pattern(regexp = "(0|91)?[6-9][0-9]{9}")
//    private String phoneNumber;
//
 }
