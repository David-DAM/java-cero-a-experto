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
import java.util.stream.IntStream;

import static com.davinchicoder.App.FILE_PATH;

public class UpdatePostStrategy implements OptionInterface {

    private final ObjectMapper objectMapper;

    public UpdatePostStrategy() {
        objectMapper = new ObjectMapper();
    }

    @Override
    public String getMessage() {
        return getOptionType().getValue().toString().concat(": Update post");
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
            System.out.println("Which post do you want to update? ");

            IntStream.range(0, posts.size())
                    .forEach(i -> System.out.println(i + ": " + posts.get(i).getMessage()));

            int postId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Write your new post: ");
            String message = scanner.nextLine();

            Post post = posts.get(postId);
            post.setMessage(message);

            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, posts);
            System.out.println("Post updated");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.UPDATE_POST;
    }
}
