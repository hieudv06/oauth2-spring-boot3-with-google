package com.hieudv.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hieudv.identityservice.dto.request.RoleRequest;
import com.hieudv.identityservice.dto.response.RoleResponse;
import com.hieudv.identityservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
