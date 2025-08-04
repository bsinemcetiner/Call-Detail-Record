package com.Argela.dataTransferObject;

import com.Argela.enums.Direction;
import com.Argela.enums.Result;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CdrResponse {
    private Long id;
    private Date startTime;
    private Date endTime;
    private String imsi;
    private String imei;
    private Integer cellId;
    private Integer lacId;
    private String aNumber;
    private String bNumber;
    private Long setupDuration;
    private Long conversationDuration;
    private Direction direction;
    private Result result;
}
