package com.maina.MainaApp.dto;

import com.maina.MainaApp.entity.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStaff {

    private String username;

    private String discordID;

    private String role;

    private ArrayList<DtoNote> notes = new ArrayList<>();
}
