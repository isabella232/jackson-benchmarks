package com.fasterxml.jackson.perf.cbor;

import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.fasterxml.jackson.perf.WritePerfBasicJackson;

@State(Scope.Group) // Thread, Group or Benchmark
public class CBORWriteAfterburner
    extends WritePerfBasicJackson
{
    private static final ObjectMapper MAPPER;
    static {
    	CBORFactory f = new CBORFactory();
    	// configure differently?
    	MAPPER = new ObjectMapper(f);
        MAPPER.registerModule(new AfterburnerModule());
    }

    public CBORWriteAfterburner() {
        super(MAPPER);
    }
}
