package org.example.modelproject.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(exclude = "orders")
@EqualsAndHashCode(exclude="orders")
public class CustomerDTO {

    private long id;
    private String name;
    private String email;
    private List<OrderDTO> orders = new ArrayList<>();

}
