import java.util.*;

public class LongestSubstring { 

// Given a string, find the length of the longest substring without repeating characters.
// Input: "abcabcdbb"
// Output: 3 
// Explanation: The answer is "abc", with the length of 3. 

public static int lengthOfLongestSubstring(String elements) {
  HashSet<String> hset = new HashSet<String>();
  int answer = 0;
  if (elements.equals(" ") || elements.equals("")) {
    return elements.length();
  }
  for (String s : elements.split("")) {
   if (!hset.contains(s)) {
    hset.add(s);
   } else {
    answer = Math.max(hset.size(), answer);
    hset.clear();
    hset.add(s);
   }
 }
 
 return answer; 
}

// d v d f
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcdbb"));
  }
}