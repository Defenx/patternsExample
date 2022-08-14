package org.example.observer;

public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject sub);
}
