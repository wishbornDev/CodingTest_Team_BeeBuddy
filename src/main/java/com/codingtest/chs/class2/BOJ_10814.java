package main.java.com.codingtest.chs.class2;

import java.util.*;
import java.io.*;

public class BOJ_10814 {
    static class User {
        int age;
        String name;

        User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<User> users = new ArrayList<>();

        while (length-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            users.add(new User(age, name));
        }

        users.sort((a, b) -> a.age - b.age);

        for (User user : users) {
            sb.append(user.age).append(" ").append(user.name).append("\n");
        }

        System.out.println(sb);
    }
}
