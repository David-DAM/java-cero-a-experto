package com.davinchicoder;

import com.davinchicoder.options.OptionInterface;
import com.davinchicoder.options.OptionType;
import com.davinchicoder.options.strategies.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {

    public static final String FILE_PATH = "src/main/resources/posts.json";

    public static void main(String[] args) {

        List<OptionInterface> strategyOptions = List.of(new AddPostStrategy(), new DeletePostStrategy(), new UpdatePostStrategy(), new GetAllPostStrategy(), new ExitStrategy());


        Map<OptionType, OptionInterface> strategyOptionMap = strategyOptions.stream()
                .collect(Collectors.toMap(OptionInterface::getOptionType, Function.identity()));

        Scanner scanner = new Scanner(System.in);

        int option = 1;

        while (option != 0) {

            System.out.println("Choose an option:");
            strategyOptions.stream()
                    .sorted(Comparator.comparingInt(value -> value.getOptionType().getValue()))
                    .forEach(optionInterface -> System.out.println(optionInterface.getMessage()));

            option = scanner.nextInt();
            scanner.nextLine();

            OptionType optionType = OptionType.getOptionType(option);

            OptionInterface selectedOptionInterface = strategyOptionMap.get(optionType);

            if (selectedOptionInterface != null) {
                selectedOptionInterface.execute(scanner);
            }
        }

    }


}
