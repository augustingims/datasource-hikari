package com.teamdevsolution.app.repository;

import com.teamdevsolution.app.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
