package com.haobg2004110027.Baihoc.tuan8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();

        queue.add(50);
        queue.add(100);
        queue.add(150);

        //Lấy ra 1 phần tử trong queue - lấy phần tử đầu

        System.out.println(queue);

        int remove = queue.remove();
    
        System.out.println("Phần tử vừa được lấy ra: " + remove);

        System.out.println("Các phần tử còn lại: " + queue);

        //Xem 1 phần tử queue - không loại khỏi queue
        int ptDuocTham = queue.peek();

        System.out.println("Phần tử được tham khảo: " + ptDuocTham);

        System.out.println("Các phần tử còn lại: " + queue);

    }
}
