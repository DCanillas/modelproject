package org.example.modelproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDTO {

    private long id;
    private String name;
    private String description;

}
