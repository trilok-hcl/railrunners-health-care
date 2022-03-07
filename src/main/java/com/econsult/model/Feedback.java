package com.econsult.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Feedback {
    @Id
    String feedbackId;
    String hospitalEnvironment;
    String wardFacility;
    String toilet;
    String foodDiet;
    String serviceDoctor;
    String serviceNurse;
    String hospitalBilling;
    String receptionEnquiry;
    String admissionProcess;
    String dischargeProcess;
    String overallRating;
}
