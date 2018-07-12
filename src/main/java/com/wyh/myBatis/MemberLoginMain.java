package com.wyh.myBatis;

import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class MemberLoginMain {
    public static void main(String[] args) throws Exception {
        getAddress();
    }

    public static void getAddress() {
        SqlSession session = DBTools.getSession();
        MemberLoginExceptionToMapper mapper = session.getMapper(MemberLoginExceptionToMapper.class);
        MemberLoginExceptionCriteria criteria = new MemberLoginExceptionCriteria();
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        criteria.setMids(list);
//        criteria.setAddress("成都市");
        List<MemberLoginExceptionTo> result = mapper.selectByType(criteria);
        System.out.println(result.size());
        System.out.println(result.toString());
    }

}
