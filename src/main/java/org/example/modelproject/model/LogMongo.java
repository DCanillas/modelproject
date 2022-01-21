package org.example.modelproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@NoArgsConstructor
@Document(collection = "logs")
public class LogMongo {

    @Transient
    public static final String SEQUENCE_NAME = "log_sequence";

    @Id
    private Long id;

    private Date time;
    private String url;
    private String state;
    private String object;


}
