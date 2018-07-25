package com.wyh.tw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * 羽毛球馆的问题
 */
public class Badminton {

    private static ArrayList<Node> listA = new ArrayList();
    private static ArrayList<Node> listB = new ArrayList();
    private static ArrayList<Node> listC = new ArrayList();
    private static ArrayList<Node> listD = new ArrayList();


    public static void main(String[] args) throws Exception {
//
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.getDayOfWeek());
//        Node node = new Node();
//        node.start = "11:00";
//        node.end = "22:00";
//        node.location = "A";
//        node.name = "user";
//        node.date = localDate;
//
//        Node node1 = new Node();
//        node1.start = "11:00";
//        node1.end = "22:00";
//        node1.location = "A";
//        node1.name = "user";
//        node1.date = localDate;
//
//        if (node.equals(node1)) {
//            System.out.println("true");
//        }

        Scanner scanner = new Scanner(System.in);
        String in = null;
        String[] info = null;
        while (true) {
            in = scanner.nextLine();
            if (isEmpty(in)) {
                break;
            }
            if (checkInput(in)) {
                System.out.println("Error: the booking is invalid!");
            }

        }
    }


    /**
     * 判断字符串是否为空w
     *
     * @param s
     * @return true 是  false 否
     */
    private static boolean isEmpty(String s) {
        return s == null || "".equals(s) || s.length() == 0;
    }

    /**
     * 检查输入是否合法
     *
     * @param s 输入字符串
     * @return true 合法 false 不合法
     */
    private static boolean checkInput(String s) {
        String[] info = s.split(" ");
        if (info.length != 4 || info.length != 5) {
            return false;
        }
        try {
            LocalDate.parse(info[1]);
            String[] date = info[2].split("~");
            if (date[0].compareTo(date[1]) < 0) {
                return false;
            }
            if (!info[3].equals("A")
                    && !info[3].equals("B")
                    && !info[3].equals("C")
                    && !info[3].equals("D")) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        if (info.length == 5 && !"C".equals(info[4])) {
            return false;
        }
        return true;
    }


    static class Node {
        String name;
        LocalDate date;
        String start;
        String end;
        String location;
        boolean status;

        public Node(String s) {
            String[] ss = s.split(" ");
            name = ss[0];
            date = LocalDate.parse(ss[1]);
            String[] time = ss[2].split("~");
            start = time[0];
            end = time[1];
            location = ss[3];
            if (ss.length == 5) {
                status = true;
            } else {
                status = false;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return status == node.status &&
                    Objects.equals(name, node.name) &&
                    Objects.equals(date, node.date) &&
                    Objects.equals(start, node.start) &&
                    Objects.equals(end, node.end) &&
                    Objects.equals(location, node.location);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, date, start, end, location, status);
        }
    }

}
