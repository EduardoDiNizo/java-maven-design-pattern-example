package com.pattern.example.demo.behavioral.strategy.src.example1;

import java.io.File;
import java.util.ArrayList;

public interface CompressionStrategy {

    public void compressFiles(ArrayList<File> files);

}
