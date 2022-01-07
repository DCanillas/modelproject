package org.example.modelproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class OrderDTO {

    private long id;
    private long customerId;
    private List<ProductDTO> products = new ArrayList<>();

}
