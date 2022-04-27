package net.sparkminds.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sparkminds.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {

	User findOneByEmailIgnoreCaseAndPassword(String email, String password);

}
