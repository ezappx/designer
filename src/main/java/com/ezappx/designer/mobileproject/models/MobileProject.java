package com.ezappx.designer.mobileproject.models;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Component
@Entity
@Table(name = "UserMobileProjects")
public class MobileProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String projectName;

    private String packageName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String mobileOS;

    private String version;

    @ElementCollection
    private List<Long> binaryFiles;

    @ElementCollection
    private List<Long> cordovaPlugins;
}
