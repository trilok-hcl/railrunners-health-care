package com.econsult.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Consultation {
    @Id
    String id;
    String diagnosis;
    String response;
    LocalDate consultOn;
    LocalDate responseOn;
    List<Attachment> consultAttachment;
    List<Attachment> responseAttachment;
}
