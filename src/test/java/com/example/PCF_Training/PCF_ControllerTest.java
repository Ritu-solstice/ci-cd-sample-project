package com.example.PCF_Training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PCF_Controller.class)
public class PCF_ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void default_success() throws Exception {
        // When no content is passed, it means request body is null
        mvc.perform(get("/")).andExpect(status().isOk());
    }

    @Test
    public void getName_success() throws Exception {
        // When no content is passed, it means request body is null
        mvc.perform(get("/name")).andExpect(status().isOk());
    }

}