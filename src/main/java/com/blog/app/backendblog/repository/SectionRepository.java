package com.blog.app.backendblog.repository;

import com.blog.app.backendblog.models.Section;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends MongoRepository<Section, String> {
    Section findById(ObjectId id);
}
