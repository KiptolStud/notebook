package view;

import controller.Controller;

public abstract class view<T> {
    protected Controller<T> controller;

    public abstract void run();
}
