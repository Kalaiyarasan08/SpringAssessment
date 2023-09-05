package Repository;
import com.example.asmt.User;
import org.springframework.data.repository.CrudRepository;
import com.example.asmt.User.*;

public abstract class UserRepository implements CrudRepository<User,Integer>
{

}
