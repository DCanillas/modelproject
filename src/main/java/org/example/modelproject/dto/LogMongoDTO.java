package org.example.modelproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogMongoDTO {
    private Date time;
    private String url;
    private String state;
    private String object;

}
