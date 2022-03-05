package com.dbs.services;

import com.dbs.entity.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {
    public List<Appointment> findByWMIdAndStatus(int WMId, String status);
    public void saveWMIAppointment(Appointment appointment);
}
