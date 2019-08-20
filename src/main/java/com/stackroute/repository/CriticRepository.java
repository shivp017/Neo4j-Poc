package com.stackroute.repository;

import com.stackroute.domain.Critic;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface CriticRepository extends Neo4jRepository<Critic, Long> {
    @Query("MATCH (c:Critic)<-[r:RATED]-(m:Movie) RETURN c,r,m")
    Collection<Critic> getAllCritic();
    @Query("CREATE(m:Movies)-[:RATED {rating: {rating}]->(c:Critic)")
    Critic setRelation(@Param("rating") int rating);
}
