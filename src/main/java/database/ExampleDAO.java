package database;

import database.Models.MyObject;

import java.util.List;

/**
 * Created by Peter on 04.01.2016.
 */
public interface ExampleDAO {
    void add(String name);
    List<MyObject> get();
}
