package ru.flamexander.spring.security.jwt.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.flamexander.spring.security.jwt.entities.Role;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Data
@AllArgsConstructor
public class UserDto {
    private String id;
    private String username;
    private String email;
}
