package com.app.arith.endpoint.event.consumer.model;

import com.app.arith.PojaGenerated;
import com.app.arith.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
