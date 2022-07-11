package com.example.multiple.registration.Controller;

import com.example.multiple.registration.entity.Student;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The type Test controller student.
 */
class TestControllerStudent {

    /**
     * The Student controller.
     */
    @InjectMocks
StudentController studentController;


    /**
     * The Student.
     */
    @Mock
    Student student;
private final String id = "1234";
    private MockMvc mockMvc;


    /**
     * Sets up.
     */
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
    }


    /**
     * Context loads.
     */
    @Test
    void contextLoads(){

    }
}


