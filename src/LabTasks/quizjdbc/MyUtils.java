package LabTasks.quizjdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyUtils {
    private Connection connection;
    private Statement statement;
    private String schemaName;
    private  static final String suckIt;

    static {
        suckIt = "'";
    }
    /*jdbc:h2:mem:test*/ // That is for test on SoftServe site
    public Connection createConnection() throws SQLException {
        DriverManager.registerDriver(new org.h2.Driver()); // dont forget to import h2 driver to library
        connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
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
        statement.executeUpdate("CREATE TABLE if not exists Roles (id int auto_increment not null primary key,roleName varchar(100) )");
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

        statement.executeUpdate("INSERT INTO ROLES (roleName) VALUES ('" + roleName + "')");
        /*statement.execute("INSERT INTO Roles(roleName)values ("+suckIt+roleName+suckIt+")");*/

    }
    public void insertTableDirections(String directionName) throws SQLException {

        statement.executeUpdate("INSERT INTO  DIRECTIONS (directionName) VALUES ('" + directionName + "')");
        // code
    }
    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        // code
        int  directionId = getDirectionId(directionName);
        statement.executeUpdate("INSERT INTO PROJECTS (projectName,directionId) VALUES ('"+projectName+"','"+directionId+"');");



    }
    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        // code
        int roleId = getRoleId(roleName);
        int projectId = getProjectId(projectName);
        statement.executeUpdate("INSERT INTO Employee (firstName,roleId,projectId) values ('"+firstName+"','"+roleId+"','"+projectId+"');");
    }
    public int getRoleId(String roleName) throws SQLException {
        // code
        int i = 0;
        ResultSet resultSet = statement.executeQuery("select id from Roles where roleName = '" + roleName + "';");
        if(resultSet.next()){
            i = Integer.parseInt(resultSet.getString(1));
        }
        resultSet.close();
        return i;
    }
    public int getDirectionId(String directionName) throws SQLException {
        int i = 0;
        ResultSet resultSet = statement.executeQuery("select id from Directions where directionName = '" +directionName + "';");
        if(resultSet.next()){
            i = Integer.parseInt(resultSet.getString(1));
        }
        resultSet.close();
        return i;
    }
    public int getProjectId(String projectName) throws SQLException {
        int i = 0;
        ResultSet resultSet = statement.executeQuery("select id from Projects where projectName = '" +projectName + "';");
        if (resultSet.next()) {
            i = Integer.parseInt(resultSet.getString(1));
        }
        resultSet.close();
        return i;
    }
    public int getEmployeeId(String firstName) throws SQLException {

        int i = 0;
        ResultSet resultSet = statement.executeQuery("select id from Employee where firstName = '" +firstName + "';");
        if(resultSet.next()){
            i = Integer.parseInt(resultSet.getString(1));
        }
        resultSet.close();
        return i;
    }
    public List<String> getAllRoles() throws SQLException {

        ResultSet resultSet = statement.executeQuery("select * from roles;");
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(2));
        }
        resultSet.close();
        return list;
    }
    public List<String> getAllDirestion() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from direction;");
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(2));
        }
        resultSet.close();
        return list;
    }
    public List<String> getAllProjects() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from projects;");
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(2));
        }
        resultSet.close();
        return list;
    }
    public List<String> getAllEmployee() throws SQLException {
        // code
        ResultSet resultSet = statement.executeQuery("select * from employee;");
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(2));
        }
        resultSet.close();
        return list;
    }
    public List<String> getAllDevelopers() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Employee where roleId =( select id from Roles where roleName ='Developer');");
        List<String>list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(2));
        }
        resultSet.close();
        return list;
    }
    public List<String> getAllJavaProjects() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Projects where directionID = (select id from Direction where directionName = 'Java');");
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(2));
        }
        return list;
    }
    public List<String> getAllJavaDevelopers() throws SQLException {
        List<String> list = new ArrayList<>();
        // code
       /* statement.executeQuery("select * from Employee where roleID=(select id from Roles where roleName ='Developer') and projectId ="+"");*/



        return list;
    }

}

