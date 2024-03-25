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
public class AddressDto implements Serializable {
    private UUID id;
    private Timestamp created;
    private Timestamp updated;
    private String address;
    private String zipCode;
    private Timestamp archived;
    private String city;
    private String state;
    private CountryDto country;
}
