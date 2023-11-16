package com.bwl.apiusers.dtos;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
public class UserDTO implements DTO {
    private Integer id;
    private String name;
    private String email;
    private String userName;
}
