package com.jsoncompare.jsoncompare.controller;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jsoncompare.jsoncompare.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class JsonController {

    JsonService service;

    @Autowired
    public void setService(JsonService service) {
        this.service = service;
    }

    @PostMapping("/jsonValue")
    public JsonValue saveJson(@RequestBody JsonValue jsonValue) {

        return service.add(jsonValue);

    }

    @GetMapping("/jsonValue/{jsonId}")
    public JsonValue getEmployee (@PathVariable("jsonId") UUID jsonId) {

        return service.getJsonvalue(jsonId);
    }

    @GetMapping("/")
    public List<JsonValue> findAll() {
        return service.getAllJsonValues();
    }

}
