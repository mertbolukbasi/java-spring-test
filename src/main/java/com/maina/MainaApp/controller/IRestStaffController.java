package com.maina.MainaApp.controller;

import com.maina.MainaApp.dto.DtoStaff;
import org.springframework.web.bind.annotation.PathVariable;

public interface IRestStaffController {

    public DtoStaff getStaffById(@PathVariable(name = "id") Long id);
}
