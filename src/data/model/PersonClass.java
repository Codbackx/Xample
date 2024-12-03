package data.model;

public class PersonClass {
  private String nombre;
  private String email;
  private String apellido;

  public PersonClass(){}

  public PersonClass(String nombre, String email, String apellido) {
    this.nombre = nombre;
    this.email = email;
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
}
