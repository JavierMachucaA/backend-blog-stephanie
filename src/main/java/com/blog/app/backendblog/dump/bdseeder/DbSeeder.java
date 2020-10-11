package com.blog.app.backendblog.dump.bdseeder;

import com.blog.app.backendblog.models.Section;
import com.blog.app.backendblog.repository.SectionRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    @Autowired
    public SectionRepository sectionRepository;

    @Override
    public void run(String... args) throws Exception {
        this.sectionRepository.deleteAll();
        Section section = new Section(new ObjectId(),"section1", "descripcion sección1");
        List<Section> sections = Arrays.asList(section);
        this.sectionRepository.saveAll(sections);
    }
}
