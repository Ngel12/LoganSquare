package com.bluelinelabs.logansquare.demo.model;

import com.bluelinelabs.logansquare.JsonMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public final class NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel$$JsonObjectMapper extends JsonMapper<NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel> {
    @Override
    public NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel parse(JsonParser jsonParser) throws IOException {
        return _parse(jsonParser);
    }

    public static NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel _parse(JsonParser jsonParser) throws IOException {
        NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel instance = new NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel();
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            parseField(instance, fieldName, jsonParser);
            jsonParser.skipChildren();
        }
        return instance;
    }

    public static void parseField(NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("nonAnnotatedString".equals(fieldName)) {
            instance.nonAnnotatedString = jsonParser.getValueAsString(null);
        } else if ("annotated_string".equals(fieldName)){
            instance.annotatedString = jsonParser.getValueAsString(null);
        } else if ("nonAnnotatedPrivateInt".equals(fieldName)){
            instance.setNonAnnotatedPrivateInt(jsonParser.getValueAsInt());
        } else if ("nonAnnotatedList".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayList<String> collection = new ArrayList<String>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    String value = jsonParser.getValueAsString(null);
                    if (value != null) {
                        collection.add(value);
                    }
                }
                instance.nonAnnotatedList = collection;
            }
        }
    }

    @Override
    public void serialize(NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        _serialize(object, jsonGenerator, writeStartAndEnd);
    }

    public static void _serialize(NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeStringField("nonAnnotatedString", object.nonAnnotatedString);
        jsonGenerator.writeStringField("annotated_string", object.annotatedString);
        jsonGenerator.writeNumberField("nonAnnotatedPrivateInt", object.getNonAnnotatedPrivateInt());
        List<String> lslocalnonAnnotatedList = object.nonAnnotatedList;
        if (lslocalnonAnnotatedList != null) {
            jsonGenerator.writeFieldName("nonAnnotatedList");
            jsonGenerator.writeStartArray();
            for (String element : lslocalnonAnnotatedList) {
                jsonGenerator.writeString(element);
            }
            jsonGenerator.writeEndArray();
        }
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}
