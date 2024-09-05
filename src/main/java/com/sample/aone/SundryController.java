package com.sample.aone;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("addSundry")
public class SundryController {

    private final SundryService sundryService;

    public SundryController(SundryService sundryService) {
        this.sundryService = sundryService;
    }

    @PostMapping("add")
    public Sundry add(@RequestBody Sundry sundry){
        return sundryService.createSundry(sundry);
    }

}
