package org.example.modelproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ProductDTO {

    private long id;
    private String name;
    private String description;
    private double price;
    private List<CategoryDTO> categories = new ArrayList<>();

}
