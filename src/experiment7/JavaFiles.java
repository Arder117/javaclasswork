//2. 列出指定目录及其子目录中所有扩展名为.java的文件

package experiment7;

import java.io.File;

public class JavaFiles {
    public static void listJavaFiles(String path) {
        File file = new File(path);
        File[] files = file.listFiles(); // 返回一个路径名数组
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) { // 如果是目录，递归调用
                    listJavaFiles(f.getAbsolutePath()); // getAbsolutePath() 返回绝对路径
                } else {
                    if (f.getName().endsWith(".java")) { // 如果是.java文件，输出绝对路径
                        System.out.println(f.getAbsolutePath());
                    }
                }
            }
        }
    }
}



