package xyz.becvar.discord.botbase.utils;

import xyz.becvar.discord.botbase.config.ConfigManager;

import java.sql.*;

/*
 * The mysql utils
 * Functions: connect to database, save logs
 */

public class MysqlUtils {

    // create connect with mysql database
    public static Connection getConnection(String dbName){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + ConfigManager.instance.getMysqlServerIP() + "/" + dbName + "?" + "user=" + ConfigManager.instance.getMysqlUsername() + "&password=" + ConfigManager.instance.getMysqlPassword() + "&characterEncoding=UTF-8");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    //The methode for send mysql query
    public static void sendQuery(String query) {
        PreparedStatement ps;
        try {
            ps = getConnection(ConfigManager.instance.getMysqlDatabaseName()).prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }






    //Function for save msg log to database
    public static void logMSG(String sender, String channel, String msg) {
        sendQuery("INSERT INTO msg_log(sender, channel, msg, time) VALUES ('" + sender + "', '" + channel + "', '" + msg + "', '" + TimeUtils.getTime() + "')");
    }


    //Function for save system log to database
    public static void logSystem(String name, String value) {
        sendQuery("INSERT INTO system_log(name, value, time) VALUES ('" + name + "', '" + value + "', '" + TimeUtils.getTime() + "')");
    }
}
