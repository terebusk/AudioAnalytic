package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
public class DemoServiceTest {

    @InjectMocks
    DemoService service;

    @Test
    public void whenInputIsNull_ShouldReturnEmptyList() {
        List<String> output = service.getResponseList(null, null);
        assertThat(0, is(output.size()));
    }

    @Test
    public void whenInputIsPresent_ReturnedListShouldBeOfSpecifiedSize() {
        int size = 10;
        List<String> output = service.getResponseList("Test", size);
        assertThat(output.size(), is(size));
    }

    @Test
    public void whenRepeatNumberIsNegative_ShouldReturnEmptyList() {
        int size = -100;
        List<String> output = service.getResponseList("Test", size);
        assertThat(output.size(), is(0));
    }

    @Test
    public void whenRepeatNumberIsZero_ShouldReturnEmptyList() {
        int size = -100;
        List<String> output = service.getResponseList("Test", size);
        assertThat(output.size(), is(0));
    }
}