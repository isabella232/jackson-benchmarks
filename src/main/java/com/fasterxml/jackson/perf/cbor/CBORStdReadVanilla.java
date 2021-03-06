package com.fasterxml.jackson.perf.cbor;

import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.perf.ReadPerfBaseFullJackson;
import com.fasterxml.jackson.perf.data.InputConverter;
import com.fasterxml.jackson.perf.model.MediaItem;

@State(Scope.Thread)
public class CBORStdReadVanilla
    extends ReadPerfBaseFullJackson<MediaItem>
{
    private static final ObjectMapper MAPPER = new ObjectMapper( new CBORFactory());

    public CBORStdReadVanilla() {
        super(MediaItem.class, InputConverter.stdConverter(MAPPER), MAPPER);
    }
}
