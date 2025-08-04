package com.Argela.controller;

import com.Argela.dataTransferObject.CdrRequest;
import com.Argela.entities.Cdr;
import com.Argela.service.CdrService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cdrs")
@RequiredArgsConstructor
public class CdrController {

    private final CdrService cdrService;

    @PostMapping
    public Cdr save(@RequestBody CdrRequest request) {
        return cdrService.save(request);
    }

    @PostMapping("/batch")
    public List<Cdr> saveBatch(@RequestBody List<CdrRequest> requestList) {
        return cdrService.saveAll(requestList);
    }

    @GetMapping
    public List<Cdr> getAll() {
        return cdrService.getAll();
    }

    @GetMapping("/by-caller/{number}")
    public List<Cdr> getByCaller(@PathVariable String number) {
        return cdrService.getByCaller(number);
    }
}