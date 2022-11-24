package com.democassandra.service;

import com.democassandra.model.Tutorial;
import com.democassandra.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    private final List<Tutorial> tutorials = new ArrayList<>();


    public List<Tutorial> getAll(String title) {
        tutorials.clear();
        if (title == null)
            tutorials.addAll(tutorialRepository.findAll());
        else
            tutorials.addAll(tutorialRepository.findByTitleContaining(title));

        return tutorials;
    }

    public Tutorial create(Tutorial tutorial) {
        return tutorialRepository.save(new Tutorial(tutorial.getId(), tutorial.getTitle(), tutorial.getDescription(), false));
    }

    public Optional<Tutorial> get(int id) {
        return tutorialRepository.findById(id);
    }
}
