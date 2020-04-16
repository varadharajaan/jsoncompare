package com.jsoncompare.jsoncompare.service;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author Varadharajan on 16/04/20 18:39
 * @Projectname jsoncompare
 */
@Service
public class JsonServiceImpl implements JsonService {
    @Override
    public JsonValue add(JsonValue jsonValue) {
        return null;
    }

    @Override
    public JsonValue getJsonvalue(UUID id) {
        return null;
    }

    @Override
    public List<JsonValue> getAllJsonValues() {
        return null;
    }
}
