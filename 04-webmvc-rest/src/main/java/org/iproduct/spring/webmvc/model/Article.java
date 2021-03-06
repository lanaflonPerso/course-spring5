package org.iproduct.spring.webmvc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Document(collection="articles")
@Data
@Builder
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    private String id;
    @NonNull
    private String title;
    @NonNull
    private String content;
    @Builder.Default
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "uuuu-MM-dd HH:mm:ss")
    private LocalDateTime created = LocalDateTime.now();
}