package com.sw.sewing_workshop.textile.dto;

import com.sw.sewing_workshop.Create;
import com.sw.sewing_workshop.textile.Status;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TextileDto {
    private long id;
    @NotBlank(groups = {Create.class})
    private String name;
    @NotBlank(groups = {Create.class})
    private String color;
    @NotBlank(groups = {Create.class})
    private Status status;
    @NotBlank(groups = {Create.class})
    private int length;
    @NotBlank(groups = {Create.class})
    private int width;
    private LocalDateTime delivery_time;
}
