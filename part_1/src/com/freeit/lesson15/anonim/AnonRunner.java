package com.freeit.lesson15.anonim;

import com.freeit.lesson15.comparations.User;

import java.util.*;

public class AnonRunner {
    public static void main(String[] args) {

        final Random rand = new Random();

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 131; i++) {
            String uuid = UUID.randomUUID().toString();
            User user = new User(uuid.toCharArray()[rand.nextInt(uuid.length())]
                    + "_user"
                    + uuid.substring(0, rand.nextInt(uuid.length())));
            users.add(user);
            System.out.println(user);
        }

        Comparator<User> userComparator = new UserComparator();
        Comparator<User> userComparator1 = new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return user.getName().length() - t1.getName().length();
            }
        };

//        Comparator<User> userComparator2 = (user1, user2) -> {
//            int lengthComparision = user1.getName().length() - user2.getName().length();
//            if(lengthComparision == 0) {
//                return user1.getName().compareTo(user2.getName());
////                char user1FC = user1.getName().toCharArray()[0];
////                char user2FC = user2.getName().toCharArray()[0];
////                return user1FC - user2FC;
//            }
//            return lengthComparision;
//        };

        Collections.sort(users, userComparator1);
        System.out.println("**********************************");

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    private static class UserComparator implements Comparator<User> {
        @Override
        public int compare(User user, User t1) {
            return user.getName().length() - t1.getName().length();
        }
    }
}
