package com.habbiadhi.mapstruct;

import com.habbiadhi.mapstruct.service.impl.FakerPersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = MapstructApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "file:./config/application-integrationtest.properties")
public class MapstructApplicationTests {

    @Autowired
    private MockMvc mvc;

    private FakerPersonServiceImpl faker = new FakerPersonServiceImpl();

    @Test
    void whenCallingSayHello_thenReturnHello() throws ParseException, ParseException {
        assertTrue("popo".equals(faker.getConstantPersonDto().getName()));
    }

    @Test
    public void givenEmployees_whenGetEmployees_thenStatus200()
            throws Exception {

//        createTestEmployee("bob");

//        mvc.perform(get("/api/employees")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content()
//                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$[0].name", is("bob")));
    }
}
