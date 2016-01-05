package database;

import database.Models.MyObject;

import java.util.List;

/**
 * Created by Peter on 04.01.2016.
 */
public class DAOImpl extends DAOBase implements DAO {

    public void add(String name) {
        getJdbcTemplate().update("INSERT INTO `table`(NAME) VALUES(?)", name);
    }

    public List<MyObject> get() {
        final String sql = "SELECT `table`.`name`,`table`.id FROM `table`";
        return getJdbcTemplate().query(sql, (resultSet, i) -> {
            return new MyObject(resultSet.getInt(2), resultSet.getString(1));
        });
    }
}
