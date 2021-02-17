package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to42then4() {
        int expected = 4;
        Point a = new Point(4, 2);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to74then2() {
        int expected = 4;
        Point a = new Point(7, 4);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to120then13() {
        int expected = 13;
        Point a = new Point(12, 0);
        Point b = new Point(0, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then1point73() {
        double expected = 1.73;
        Point a = new Point(1, 1, 1);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3m33to223then5point09() {
        double expected = 5.09;
        Point a = new Point(2, 2, 3);
        Point b = new Point(3, -3, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}