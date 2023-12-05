package com.sw.sewing_workshop.dress.dto;

import com.sw.sewing_workshop.Create;
import com.sw.sewing_workshop.dress.StatusDress;
import com.sw.sewing_workshop.textile.Textile;
import com.sw.sewing_workshop.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class DressDto {

    private long id;
    @NotBlank(groups = {Create.class})
    private Textile textile;
    @NotBlank(groups = {Create.class})
    private User customer;
    @NotBlank(groups = {Create.class})
    private LocalDateTime start;
    @NotBlank(groups = {Create.class})
    private LocalDateTime end;
    @NotBlank(groups = {Create.class})
    private StatusDress statusDress;

}
