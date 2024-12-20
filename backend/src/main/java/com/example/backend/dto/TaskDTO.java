package com.example.backend.dto;

import com.example.backend.model.Task;
import com.example.backend.model.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
  private Task task;
  private Status status;
}
