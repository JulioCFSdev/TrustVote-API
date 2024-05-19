package com.trustvote.api.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user_credentials")
@Table(name = "user_credentials")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_credentials_id")
    private String id;
    private String username;
    private String email;
    private String password;
    private String cpf;
    private String phone_number;
}
