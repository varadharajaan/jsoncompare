package com.jsoncompare.jsoncompare.service;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.UUID;

/**
 * @Author Varadharajan on 16/04/20 18:40
 * @Projectname jsoncompare
 */
public interface JsonService {

    JsonValue add(JsonValue jsonValue);

    JsonValue getJsonvalue(UUID id);

    List<JsonValue> getAllJsonValues();

}
