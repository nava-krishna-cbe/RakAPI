package com.rak.api.repository;




import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rak.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	  Optional<User> findById(Long id);

	

}
