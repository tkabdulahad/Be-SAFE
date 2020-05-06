package com.example.besafe;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDao {

    @Query("SELECT * FROM Contact")
    List<Contact> getAllContacts();

    @Query("SELECT mobileNumber FROM contact")
    List<String> getAllContactsNumber();

    @Query("SELECT * FROM Contact WHERE id = :id")
    Contact getContactById(int id);

    @Insert
    void insertContact(Contact contact);

    @Delete
    void Delete(Contact contact);

}
