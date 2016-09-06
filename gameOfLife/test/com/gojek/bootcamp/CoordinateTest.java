package com.gojek.bootcamp;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoordinateTest {
    @Test
    public void expectNeighbourPoints() throws Exception {
        Coordinate point = new Coordinate(2,2);
        Set<Coordinate> points = new HashSet<>();
        points.add(new Coordinate(1,1));
        points.add(new Coordinate(1,2));
        points.add(new Coordinate(1,3));
        points.add(new Coordinate(2,1));
        points.add(new Coordinate(2,3));
        points.add(new Coordinate(3,1));
        points.add(new Coordinate(3,2));
        points.add(new Coordinate(3,3));
        Assert.assertEquals(point.neighbourPoints(),points);
    }
}
