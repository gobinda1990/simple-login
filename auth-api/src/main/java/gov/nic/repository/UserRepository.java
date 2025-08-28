package gov.nic.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import gov.nic.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
