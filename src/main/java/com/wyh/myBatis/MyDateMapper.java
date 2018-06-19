package com.wyh.myBatis;

import java.util.Date;
import java.util.List;

public interface MyDateMapper {

    int updateAll(Date currentTime);

    List<MyDate> selectAll();

    int insertDate(MyDate myDate);
}
