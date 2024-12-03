import data.model.PersonClass;

public class Main {
  public static void main(String[] args) {
    PersonClass persona = new PersonClass();

    persona.setEmail("Kevin");

    System.out.println(persona.getEmail());
  }
}