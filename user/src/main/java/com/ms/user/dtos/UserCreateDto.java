package com.ms.user.dtos;

import com.ms.user.models.UserModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserCreateDto(
        @NotBlank @NotNull String name,
        @NotBlank @NotNull @Email String email
) {

    public UserModel toEntity(){
        var userModel = new UserModel();
        userModel.setName(this.name());
        userModel.setEmail(this.email());

        return userModel;
    }
}
