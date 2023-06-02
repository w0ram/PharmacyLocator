package gestion.packages.auth;


import gestion.packages.entities.Role;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Role role;
}