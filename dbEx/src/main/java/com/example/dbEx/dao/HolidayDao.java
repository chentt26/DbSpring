package com.example.dbEx.dao;

import com.example.dbEx.Holiday;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HolidayDao {

    Connection connection=Connections.getConnection();
Statement statement=Connections.getStatement();

public void addHoliday(Holiday holiday){
    try {
        statement.executeUpdate("INSERT INTO holydayss (Name,day,month,length) " +
                "VALUES " +
                "(\'" + holiday.name + "\'," + holiday.day + "," + holiday.month + "," +holiday.length+")");
    } catch (SQLException e) {
        e.printStackTrace();
    }

}

public void removeHoliday(int id){
    try {
        statement.executeUpdate("DELETE from holydayss WHERE id = " + id);
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

public void updateHoliday(Holiday holiday){
        try {
            statement.executeUpdate("UPDATE holydayss SET Name= \'" + holiday.name + "\' , day=" + holiday.day +
                    ",month=" + holiday.month + ",length=" + holiday.length + " WHERE id =" + holiday.id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Holiday get(int id){
        Holiday holiday= null;
        try {
            var result = statement.executeQuery
                    ("SELECT * FROM holydayss WHERE id=" + id);
            result.next();
            holiday = new Holiday( result.getString("Name")

                    , result.getInt("id")
                    , result.getInt("day")
                    , result.getInt("month")
                    , result.getInt("length")
            );


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return holiday;
    }

    public List<Holiday>getAll(){
        Holiday holiday= null;
        List<Holiday> holydays = new ArrayList<>();
        try {
            var result = statement.executeQuery
                    ("SELECT * FROM holydayss");
            while (result.next()) {
                holiday = new Holiday( result.getString("Name")

                        , result.getInt("id")
                        , result.getInt("day")
                        , result.getInt("month")
                        , result.getInt("length")
                );
                holydays.add(holiday);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return holydays;
    }
}
