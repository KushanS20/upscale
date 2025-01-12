package com.example.upscale.service;

import com.example.upscale.dto.reponse.ResponseCustomerDto;
import com.example.upscale.dto.request.RequestCustomerDto;

public interface CustomerService {
    public void create (RequestCustomerDto dto);
    public ResponseCustomerDto findById(String id);
}
