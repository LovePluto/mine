package com.wyh.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoMain {

    public static void main(String[] args) throws Exception {
        Connection c = DB.getConnection();
        String sql = " select * from vip_ad where id=? ";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, "1");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            //TODO
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("url"));
        }
        System.out.print(rs.getRow());
    }
}
