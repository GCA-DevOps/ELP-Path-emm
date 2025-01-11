package com.example.emtechelppathbackend.events.eventsv2;

import com.example.emtechelppathbackend.chapter.ChapterDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
@Data
public class EventsDTOViewv2 {
    private String eventName;
    private String eventDescription;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventDate;
    private String eventLink;
    private String location;
    private String organizer;
    private Set<String> eventImages = new HashSet<>();
    private ChapterDto chapter;
}
