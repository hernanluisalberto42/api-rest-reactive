package com.example.reacive.demoreactive.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDepartmentDTO {

    private int age;
    private Integer departmentId;
    private String departmentName;
    private String userName;
    private Integer userId;
    private String loc;
    private double salary;
}
