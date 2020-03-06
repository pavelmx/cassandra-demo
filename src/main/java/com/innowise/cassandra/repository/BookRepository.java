package com.innowise.cassandra.repository;

import com.innowise.cassandra.entity.Book;
import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CassandraRepository<Book, UUID> {
    //
}