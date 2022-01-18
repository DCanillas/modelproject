package org.example.modelproject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class MessageKafkaDTO {
    private Timestamp time;
    private String url;
    private String state;
    private String object;

    public MessageKafkaDTO(Timestamp time, String url, String state, String object) {
        this.time = time;
        this.url = url;
        this.state = state;
        this.object = object;
    }
}
