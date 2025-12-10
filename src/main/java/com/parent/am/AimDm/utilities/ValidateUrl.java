package com.parent.am.AimDm.utilities;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class ValidateUrl {

    public boolean validateUrl(String url) throws Exception {
        try {
            URI uri = new URI(url);
            if (uri.getScheme() == null) {
                throw new BadRequestException("missing http/https");
            }
        } catch (Exception e) {
            throw new BadRequestException("Invalid uri syntax");
        }
        return true;
    }
}
