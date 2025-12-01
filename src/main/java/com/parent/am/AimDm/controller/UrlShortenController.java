package com.parent.am.AimDm.controller;

import com.parent.am.AimDm.dto.UrlShortRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UrlShortenController {

    @PostMapping("/addUrl")
    public String urlShorten(@RequestBody UrlShortRequest request){
        return "";
    }
}
