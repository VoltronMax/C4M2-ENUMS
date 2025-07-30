package model.security;

/**
 * Esta clase describe la informacion del usuario que ingresara al sistema
 */

public class User {
    private String name;
    private String email;
    private String password;
    private Boolean active;
    private UserRole role;


    /**
     *Crea un nuevo objeto de tipo usuario
     *
     * @param name Nombre del usuario
     * @param email Correo electronico
     * @param password Contraseña
     * @param active Identifica si el usuario se encuentra activo o non. Se tiene valor true si el user esta activo
     * @param role Identifica el role que tiene el usuario a traves de enums de tipo UserRole
     */

    public User(String name, String email, String password, Boolean active, UserRole role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = true;
        this.role = UserRole.USER;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = true;
        this.role = UserRole.USER;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getActive() {
        return active;
    }

    public UserRole getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void activateUser(){
        this.active = true;
    }

    public void desactiveUser(){
        this.active = false;
    }

    public void setRole(UserRole role){
        this.role = role;
    }

    @Override
    public String toString() {
        return getName();
    }

    
    
    
    
}
