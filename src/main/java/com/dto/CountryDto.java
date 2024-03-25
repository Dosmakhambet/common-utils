package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto implements Serializable {
    private Long id;
    private Timestamp created;
    private Timestamp updated;
    private String name;
    private String alpha2;
    private String alpha3;
    private String status;
}
