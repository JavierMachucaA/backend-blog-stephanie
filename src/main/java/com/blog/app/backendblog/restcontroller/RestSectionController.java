package com.blog.app.backendblog.restcontroller;

import com.blog.app.backendblog.models.Section;
import com.blog.app.backendblog.repository.SectionRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sections")
public class RestSectionController {
    @Autowired
    private SectionRepository sectionRepository;

    @GetMapping("/all")
    public List<Section> getAll(){
        return this.sectionRepository.findAll();
    }
    @PutMapping
    public void insert(@RequestBody Section hotel){
        this.sectionRepository.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Section hotel){
        this.sectionRepository.save(hotel);
    }

    @GetMapping("/{id}")
    public Section getById(@PathVariable("id") ObjectId id){
        Section section = this.sectionRepository.findById(id);

        return section;
    }
}
