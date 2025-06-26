package com.davinchicoder.files;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Stream;

public class FileService {

    public static final String RESOURCES = "src/main/resources";
    public static final String FILE_PATH = "src/main/resources/data.txt";
    public static final String OUTPUT_FILE_PATH = "src/main/resources/data.encrypted";
    public static final String AES = "AES";
    public static final String KEY = "0123456789123456";

    public void readAllLines() throws IOException {

        Files.readAllLines(Path.of(FILE_PATH)).forEach(System.out::println);
    }

    public void writeAllLines(List<String> lines) throws IOException {
        Files.write(Path.of(FILE_PATH), lines, StandardOpenOption.APPEND);
    }

    public void listFiles() {
        try (Stream<Path> pathStream = Files.list(Path.of(RESOURCES))) {
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readAllLinesWithBuffer() throws IOException {

        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(FILE_PATH))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void writeAllLinesWithBuffer(List<String> lines) throws IOException {

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(FILE_PATH), StandardOpenOption.APPEND)) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
    }

    public void deleteFile() throws IOException {
        Files.delete(Path.of(FILE_PATH));
    }

    public void encrypt() {
        process(Cipher.ENCRYPT_MODE, FILE_PATH, OUTPUT_FILE_PATH);
    }

    public void decrypt() {
        process(Cipher.DECRYPT_MODE, OUTPUT_FILE_PATH, FILE_PATH);
    }

    private void process(int mode, String inputFile, String outputFile) {
        try {
            Key key = new SecretKeySpec(KEY.getBytes(), AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(mode, key);

            byte[] inputBytes = Files.readAllBytes(Path.of(inputFile));

            byte[] outputBytes = cipher.doFinal(inputBytes);

            Files.write(Path.of(outputFile), outputBytes);

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException |
                 IOException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }

}
