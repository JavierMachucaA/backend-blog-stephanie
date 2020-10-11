package com.blog.app.backendblog.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sections")
public class Section {
    @Id
    private ObjectId id;
    private String name;
    private String despcription;
    private Integer countPostOfSection;

    public Section(ObjectId id, String name, String despcription) {
        this.id = id;
        this.name = name;
        this.despcription = despcription;
    }

    public Section(ObjectId id, String name, String despcription, Integer countPostOfSection) {
        this.id = id;
        this.name = name;
        this.despcription = despcription;
        this.countPostOfSection = countPostOfSection;
    }

    public Section() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDespcription() {
        return despcription;
    }

    public void setDespcription(String despcription) {
        this.despcription = despcription;
    }

    public Integer getCountPostOfSection() {
        return countPostOfSection;
    }

    public void setCountPostOfSection(Integer countPostOfSection) {
        this.countPostOfSection = countPostOfSection;
    }
}
