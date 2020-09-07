package io.study.java.examples.file;
import java.io.File;

public class FileInOutTest {
    public static void main(String[] args) {
        File m_file = new File("/Users/kimjungwoo/develop/basic-java/src/io/study/java/examples/file/FileTest");

        System.out.println(m_file.exists());
        System.out.println(m_file.getName());
        System.out.println(m_file.length());

    }
}
