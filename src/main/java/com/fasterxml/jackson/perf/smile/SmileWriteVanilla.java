package com.fasterxml.jackson.perf.smile;

import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.fasterxml.jackson.perf.WritePerfBasicJackson;

@State(Scope.Group) // Thread, Group or Benchmark
public class SmileWriteVanilla
    extends WritePerfBasicJackson
{
    private static final ObjectMapper MAPPER;
    static {
    	SmileFactory f = new SmileFactory();
    	// configure differently?
    	MAPPER = new ObjectMapper(f);
    }

    public SmileWriteVanilla() {
        super(MAPPER);
    }
}
