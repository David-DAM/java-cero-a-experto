package com.davinchicoder.dates;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateServiceTest {

    private DateService dateService;
    
    @BeforeEach
    void setUp() {
        System.out.println("Running test");
        dateService = new DateService();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Ending test");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Running before all tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Running after all tests");
    }

    @Test
    void getDateCorrectly() {
        Date currentDate = dateService.getCurrentDate();

        assertNotNull(currentDate);
    }

    @Test
    void getDateParsedCorrectly() {
        LocalDate dateParsed = dateService.getDateParsed("2021-01-01", "yyyy-MM-dd");
        assertNotNull(dateParsed);
        assertEquals(1, dateParsed.getDayOfMonth());
    }

    @Test
    void getDateParsedNotThrowException() {
        assertDoesNotThrow(() -> dateService.getDateParsed("2021-01-01", "yyyy-MM-dd"));

    }

    @Test
    void getDateParsedThrowException() {
        assertThrows(DateTimeParseException.class, () -> dateService.getDateParsed("2021-01-01", "yyy-MM-dd-"));
    }
}