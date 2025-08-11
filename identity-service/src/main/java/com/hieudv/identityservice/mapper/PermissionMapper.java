package com.hieudv.identityservice.mapper;

import org.mapstruct.Mapper;

import com.hieudv.identityservice.dto.request.PermissionRequest;
import com.hieudv.identityservice.dto.response.PermissionResponse;
import com.hieudv.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
