package com.dbs.services;

import com.dbs.entity.Appointment;
import com.dbs.model.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService{
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Override
    public List<Appointment> findByWMIdAndStatus(int WMId, String status) {
        Optional<List<Appointment>> result = appointmentRepository.findAppointmentByWmIdAndStatus(WMId,status);
        if(result.isEmpty())
            throw  new RuntimeException("Invalid WM ID or status");
        return result.get();
    }
}
