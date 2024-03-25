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
public class MerchantMemberInvitationDto implements Serializable {
    private UUID id;
    private Timestamp created;
    private Timestamp expires;
    private UUID merchantId;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private MerchantDto merchant;
}
