package com.davinchicoder.options.strategies;

import com.davinchicoder.options.OptionInterface;
import com.davinchicoder.options.OptionType;
import com.davinchicoder.options.Post;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.davinchicoder.App.FILE_PATH;

public class GetAllPostStrategy implements OptionInterface {

    private final ObjectMapper objectMapper;

    public GetAllPostStrategy() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public String getMessage() {
        return getOptionType().getValue().toString().concat(": Get all posts");
    }

    @Override
    public void execute(Scanner scanner) {
        File file = new File(FILE_PATH);
        List<Post> posts;

        try {
            if (file.exists()) {

                posts = objectMapper.readValue(file, new TypeReference<>() {
                });

            } else {
                posts = new ArrayList<>();
            }
            System.out.println("List of post: ");

            posts.stream().map(Post::getMessage).map("- "::concat).forEach(System.out::println);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.GET_POSTS;
    }
}
