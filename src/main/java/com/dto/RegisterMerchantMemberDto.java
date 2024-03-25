package com.dto;

import com.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMerchantMemberDto implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private Role memberRole;
    private AddressDto address;
}
