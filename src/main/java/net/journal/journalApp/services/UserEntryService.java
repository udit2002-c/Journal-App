package net.journal.journalApp.services;

import net.journal.journalApp.entity.JournalEntry;
import net.journal.journalApp.repository.JournalEntryRepository;
import net.journal.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntryService {

    @Autowired
    private UserRepository UserRepository;

    public void saveEntry(User journalEntry) {
        UserRepository.save(journalEntry);
    }

    public Optional<JournalEntry> findById(ObjectId id) {
        return journalEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id) {
        journalEntryRepository.deleteById(id);
    }

    public List<JournalEntry> findAll() {
        return journalEntryRepository.findAll();
    }
}
//V-14 : 10:10s