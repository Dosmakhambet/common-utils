package com.dto;

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
public class VerificationStatusDto implements Serializable {
    private UUID id;
    private Timestamp created;
    private Timestamp updated;
    private UUID profileId;
    private String profileType;
    private String details;
    private String verificationStatus;
    private UserDto user;
}
