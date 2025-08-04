package com.Argela.controller;

import com.Argela.dataTransferObject.CdrRequest;
import com.Argela.dataTransferObject.CdrResponse;
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
    public CdrResponse save(@RequestBody CdrRequest request) {
        return cdrService.save(request);
    }

    @PostMapping("/batch")
    public List<CdrResponse> saveBatch(@RequestBody List<CdrRequest> requestList) {
        return cdrService.saveAll(requestList);
    }

    @GetMapping
    public List<CdrResponse> getAll() {
        return cdrService.getAll();
    }

    @GetMapping("/by-caller/{number}")
    public List<CdrResponse> getByCaller(@PathVariable String number) {
        return cdrService.getByCaller(number);
    }
}
