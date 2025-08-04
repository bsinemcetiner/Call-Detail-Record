package com.Argela.mapper;

import com.Argela.dataTransferObject.CdrRequest;
import com.Argela.entities.Cdr;
import org.springframework.stereotype.Component;

@Component
public class CdrMapper {
    public Cdr toEntity(CdrRequest request) {
        return Cdr.builder()
                .startTime(request.getStartTime())
                .endTime(request.getEndTime())
                .imsi(request.getImsi())
                .imei(request.getImei())
                .cellId(request.getCellId())
                .lacId(request.getLacId())
                .aNumber(request.getANumber())
                .bNumber(request.getBNumber())
                .setupDuration(request.getSetupDuration())
                .conversationDuration(request.getConversationDuration())
                .direction(request.getDirection())
                .result(request.getResult())
                .build();
    }
}

