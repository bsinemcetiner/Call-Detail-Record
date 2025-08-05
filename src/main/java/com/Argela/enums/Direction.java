package com.Argela.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the direction of the call")
public enum Direction {

    @Schema(description = "Mobile Originated call (outgoing)")
    MO,

    @Schema(description = "Mobile Terminated call (incoming)")
    MT
}


