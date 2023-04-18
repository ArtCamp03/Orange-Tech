package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        }else {
            System.out.println("UPDATE - REcebendo o usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Rcebendo o id %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Glayson", "password"));
        usuarios.add(new Usuario("Henrique", "password2"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("Glayson", "password");
    }

    public Usuario findByUserName(Integer userName){
        System.out.println(String.format("FIND/username - Recebendo o is: %d para localizar um usuario", userName));
        return new Usuario("Glayson", "password");
    }

}
