package com.jsoncompare.jsoncompare.entity;

import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Entity;
import java.util.UUID;

/**
 * @Author Varadharajan on 16/04/20 18:46
 * @Projectname jsoncompare
 */
@Entity(name = "jsonValue")
public class JsonVal {

    private UUID id;

    private JsonNode jsonNode;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public JsonNode getJsonNode() {
        return jsonNode;
    }

    public void setJsonNode(JsonNode jsonNode) {
        this.jsonNode = jsonNode;
    }
}
