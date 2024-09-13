package com.codekul.Aug24Batch.onetoone.repository;

import com.codekul.Aug24Batch.onetoone.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
