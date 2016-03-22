package org.example.behavioral.ChainOfResponsibility;

/**
 * Created by Roledene on 3/23/2016.
 */
public abstract class Handler {
    Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
