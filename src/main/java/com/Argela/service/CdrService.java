package com.Argela.service;

import com.Argela.dataTransferObject.CdrRequest;
import com.Argela.entities.Cdr;
import java.util.List;

public interface CdrService {
    Cdr save(CdrRequest request);
    List<Cdr> saveAll(List<CdrRequest> requestList);
    List<Cdr> getAll();
    List<Cdr> getByCaller(String aNumber);
}

