package com.koval.jresolver.classifier;

import java.io.File;
import java.io.InputStream;


public interface Vectorizer {

  void createFromFile(File inputFile);

  void createFromInputStream(InputStream inputStream);

  void save(String pathToSerializedFile);

  void load(String pathToSerializedFile);
}
