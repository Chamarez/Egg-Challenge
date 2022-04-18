package Egg.Challenge.challenge.auth.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 50)
    @Email
    private String adress;

    private Set<String> role;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;



    public String getUsername() {
        return username;
    }


    public String getAdress() {
        return adress;
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }


    public Set<String> getRole() {
        return this.role;
    }

}