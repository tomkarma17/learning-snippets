@Data
@ConfigurationProperties(prefix="mycompany.email")
@Component
public class EmailProperties {

  private String username;
  private String password;
  private String host;
  private String mailbox;

}
