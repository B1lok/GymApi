package com.example.gymapi.web.mapper;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.gymapi.web.dto.auth.AuthResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthMapper {
    AuthResponse toAuthResponse(DecodedJWT decodedJWT);
}
