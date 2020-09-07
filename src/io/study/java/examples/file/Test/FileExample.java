package io.study.java.examples.file.Test;
import java.io.File;

public class FileExample {
    public static void main(String[] args) {

        File m_dir = new File("/Users/kimjungwoo/develop/basic-java/src/io/study/java/examples/file/Test");

        File m_files[] = m_dir.listFiles();

        for(int i=0;i<m_files.length;i++){
            System.out.println(m_files[i].getName());
        }
    }
}
