package com.wyh.myBatis;

import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class MyDateService {
    public static void main(String[] args) {
//        getAll();
//        selectAll();
        insertDate();
    }

    public static void getAll() {
        SqlSession session = DBTools.getSession();
        MyDateMapper mapper = session.getMapper(MyDateMapper.class);
        System.out.println(mapper.updateAll(new Date()));
    }

    public static void selectAll() {
        SqlSession session = DBTools.getSession();
        MyDateMapper mapper = session.getMapper(MyDateMapper.class);
        List<MyDate> list = mapper.selectAll();
        for (MyDate myDate : list) {
            System.out.println(myDate.toString());
        }
    }

    public static void insertDate() {
        SqlSession session = DBTools.getSession();
        MyDateMapper mapper = session.getMapper(MyDateMapper.class);
        MyDate myDate = new MyDate();
        myDate.setName("555");
//        myDate.setId(5);
        myDate.setStartTime(new Date());
        System.out.println(mapper.insertDate(myDate));
        session.commit();

    }
}
