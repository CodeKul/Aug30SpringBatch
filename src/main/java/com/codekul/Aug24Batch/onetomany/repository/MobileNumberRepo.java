package com.codekul.Aug24Batch.onetomany.repository;

import com.codekul.Aug24Batch.onetomany.entity.MobileNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileNumberRepo extends JpaRepository<MobileNumber, Long> {
}
