package com.miss.zuichu.mapper;

import com.miss.zuichu.entity.sysPermission;

public interface sysPermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(sysPermission record);

    int insertSelective(sysPermission record);

    sysPermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(sysPermission record);

    int updateByPrimaryKey(sysPermission record);
}