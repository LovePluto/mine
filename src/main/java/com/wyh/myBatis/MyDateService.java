package com.wyh.myBatis;

import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class MyDateService {
    public static void main(String[] args) throws Exception {
//        getAll();
//        selectAll();
        insertDate();
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(System.currentTimeMillis() + ""));
    }

    public static void getAll() {
        SqlSession session = DBTools.getSession();
        MyDateMapper mapper = session.getMapper(MyDateMapper.class);
        System.out.println(mapper.updateAll(new Date()));
        session.commit();
    }

    public static void selectAll() {
        SqlSession session = DBTools.getSession();
        MyDateMapper mapper = session.getMapper(MyDateMapper.class);
        List<MyDate> list = mapper.selectAll();
        for (MyDate myDate : list) {
            System.out.println(myDate.toString());
        }

    }

    public static void insertDate() throws Exception {
        SqlSession session = DBTools.getSession();
        MyDateMapper mapper = session.getMapper(MyDateMapper.class);
        MyDate myDate = new MyDate();
        myDate.setName("555");
        Date date = new Date();
        myDate.setStartTime(date);
        System.out.println(mapper.insertDate(myDate));
        session.commit();

    }
}
