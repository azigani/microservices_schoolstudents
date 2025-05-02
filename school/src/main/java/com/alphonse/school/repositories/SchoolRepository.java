package com.alphonse.school.repositories;

import com.alphonse.school.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SchoolRepository extends JpaRepository <School, Integer> {
}
