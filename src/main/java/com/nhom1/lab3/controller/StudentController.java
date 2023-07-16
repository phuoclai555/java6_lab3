package com.nhom1.lab3.controller;

import com.nhom1.lab3.model.student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @GetMapping("/student/form")
    public String form(Model model){
        student student = new student();
        model.addAttribute("sv",student);
        return"student/form";
    }

    @PostMapping("/student/save")
    public String save(Model model, @Validated @ModelAttribute("sv") student sv, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("message","Vui lòng sửa các lỗi sau: ");
            return "student/form";
        }
        return "student/success";
    }

    @ModelAttribute("countries")
    public Map<String, String> getCountries(){
        Map<String,String> map = new HashMap<>();
        map.put("VN","Việt Nam");
        map.put("US","United States");
        return map;
    }
}
