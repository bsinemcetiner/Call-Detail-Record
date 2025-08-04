package com.Argela.service;

import com.Argela.dataTransferObject.CdrRequest;
import com.Argela.dataTransferObject.CdrResponse;

import java.util.List;

public interface CdrService {
    CdrResponse save(CdrRequest request);
    List<CdrResponse> saveAll(List<CdrRequest> requestList);
    List<CdrResponse> getAll();
    List<CdrResponse> getByCaller(String aNumber);
}
