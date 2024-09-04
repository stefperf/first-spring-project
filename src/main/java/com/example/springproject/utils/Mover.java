package com.example.springproject.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mover {
    public final Movable movable;

    public Mover(final Movable movable) {
        this.movable = movable;
    }

    public void circleClockwise(final int nSteps) {
        this.movable.move(Direction.UP, nSteps);
        this.movable.move(Direction.RIGHT, nSteps);
        this.movable.move(Direction.DOWN, nSteps);
        this.movable.move(Direction.LEFT, nSteps);
    }

    public void circleCounterclockwise(final int nSteps) {
        this.movable.move(Direction.UP, nSteps);
        this.movable.move(Direction.LEFT, nSteps);
        this.movable.move(Direction.DOWN, nSteps);
        this.movable.move(Direction.RIGHT, nSteps);
    }
}
