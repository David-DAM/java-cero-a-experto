package com.davinchicoder.options.strategies;

import com.davinchicoder.options.OptionInterface;
import com.davinchicoder.options.OptionType;

import java.util.Scanner;

public class ExitStrategy implements OptionInterface {
    @Override
    public String getMessage() {
        return getOptionType().getValue().toString().concat(": Exit");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("Exiting");
    }

    @Override
    public OptionType getOptionType() {
        return OptionType.EXIT;
    }
}
