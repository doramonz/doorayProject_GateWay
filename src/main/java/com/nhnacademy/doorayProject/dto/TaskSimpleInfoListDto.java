package com.nhnacademy.doorayProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class TaskSimpleInfoListDto {
    private List<TaskSimpleInfoDto> tasks;
}