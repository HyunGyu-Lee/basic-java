package io.study.java.examples.interface_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Gasoline implements Engine{
    private String engineName;
    private String engineVersion;

    public Gasoline(String engineName, String engineVersion){
        this.engineName = engineName;
        this.engineVersion = engineVersion;

    }

    public void engineStart() {

    }


    public String getEngineName(String engineName) {
        return engineName;
    }


    public String getEngineVersion(String engineVersion) {
        return engineVersion;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.stream().mapToInt(e -> e).toArray();
    }
}
