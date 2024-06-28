package com.example.test.feign;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BusDto {

    @NotBlank(message = "email is required ")
    private String email;
    @NotBlank(message = "password is required ")

    private String password;
    @NotBlank(message = "fullName is required ")

    private String fullName;
}
