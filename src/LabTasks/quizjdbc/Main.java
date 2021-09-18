package LabTasks.quizjdbc;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        MyUtils myUtils = new MyUtils();
        myUtils.createConnection();
        myUtils.createStatement();
        myUtils.createSchema("test");
        myUtils.useSchema();
        /*myUtils.createTableRoles();

        myUtils.createTableDirections();
        myUtils.createTableProjects();
        myUtils.createTableEmployee();*/
        /*myUtils.insertTableRoles("DevOps2");*/
        /*System.out.println(myUtils.getRoleId("coder"));*/
       /* myUtils.insertTableProjects("Sun","Java");*/



    }
}
