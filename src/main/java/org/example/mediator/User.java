package org.example.mediator;

public abstract class User
{
    private ChatRoomIfc mediator;
    private String id;
    private String name;

    public User(ChatRoomIfc room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public ChatRoomIfc getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
