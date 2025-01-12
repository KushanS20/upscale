package com.example.upscale.dto.reponse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseCustomerDto {
    private String propertyId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;
}
