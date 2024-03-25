package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantDto implements Serializable {
    private UUID id;
    private UUID creatorId;
    private Timestamp created;
    private Timestamp updated;
    private String companyName;
    private String companyId;
    private String email;
    private String phoneNumber;
    private Timestamp verifiedAt;
    private Timestamp archivedAt;
    private String status;
    private boolean filled;
    private List<MerchantMemberDto> members;
    private UserDto creator;
}
