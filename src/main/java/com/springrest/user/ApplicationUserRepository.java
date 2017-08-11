package com.springrest.user;

/**
 * Created by tanerali on 11/08/2017.
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
	ApplicationUser findByUsername(String username);
}
