package configuration_via_reflection;

/**
 * @author Alpi
 * @since 13.11.16
 */
public class SecondServiceImplementation implements Service {
  @Override
  public void serve() {
    System.out.println("Second server serve()");
  }
}
