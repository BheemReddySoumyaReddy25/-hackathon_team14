package com.dbs.model;
import com.dbs.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
    Optional<List<Appointment>> findAppointmentByWmIdAndStatus(int wmId, String status);
}
