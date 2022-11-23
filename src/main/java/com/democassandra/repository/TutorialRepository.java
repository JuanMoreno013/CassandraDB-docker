package com.democassandra.repository;

import com.democassandra.model.Tutorial;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TutorialRepository extends CassandraRepository<Tutorial, Integer> {
    @AllowFiltering
    List<Tutorial> findByPublished(boolean published); //SELECT * FROM tutorial WHERE published = [true/false];

    List<Tutorial> findByTitleContaining(String title);
}
