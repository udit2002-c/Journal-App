package net.journal.journalApp.repository;


import net.journal.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<JournalEntry, ObjectId> {

}
