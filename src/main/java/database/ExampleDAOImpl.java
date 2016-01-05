package database;

import database.Models.MyObject;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by Peter on 04.01.2016.
 */
public class ExampleDAOImpl implements ExampleDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(String name) {
        jdbcTemplate.update("INSERT INTO `table`(NAME) VALUES(?)", name);
    }

    public List<MyObject> get() {
        final String sql = "SELECT `table`.`name`,`table`.id FROM `table`";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            return new MyObject(resultSet.getInt(2), resultSet.getString(1));
        });
    }
}
