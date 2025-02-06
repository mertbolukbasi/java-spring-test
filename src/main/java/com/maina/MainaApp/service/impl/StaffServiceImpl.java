package com.maina.MainaApp.service.impl;

import com.maina.MainaApp.dto.DtoNote;
import com.maina.MainaApp.dto.DtoStaff;
import com.maina.MainaApp.entity.Note;
import com.maina.MainaApp.entity.Staff;
import com.maina.MainaApp.repository.StaffRepository;
import com.maina.MainaApp.service.IStaffService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements IStaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public DtoStaff getStaffById(Long id) {
        Optional<Staff> optional = staffRepository.findById(id);

        if (optional.isPresent()) {
            Staff staff = optional.get();
            DtoStaff dtoStaff = new DtoStaff();
            BeanUtils.copyProperties(staff, dtoStaff);

            // Notes listesini dönüştür
            ArrayList<DtoNote> dtoNotes = new ArrayList<>();
            for (Note note : staff.getNotes()) {
                DtoNote dtoNote = new DtoNote();
                BeanUtils.copyProperties(note, dtoNote);
                dtoNotes.add(dtoNote);
            }

            dtoStaff.setNotes(dtoNotes); // Artık List<DtoNote> ile uyumlu
            return dtoStaff;
        }
        return null;
    }

}
