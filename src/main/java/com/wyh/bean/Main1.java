package com.wyh.bean;

/**
 * 小明拿到了一个数列a1 , a2 , ... an ，小明想知道存在多少个区间[l,r]同时满足下列两个条件：
 * <p>
 * 1、r-l+1=k;
 * <p>
 * 2、在a l , a l+1,...ar中，存在一个数至少出现了 t 次。
 * <p>
 * 输出满足条件的区间个数。
 * <p>
 * 输入
 * 输入第一行三个整数n,k,t(1≤n,k,t≤105。
 * <p>
 * 第二行 n 个整数，a1 , a2 , ... an (1≤ai≤105)。
 * <p>
 * 输出
 * 输出一个数，问题的答案。
 * <p>
 * <p>
 * 样例输入
 * 5 3 2
 * 3 1 1 1 2
 * 样例输出
 * 3
 * <p>
 * Hint
 * 区间[1,3]中1出现了2次，区间[2,4]中1出现了3次，区间[3,5]中1出现了2次。所以一共有3个区间满足条件。
 */
public class Main1 {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.MAX_VALUE);
    }
}
//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int t = in.nextInt();
//        int arr[] = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            arr[i] = in.nextInt();
//        }
//        int count = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int max = 0;
//        for (int i = 1; i <= n; i++) {
//            map.put(arr[i], 1);
//            for (int j = i + 1; j <= n; j++) {
//                Integer temp = map.get(arr[j]);
//                if (temp != null) {
//                    map.put(arr[j], temp + 1);
//                } else {
//                    map.put(arr[j], 1);
//                }
//                max = Math.max(max, map.get(arr[j]));
//                if (j - i + 1 == k && max >= t) {
//                    count++;
//                    break;
//                }
//            }
//            max = 0;
//            map.clear();
//        }
//        System.out.println(count);
//    }
//}
