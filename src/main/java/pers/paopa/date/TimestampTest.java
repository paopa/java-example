package pers.paopa.date;

import java.sql.Timestamp;

public class TimestampTest {
    public static void main(String[] args) {
        System.out.println(new Timestamp(new java.util.Date().getTime()));
    }
}