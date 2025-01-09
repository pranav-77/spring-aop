package com.springAop.api.repository;

import com.springAop.api.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
}
