package com.codekul.Aug24Batch.onetoone.repository;

import com.codekul.Aug24Batch.onetoone.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
}
