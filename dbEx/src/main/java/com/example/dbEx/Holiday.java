package com.example.dbEx;

public class Holiday {
   public String name;
 public    int id, day, month, length;

    public Holiday(String name, int id, int day, int month, int length) {
        this.name = name;
        this.id = id;
        this.day = day;
        this.month = month;
        this.length = length;
    }
    public Holiday(String name, int day, int month, int length) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", day=" + day +
                ", month=" + month +
                ", length=" + length +
                '}';
    }
    Holiday(){}
}
