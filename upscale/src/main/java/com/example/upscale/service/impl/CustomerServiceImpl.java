package com.example.upscale.service.impl;

import com.example.upscale.Repo.CustomerRepo;
import com.example.upscale.dto.request.RequestCustomerDto;
import com.example.upscale.entity.Customer;
import com.example.upscale.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    @Override
    public void create(RequestCustomerDto dto) {
        Customer customer = Customer.builder()
                .propertyId(UUID.randomUUID().toString())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .address(dto.getAddress())
                .isActive(dto.isActive())
                .build();
                customerRepo.save(customer);
    }
}
