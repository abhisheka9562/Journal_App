package net.schedulify.journalApp.service;

import net.schedulify.journalApp.entity.JournalEntry;
import net.schedulify.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntityService
{
    @Autowired
    private JournalEntryRepository journalEntryRepository;
    public void saveEntry(JournalEntry journalEntry)
    {
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll()
    {
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findbyId(ObjectId var)
    {
       return journalEntryRepository.findById(var);
    }

    public void deletebyID(ObjectId var)
    {
        journalEntryRepository.deleteById(var);
    }
    public void deleteAll()
    {
        journalEntryRepository.deleteAll();
    }
}
