import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * 羽毛球馆的问题
 */
public class Badminton {

    private static ArrayList<Node> listA = new ArrayList();
    private static ArrayList<Node> listB = new ArrayList();
    private static ArrayList<Node> listC = new ArrayList();
    private static ArrayList<Node> listD = new ArrayList();


    static class Node {
        String name;
        LocalDate date;
        LocalTime start;
        LocalTime end;
        String location;
        private boolean status;
        private int price;

        //价格表，上三角为周一到周五，下三角为周末
        private int[][] priceTable = {
                {0, 30, 60, 90, 140, 190, 240, 290, 340, 390, 470, 550, 610, 670},
                {40, 0, 30, 60, 110, 160, 210, 260, 310, 360, 440, 520, 580, 640},
                {80, 40, 0, 30, 80, 130, 180, 230, 280, 330, 410, 490, 550, 610},
                {120, 80, 40, 0, 50, 100, 150, 200, 250, 300, 380, 460, 520, 580},
                {170, 130, 90, 50, 0, 50, 100, 150, 200, 250, 330, 410, 470, 530},
                {220, 180, 140, 100, 50, 0, 50, 100, 150, 200, 280, 360, 420, 480},
                {270, 230, 190, 150, 100, 50, 0, 50, 100, 150, 230, 310, 370, 430},
                {320, 280, 240, 200, 150, 100, 50, 0, 50, 100, 180, 260, 320, 380},
                {370, 330, 290, 250, 200, 150, 100, 50, 0, 50, 130, 210, 270, 330},
                {420, 380, 340, 300, 250, 200, 150, 100, 50, 0, 80, 160, 220, 280},
                {480, 440, 400, 360, 310, 260, 210, 160, 110, 60, 0, 80, 140, 200},
                {540, 500, 460, 420, 370, 320, 270, 220, 170, 120, 60, 0, 60, 120},
                {600, 560, 520, 480, 430, 380, 330, 280, 230, 180, 120, 60, 0, 60},
                {660, 620, 580, 540, 490, 440, 390, 340, 290, 240, 180, 120, 60, 0}
        };


        public Node() {
        }

        public Node(String s) {
            String[] ss = s.split(" ");
            name = ss[0];
            date = LocalDate.parse(ss[1]);
            String[] time = ss[2].split("~");
            start = LocalTime.parse(time[0]);
            end = LocalTime.parse(time[1]);
            location = ss[3];
            if (ss.length == 5) {
                status = true;
            } else {
                status = false;
            }
            calPrice();
        }


        /**
         * 计算价格
         */
        private void calPrice() {
            int res = 0;
            double cost = 0;
            switch (this.date.getDayOfWeek().getValue()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    res = priceTable[start.getHour() - 9][end.getHour() - 9];
                    cost = 0.5;
                    break;
                case 6:
                case 7:
                    res = priceTable[end.getHour() - 9][start.getHour() - 9];
                    cost = 0.25;
                    break;
                default:
                    res = 0;
                    break;
            }
            //是否取消
            if (status) {
                this.price = (int) (res * cost);
            } else {
                this.price = res;
            }
        }

        /**
         * 检查两者时间是否重合
         *
         * @param node
         * @return true 重合 false 不重合
         */
        public boolean checkTimeOver(Node node) {
            //日期是否重合
            if (!this.date.isEqual(node.date)) {
                return false;
            }

            if (this.end.getHour() <= node.start.getHour() || node.end.getHour() <= this.start.getHour()) {
                return false;
            }

            return true;
        }
        public int getPrice() {
            return price;
        }

        public boolean isStatus() {
            return status;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(name, node.name) &&
                    Objects.equals(date, node.date) &&
                    Objects.equals(start, node.start) &&
                    Objects.equals(end, node.end) &&
                    Objects.equals(location, node.location);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", date=" + date +
                    ", start=" + start +
                    ", end=" + end +
                    ", location='" + location + '\'' +
                    ", status=" + status +
                    ", price=" + price +
                    '}';
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, date, start, end, location);
        }
    }

}
