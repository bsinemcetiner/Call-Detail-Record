package com.Argela.dataTransferObject;

import com.Argela.enums.Direction;
import com.Argela.enums.Result;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CdrRequest {

    @Schema(description = "Call start time", example = "2025-08-04T13:00:00")
    private Date startTime;

    @Schema(description = "Call end time", example = "2025-08-04T13:10:00")
    private Date endTime;

    @Schema(description = "International Mobile Subscriber Identity", example = "123456789012345")
    private String imsi;

    @Schema(description = "International Mobile Equipment Identity", example = "356789012345678")
    private String imei;

    @Schema(description = "Cell ID of the mobile network", example = "123")
    private Integer cellId;

    @Schema(description = "Location Area Code ID", example = "456")
    private Integer lacId;

    @Schema(description = "Time taken to establish the call in seconds", example = "3")
    private Long setupDuration;

    @Schema(description = "Duration of the conversation in seconds", example = "120")
    private Long conversationDuration;

    @Schema(description = "Direction of the call (MO = Mobile Originated, MT = Mobile Terminated)", example = "MO")
    private Direction direction;

    @Schema(description = "Result status of the call", example = "SUCCESS")
    private Result result;

    @Schema(description = "Calling party number (A-Number)", example = "905551112233")
    private String anumber;

    @Schema(description = "Called party number (B-Number)", example = "905559998877")
    private String bnumber;

}
