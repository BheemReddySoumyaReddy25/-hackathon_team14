package com.dbs.controller;

import com.dbs.entity.Appointment;
import com.dbs.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @InitBinder
    public void initBinder(WebDataBinder dataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @GetMapping("/appointment_list")
    public String getAppointmentsByWMIdAndStatus(Model model, @RequestParam("WMId") int WMId,@RequestParam("status") String status){
        List<Appointment> appointments = appointmentService.findByWMIdAndStatus(WMId,status);
        model.addAttribute("appointments",appointments);
        return "wealth_manager/appointments";
    }
    @GetMapping("/dashboard")
    public  String getDashboard(Model model,@RequestParam("WMId") int WMId){
        model.addAttribute("accepted",appointmentService.findByWMIdAndStatus(WMId,"accept").size());
        model.addAttribute("request",appointmentService.findByWMIdAndStatus(WMId,"request").size());
        model.addAttribute("rescheduled",appointmentService.findByWMIdAndStatus(WMId,"rescheduled").size());
        return "wealth_manager/dashboard";
    }
}
