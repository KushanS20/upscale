package com.example.upscale.api;


import com.example.upscale.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping
    public String create(@RequestBody RequestCustomerDto dto){
        System.out.println(dto.getName());
        return "create()";
    }

    @PutMapping()
    public String update(@RequestBody RequestCustomerDto dto){
        return "update()";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable String id){
        return "getById()";
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
