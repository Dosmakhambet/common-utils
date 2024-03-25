package com.dto;

import com.enums.UserStatus;
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
public class UserDto implements Serializable {
    private UUID id;
    private String secretKey;
    private Timestamp created;
    private Timestamp updated;
    private String firstName;
    private String lastName;
    private Timestamp verifiedAt;
    private Timestamp archivedAt;
    private UserStatus status;
    private boolean filled;
    private UUID addressId;
    private AddressDto address;
}
