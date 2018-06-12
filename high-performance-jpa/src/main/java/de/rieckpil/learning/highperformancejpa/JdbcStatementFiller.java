package de.rieckpil.learning.highperformancejpa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcStatementFiller implements CommandLineRunner {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public void run(String... args) throws Exception {

    runPreparedStatement();
    insertMultiplePersons();

    PreparedStatement preparedSelect = jdbcTemplate.getDataSource().getConnection().prepareStatement("SELECT * FROM person");
    preparedSelect.setFetchSize(5);
    preparedSelect.setMaxRows(10);

    ResultSet executeQuery = preparedSelect.executeQuery();

    System.out.println("Amount of columns: " + executeQuery.getMetaData().getColumnCount());

    while (executeQuery.next()) {
      System.out.println(executeQuery.getString("name"));
    }

  }

  private void runPreparedStatement() throws SQLException {

    PreparedStatement preparedStatement = jdbcTemplate.getDataSource().getConnection().prepareStatement("INSERT INTO person (name) VALUES (?)");
    preparedStatement.setString(1, "Paul");

    boolean isFirstResultAResultSet = preparedStatement.execute();

    System.out.println("isFirstResultAResultSet = " + isFirstResultAResultSet);
  }

  private void insertMultiplePersons() throws Exception {

    jdbcTemplate.getDataSource().getConnection().createStatement().execute("INSERT INTO person (name) VALUES ('" + ThreadLocalRandom.current().nextInt() + "')");
    jdbcTemplate.getDataSource().getConnection().createStatement().execute("INSERT INTO person (name) VALUES ('" + ThreadLocalRandom.current().nextInt() + "')");
    jdbcTemplate.getDataSource().getConnection().createStatement().execute("INSERT INTO person (name) VALUES ('" + ThreadLocalRandom.current().nextInt() + "')");
    jdbcTemplate.getDataSource().getConnection().createStatement().execute("INSERT INTO person (name) VALUES ('" + ThreadLocalRandom.current().nextInt() + "')");
    jdbcTemplate.getDataSource().getConnection().createStatement().execute("INSERT INTO person (name) VALUES ('" + ThreadLocalRandom.current().nextInt() + "')");
    jdbcTemplate.getDataSource().getConnection().createStatement().execute("INSERT INTO person (name) VALUES ('" + ThreadLocalRandom.current().nextInt() + "')");

  }
}
