package com.fasterxml.jackson.perf.protob;

import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;

import com.fasterxml.jackson.databind.*;

import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;

import com.fasterxml.jackson.perf.WritePerfBasicJackson;
import com.fasterxml.jackson.perf.model.MediaItem;

@State(Scope.Thread)
public class ProtobufStdWriteVanilla
    extends WritePerfBasicJackson<MediaItem>
{
    private static final ObjectMapper MAPPER = new ProtobufMapper();

    private final static ProtobufSchema _mediaItemSchema = ProtobufHelper.mediaItemSchema();

    public ProtobufStdWriteVanilla() {
        super(MAPPER, _mediaItemSchema);
    }
}
