//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.schedulify.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.schedulify.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/journal"})
public class JournalEntryController {
   /*
    private Map<Long, JournalEntry> journalEntries = new HashMap();

    public JournalEntryController() {
    }

    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList(this.journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        this.journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping({"id/{var}"})
    public JournalEntry getJournalEntryById(@PathVariable Long var) {
        return (JournalEntry)this.journalEntries.get(var);
    }

    @DeleteMapping({"id/{var}"})
    public boolean deleteEntryById(@PathVariable Long var) {
        return this.journalEntries.remove(var) != null;
    }

    @PutMapping({"id/{var}"})
    public JournalEntry updateJournal(@PathVariable Long var, @RequestBody JournalEntry myEntry) {
        return (JournalEntry)this.journalEntries.put(var, myEntry);
    }
    Comment
    */
}
