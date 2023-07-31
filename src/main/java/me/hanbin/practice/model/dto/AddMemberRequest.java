package me.hanbin.practice.model.dto;

import lombok.Data;

@Data
public class AddMemberRequest {
    private String email;
    private String password;
}
