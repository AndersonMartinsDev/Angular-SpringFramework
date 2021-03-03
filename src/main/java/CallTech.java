
import com.calltech.security.entity.Usuario;
import com.calltech.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EntityScan(basePackages = { "com.calltech" })
@ComponentScan(basePackages = { "com.calltech" })
@EnableJpaRepositories(basePackages = { "com.calltech" })
public class CallTech {
	public static void main(String[] args) {SpringApplication.run(CallTech.class, args);}
}
