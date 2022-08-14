package org.example.mediator;

public class ChatUser extends User {

    public ChatUser(ChatRoomIfc room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(getName() + " :: Received Message : " + msg);
    }

}
