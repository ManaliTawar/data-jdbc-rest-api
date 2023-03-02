package com.tawar.manali.contentcalendar.controller;

import com.tawar.manali.contentcalendar.config.ContentCalendarProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }
    @GetMapping("/")
    public ContentCalendarProperties home(){
        return properties;
    }
}
