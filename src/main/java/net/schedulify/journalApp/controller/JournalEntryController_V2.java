//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.schedulify.journalApp.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.schedulify.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.schedulify.journalApp.service.JournalEntityService;
import java.util.Optional;


@RestController
@RequestMapping({"/journal_"})
public class JournalEntryController_V2 {

    @Autowired
    private JournalEntityService journalEntryService;



    @GetMapping
    public List<JournalEntry> getAll()
    {
        return journalEntryService.getAll();
    }

    @DeleteMapping
    public void DeleteAll()
    {
        journalEntryService.deleteAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping({"id/{var}"})
    public JournalEntry getJournalEntryById(@PathVariable ObjectId var) {
        return journalEntryService.findbyId(var).orElse(null);
    }

    @DeleteMapping({"id/{var}"})
    public boolean deleteEntryById(@PathVariable ObjectId var)
    {
        journalEntryService.deletebyID(var);
        return true;
    }
/*
    @PutMapping({"id/{var}"})
    public JournalEntry updateJournal(@PathVariable ObjectId var, @RequestBody JournalEntry newE)
    {

        JournalEntry old=journalEntryService.findbyId(var).orElse(null);

        journalEntryService.saveEntry(old);
        return old;
    } */

    @PutMapping("id/{var}")
    public JournalEntry updateJournal(@PathVariable ObjectId var, @RequestBody JournalEntry newE) {
        // Find the existing journal entry by ID
        JournalEntry old = journalEntryService.findbyId(var).orElse(null);

        if (old != null) {
            // Update fields from newE to old, preserving the original date
            if (newE.getTitle() != null) {
                old.setTitle(newE.getTitle());
            }
            if (newE.getContent() != null) {
                old.setContent(newE.getContent());
            }
            // Preserve the old date if newE does not provide a new date


            // Save the updated entry
            journalEntryService.saveEntry(old);
        }

        return old;
    }

}
