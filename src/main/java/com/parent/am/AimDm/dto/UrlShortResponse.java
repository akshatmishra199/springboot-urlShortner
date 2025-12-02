package com.parent.am.AimDm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlShortResponse {
    private String shortUrl;
    private String code;
}
