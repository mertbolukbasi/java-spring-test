package com.maina.MainaApp.controller.impl;

import com.maina.MainaApp.controller.IRestStaffController;
import com.maina.MainaApp.dto.DtoStaff;
import com.maina.MainaApp.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/staff")
public class RestStaffControllerImpl implements IRestStaffController {

    @Autowired
    private IStaffService staffService;

    @Override
    @GetMapping(path = "/{id}")
    public DtoStaff getStaffById(@PathVariable(name = "id") Long id) {
        return staffService.getStaffById(id);
    }
}
