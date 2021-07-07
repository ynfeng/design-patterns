package com.github.ynfeng.designpatterns.iterator;

public class Application {

    public static void main(String[] args) {
        WeChat weChat = new WeChat();
        weChat.addFriend(new Profile("1", "a@xx.com"));
        weChat.addFriend(new Profile("2", "b@xx.com"));
        weChat.addCoworker(new Profile("3", "c@xx.com"));
        weChat.addCoworker(new Profile("5", "d@xx.com"));

        SocialSpammer spammer = new SocialSpammer();
        spammer.send(weChat.createCowokersIterator("100"), "给同事的信息");
        spammer.send(weChat.createFriendsIterator("100"), "给朋友的信息");
    }
}
