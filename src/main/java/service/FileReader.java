package service;

import exception.ReaderException;

import java.util.List;

public interface FileReader {

    List<String> readFile(String filePath) throws ReaderException;
}
