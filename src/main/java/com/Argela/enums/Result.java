package com.Argela.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the result status of the call")
public enum Result {
    @Schema(description = "Call completed successfully")
    SUCCESS,

    @Schema(description = "Call failed")
    FAIL
}
