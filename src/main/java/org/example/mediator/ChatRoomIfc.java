package org.example.mediator;

public interface ChatRoomIfc {
    void sendMessage(String msg, String userId);

    void addUser(User user);
}
