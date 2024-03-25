package com.dto;

import com.enums.MerchantMemberStatus;
import com.enums.Role;
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
public class MerchantMemberDto implements Serializable {
    private UUID id;
    private UUID userId;
    private Timestamp created;
    private Timestamp updated;
    private UUID merchantId;
    private Role memberRole;
    private MerchantMemberStatus status;
    private MerchantDto merchant;
    private IndividualDto individual;
    private UserDto user;
}
