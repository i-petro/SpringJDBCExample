package database;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Peter on 05.01.2016.
 */
public class DAOBase {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
