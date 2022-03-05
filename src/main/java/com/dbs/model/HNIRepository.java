package com.dbs.model;
import com.dbs.entity.HNI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HNIRepository extends JpaRepository<HNI,Integer> {
}
