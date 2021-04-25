package service;

import exception.AppException;

import java.util.List;

public interface FileReader {

    List<String> readFile(String filePath) throws AppException;
}
