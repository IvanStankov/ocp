package com.ivan.learning.ocp.io.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path1 = Paths.get("d:/Learning/ocp/nio.txt");
        Path path2 = Paths.get("d:/Learning/ocp/src");

        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

        Path path3 = Paths.get("d:/Learning");
        Path path4 = Paths.get("d:\\Soft\\hidemymac\\");
        Path relativePath = path3.relativize(path4);
        System.out.println(relativePath);
        System.out.println(path3.resolve(relativePath));
        System.out.println(path3.resolve(relativePath).normalize());
        System.out.println(path3.resolve(relativePath).normalize().toRealPath());

//        Files.newInputStream();
    }

}
