package service;

import exception.AppException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> readFile(String filePath) throws AppException {
        List<String> fileLines = new ArrayList<>();
        try {
            fileLines = Files.readAllLines(Paths.get(filePath));
        } catch (NoSuchFileException e) {
            throw new AppException("file not found" + e);
        } catch (IOException e) {
            throw new AppException("readFile() Exception:", e);
        }
        return fileLines;
    }
}
