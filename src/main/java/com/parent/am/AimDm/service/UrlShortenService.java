package com.parent.am.AimDm.service;

import com.parent.am.AimDm.dto.UrlShortRequest;
import com.parent.am.AimDm.dto.UrlShortResponse;
import com.parent.am.AimDm.utilities.ShortCodeGenerator;
import com.parent.am.AimDm.utilities.ValidateUrl;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class UrlShortenService {

    private ShortCodeGenerator generator;
    private ValidateUrl validate;

    public UrlShortenService(ValidateUrl validate){
        this.validate=validate;

    }




    public UrlShortResponse shorten(UrlShortRequest request) throws Exception {
        if (request.getLongUrl() == null || request.getLongUrl().isBlank()) {
            throw new BadRequestException("url is null or empty");
        }
        validate.validateUrl(request.getLongUrl());

        String code;
        int maxAttempts = 5;
        code = null;
//        for (int i = 0; i < maxAttempts; i++) {
//            String candidate = Gen.generate();
//            if (!repository.existsByShortCode(candidate)) {
//                code = candidate;
//                break;
//            }
//        }
//        if (code == null) {
//            throw new BadRequestException("failed to generate unique short code");
//        }


        return new UrlShortResponse();
    }


}
