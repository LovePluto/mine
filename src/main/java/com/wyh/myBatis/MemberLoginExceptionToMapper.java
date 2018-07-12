package com.wyh.myBatis;

import java.util.List;

public interface MemberLoginExceptionToMapper {
    List<MemberLoginExceptionTo> selectByType(MemberLoginExceptionCriteria criteria);

    List<String> selectAllCity();
}
