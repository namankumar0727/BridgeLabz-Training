package com.chatlogparser;

import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {

    private static final List<String> IDLE_KEYWORDS =
            List.of("lol", "brb", "haha", "ok", "cool");

    @Override
    public boolean allow(String message) {
        String lower = message.toLowerCase();
        for (String word : IDLE_KEYWORDS) {
            if (lower.contains(word)) {
                return false; // filter out idle chat
            }
        }
        return true;
    }
}
