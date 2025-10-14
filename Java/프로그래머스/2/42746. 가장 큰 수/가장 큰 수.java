import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        
        // int 배열을 String 배열로 바꾸어야됨
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        // 문자를 붙였을때 큰 수가 나오게 하기
        Arrays.sort(strs, new MyComparator());

        // 모든 숫자가 0인 경우 0으로 반환
        if (strs[0].equals("0")) {
            return "0";
        }

        // 문자열 반환
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < strs.length; s++) {
            sb.append(strs[s]);
        }

        return sb.toString();
    }
}

// 🔹 별도의 익명클래스 정의
class MyComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        // b+a 와 a+b 중 어떤 게 더 큰지 비교
        return (b + a).compareTo(a + b);
    }
}