package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private static ArrayList<Post> posts = new ArrayList<>();
    private static int idCounter = 0;

    static {
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Forest",
                "https://static.posters.cz/image/1300/fotografiaartystyczna/the-blue-forest-i59265.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));

    }


    public List<Post> getAll() {
        return posts;
    }

    public Post get(int id) {
        return posts.get(id);
    }
}
