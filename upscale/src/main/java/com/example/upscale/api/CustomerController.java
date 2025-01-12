package com.example.upscale.api;


import com.example.upscale.dto.request.RequestCustomerDto;
import com.example.upscale.service.CustomerService;
import com.example.upscale.utill.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @PostMapping
    public ResponseEntity<StandardResponse> create(@RequestBody RequestCustomerDto dto){
        customerService.create(dto);
        return new ResponseEntity<>(
                new StandardResponse(201,"Customer was created!..",null),
                HttpStatus.CREATED
        );
    }

    @PutMapping()
    public String update(@RequestBody RequestCustomerDto dto){
        return "update()";
    }

    @GetMapping("/{id}")
    public ResponseEntity<StandardResponse> getById(@PathVariable String id){
        return new ResponseEntity<>(
                new StandardResponse(201,"Customer data!..",customerService.findById(id)),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping()
    public String delete(@RequestBody RequestCustomerDto dto){
        return "delete()";
    }

    @GetMapping("/list")
    public String findAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ){
        return "findAll()";
    }
}
