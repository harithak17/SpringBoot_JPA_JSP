package org.springboot.jpa.rest.Repository;

import org.springboot.jpa.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


//Note that we do not need to add @Repository annotation because Spring Data JPA internally takes care of it.
public interface UserRepository extends JpaRepository<User, Long>{

}
