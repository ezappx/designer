package com.ezappx.designer.project.repositories;

import com.ezappx.designer.mobileproject.models.MobileProject;
import com.ezappx.designer.mobileproject.repositories.MobileProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MobileProjectRepositoryTest {

    @Autowired
    MobileProjectRepository repository;

    @Test
    public void InsertEntity() {
        MobileProject mobileProject = new MobileProject();
        mobileProject.setUsername("test-user");
        mobileProject.setProjectName("test-project");
        mobileProject.setPackageName("test.package");
        mobileProject.setCordovaPlugins(Arrays.asList(1L));
        mobileProject.setBinaryFiles(Arrays.asList(11L, 12L));
        mobileProject.setVersion("0.0.1");
        mobileProject.setMobileOS("android");
        mobileProject.setCreatedAt(LocalDateTime.now());
        mobileProject.setUpdatedAt(LocalDateTime.now());

        repository.save(mobileProject);

        MobileProject mobileProject2 = new MobileProject();
        mobileProject2.setUsername("test-user");
        mobileProject2.setProjectName("test-project2");
        mobileProject2.setPackageName("test.package2");
        mobileProject2.setCordovaPlugins(Arrays.asList(2L));
        mobileProject2.setBinaryFiles(Arrays.asList(21L, 22L));
        mobileProject2.setVersion("0.0.1");
        mobileProject2.setMobileOS("ios");
        mobileProject2.setCreatedAt(LocalDateTime.now());
        mobileProject2.setUpdatedAt(LocalDateTime.now());

        repository.save(mobileProject2);
    }

}