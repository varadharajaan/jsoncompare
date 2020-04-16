package com.jsoncompare.jsoncompare.repository;


import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Varadharajan on 16/04/20 18:45
 * @Projectname jsoncompare
 */
@Repository
public interface JsonRepository extends CrudRepository<JsonValue, Integer> {


}
