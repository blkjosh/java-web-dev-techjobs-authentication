package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotBlank
    @NotNull
    @Size(min = 5, max = 18, message = "Invalid username. Must be between 5 and 18 characters!")
    private String username;

    @NotBlank
    @NotNull
    @Size(min = 5, max = 30, message = "Invalid password. Must be between 5 and 30 characters!")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
