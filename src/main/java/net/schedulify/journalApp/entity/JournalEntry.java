//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.schedulify.journalApp.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import net.schedulify.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")
public class JournalEntry {
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;



    public JournalEntry() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public ObjectId getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }


  /*  @Autowired
    private JournalEntryRepository journalEntryRepository;
    public void saveEntry() {
        JournalEntry entry = new JournalEntry();
        entry.setTitle("Test Title");
        entry.setContent("Test Content");
        entry.setDate(LocalDateTime.now());
        journalEntryRepository.save(entry);
    } */





}
