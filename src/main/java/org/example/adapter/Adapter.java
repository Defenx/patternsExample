package org.example.adapter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class Adapter implements MessageSender {
    Messenger messenger;

    @Override
    public void send() {
        messenger.sendRequest();
    }
}
