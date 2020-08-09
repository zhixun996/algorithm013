package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    //实际上运行时间不是最快的,但因为正在学哈希
    public static boolean solutionBest(String s, String t){
        if(s.length() != t.length())
            return false;
        int count[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i : count) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
    //排序 艹了第一次知道字符还能排序的
    public static boolean solution1(String s, String t) {
        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }

    //笨比代码, 7 ms在所有 Java 提交中击败了5.7%用户, 废物一个
    public static boolean solution2(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();//瞅你命名整的真几把丢人
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        //你妈了**for循环里整那么多if else干啥玩意啊
        for(int i = 0; i < s.length(); i++) {
            if(map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }else{
                map1.put(s.charAt(i), 1);
            }
            if(map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }else{
                map2.put(t.charAt(i), 1);
            }
        }
        //害搁那遍历呢人家都j8跑完了废物
        for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if(! entry.getValue().equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.print(solutionBest("nmslcnm","cnmnmsl"));
    }
}
