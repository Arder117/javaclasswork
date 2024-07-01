//1. 编写Java程序统计一篇英文文档中各单词出现的次数，并按单词出现的频率由高到低进行输出。
//例如：文档“Hello word Hello”的统计结果为：
//Hello:2次，word:1次

package experiment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("F:\\Projects\\JAVA\\java实验\\src\\experiment1\\2");
        Scanner scanner = new Scanner(file);
        Map<String, Integer> wordCount = new HashMap<>(); //建立一个HashMap，用于存储单词和出现次数
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("[^A-Za-z\\s]", " "); // 将非字母字符替换为空格，
            String[] words = line.split("\\s+");
            for (String word : words) {
                word = word.trim();//trim() 方法用于删除字符串的头尾空白符,
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    // getOrDefault() 方法用于获取指定 key 对应 value，
                }
            }
        }
//        wordCount.entrySet().stream()
//                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
//                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + "次"));
//         entrySet() 方法返回映射的 Set 视图
//         stream() 方法返回一个由该映射中的键值映射所组成的 Stream
//         sorted() 方法用于对 Stream 进行排序，
//         forEach() 方法用于遍历流中的每个元素

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet()); //将map转换为list
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); //按照value排序
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "次");
        }

        scanner.close();
    }
}



