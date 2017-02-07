package participant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DBManager extends CrudRepository<UserInfo, Long> {

  public UserInfo findByEmail(String email);

}
