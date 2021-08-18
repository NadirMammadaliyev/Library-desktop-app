/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.nadir.library.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Asus
 */
public class DBHelper {

    public static Connection getConnection() throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("config.properties"));
        Connection c = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
        return c;
    }

}
