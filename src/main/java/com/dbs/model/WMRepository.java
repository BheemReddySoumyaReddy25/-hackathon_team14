package com.dbs.model;
import com.dbs.entity.WM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WMRepository extends JpaRepository<WM,Integer>{
}
