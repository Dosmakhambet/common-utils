package com.dto;

import com.enums.IndividualStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IndividualDto implements Serializable {
    private UUID id;
    private UUID userId;
    private Timestamp created;
    private Timestamp updated;
    private String passportNumber;
    private String phoneNumber;
    private String email;
    private Timestamp verifiedAt;
    private Timestamp archivedAt;
    private IndividualStatus status;
    private UserDto user;
}
