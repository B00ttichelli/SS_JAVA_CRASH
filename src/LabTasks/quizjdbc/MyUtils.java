package LabTasks.quizjdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyUtils {
    private Connection connection;
    private Statement statement;
    private String schemaName;

    public Connection createConnection() throws SQLException {
        DriverManager.registerDriver(new org.h2.Driver()); // dont forget to import h2 driver to library
        connection = DriverManager.getConnection("jdbc:h2:mem:test", "", "");
        return connection;
    }
    public void closeConnection() throws SQLException {
        // code
        connection.close();
    }
    public Statement createStatement() throws SQLException {
        this.statement = connection.createStatement();
        return statement;
    }
    public void closeStatement() throws SQLException {
        statement.close();
    }
    public void createSchema(String schemaName) throws SQLException {
        // code
        this.schemaName = schemaName;
        statement.executeUpdate("CREATE SCHEMA IF NOT EXISTS "+schemaName.toUpperCase(Locale.ROOT));


    }
    public void dropSchema() throws SQLException {
        // code
        statement.executeUpdate("DROP SCHEMA "+schemaName.toUpperCase(Locale.ROOT));
    }
    public void useSchema() throws SQLException {
        // code
        statement.execute("SET SCHEMA "+schemaName.toUpperCase(Locale.ROOT));
    }
    public void createTableRoles() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Roles (id int auto_increment primary key,roleName varchar(100) )");
    }
    public void createTableDirections() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Directions (id int auto_increment primary key ,directionName varchar(100))");
    }
    public void createTableProjects() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Projects(id int auto_increment primary key ,projectName varchar(100),directionId int,FOREIGN KEY (directionId) references  Directions(id))");
    }
    public void createTableEmployee() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Employee(id int auto_increment primary key ,firtsName varchar(100),roleID int,projectId int,FOREIGN KEY (roleID) references Roles(id),foreign key (projectId) REFERENCES Projects(id))");
    }
    public void dropTable(String tableName) throws SQLException {
        // code
        statement.execute("DROP TABLE " +tableName.toUpperCase(Locale.ROOT));
    }
    public void insertTableRoles(String roleName) throws SQLException {
        // code
        statement.executeUpdate("INSERT INTO Roles(roleName)value ("+roleName+")");

    }
    public void insertTableDirections(String directionName) throws SQLException {

        statement.executeUpdate("insert into Directions(directionName) value ("+directionName+")");
        // code
    }
    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        // code



    }
    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        // code
    }
    public int getRoleId(String roleName) throws SQLException {
        // code
       return 0;
    }
    public int getDirectionId(String directionName) throws SQLException {
        // code
        return 0;
    }
    public int getProjectId(String projectName) throws SQLException {
        // code
        return 0;
    }
    public int getEmployeeId(String firstName) throws SQLException {
        // code
        return 0
    }
    public List<String> getAllRoles() throws SQLException {
        // code
        return null;
    }
    public List<String> getAllDirestion() throws SQLException {
        // code
        return null;
    }
    public List<String> getAllProjects() throws SQLException {
        // code
        return null;
    }
    public List<String> getAllEmployee() throws SQLException {
        // code
        return null;
    }
    public List<String> getAllDevelopers() throws SQLException {
        // code
        return null;
    }
    public List<String> getAllJavaProjects() throws SQLException {
        // code
        return null;
    }
    public List<String> getAllJavaDevelopers() throws SQLException {
        // code
        return null;
    }

}

