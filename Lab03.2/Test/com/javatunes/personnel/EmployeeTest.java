package com.javatunes.personnel;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
private Employee emp1;
private Employee emp2;


    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Starsky", Date.valueOf("2000-01-01"));
        emp2 = new SalariedEmployee("Starsky", Date.valueOf("2000-01-01"));
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate() {
        emp2.setName("Lucy");
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2000-02-02"));

        assertNotEquals(emp1, emp2);
        assertFalse(emp1.equals(emp2));
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
       assertEquals(emp1, emp1);
       assertTrue(emp1.equals(emp1)); //alternative assertion
    }
}