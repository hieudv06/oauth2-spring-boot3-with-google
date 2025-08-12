package com.hieudv.identityservice.repository.httpclient;


import com.hieudv.identityservice.dto.request.ExchangeTokenRequest;
import com.hieudv.identityservice.dto.response.ExchangeTokenResponse;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="outbound-identity",url="https://oauth2.googleapis.com")
public interface OutboundIdentityClient {
    //https://developers.google.com/identity/protocols/oauth2/web-server
    @PostMapping(value = "/token",produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ExchangeTokenResponse exchangeToken(@QueryMap ExchangeTokenRequest request);
}
