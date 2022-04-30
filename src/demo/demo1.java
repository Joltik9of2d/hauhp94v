package demo;

import javax.sql.rowset.Joinable;
import java.time.LocalTime;
import java.util.*;

public class demo1 {
    public static int recursion(int x, int y) {
        if (x == 1)
            return y;
        else
            return y * recursion(y, x - 1);
    }


    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
    }

    }
