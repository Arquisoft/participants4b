package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CitizenDao extends CrudRepository<Citizen, Long> {

  public Citizen findByEmail(String email);

}
