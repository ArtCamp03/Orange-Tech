package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UseRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Artur");
        user.setUsername("ArtCamps");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
