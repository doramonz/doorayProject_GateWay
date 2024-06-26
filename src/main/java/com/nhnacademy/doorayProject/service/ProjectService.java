package com.nhnacademy.doorayProject.service;

import com.nhnacademy.doorayProject.dto.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectService {
    public ProjectDto addProject(ProjectDto project);

    public List<ProjectDto> getProjects(String userId);

    public UpdateProjectResponse updateProject(Integer projectId, RequestProjectDto project);

    public String deleteProject(Integer projectId);

    public ProjectNameStatusDto getProject(Integer projectId);

    public ProjectMemberDto addProjectMemeber(Integer projectId, ProjectMemberDto projectMemberDto);

    public ProjectMemberDto deleteProjectMember(Integer projectId,ProjectMemberDto projectMemberDto);
}
