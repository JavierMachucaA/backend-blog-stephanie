package com.blog.app.backendblog.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Posts")
public class Post {
    private ObjectId id;
    private String title;
    private String[] links;
    private String[] tags;
    private String[] authors;
}
