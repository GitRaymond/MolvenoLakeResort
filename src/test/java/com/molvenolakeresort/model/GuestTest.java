package com.molvenolakeresort.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.time.LocalDate;

public class GuestTest {

    private Guest guest;

    @Before
    public void setUp() {
        this.guest = new Guest("John");
    }

    @Test
    public void testSetAndGetForName() {

        this.guest.setName("Raymond");

        String actual = this.guest.getName();

        Assert.assertEquals("Raymond", actual);

    }

    @Test
    public void testSetAndGetForDateOfBirth() {
        this.guest.setDateOfBirth(1987, 9, 29);

        LocalDate actual = this.guest.getDateOfBirth();
        LocalDate l = LocalDate.of(1987,9,29);
        Assert.assertEquals(l, actual);
    }

    @Test
    public void testSetAndGetForId() {
        this.guest.setId(2);

        long actual = this.guest.getId();

        Assert.assertEquals(2, actual);
    }
}
