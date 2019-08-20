package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Critic {
    @Id
    private long id;
    private String name;
    private int age;

    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Movie> movies;

}
