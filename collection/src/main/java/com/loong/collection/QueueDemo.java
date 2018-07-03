package com.loong.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<String>();
        //offer 添加一个元素并返回true 如果队列已满，则返回false
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");
        System.out.println(queue.toString());

        //element 返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
        String aaa=queue.element();

        //peek 返回队列头部的元素   如果队列为空，则返回null
        String bbb=queue.peek();

        //poll 移除并返问队列头部的元素    如果队列为空，则返回null
        String ccc=queue.poll();

        //remove 移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException
        String ddd=queue.remove();

        System.out.println("aaa:"+aaa +"\tbbb:"+bbb+"\tccc:"+ccc+"\tddd:"+ddd);

        System.out.println(queue.toString());

        //阻塞操作
        //put  添加一个元素     如果队列满，则阻塞
        //take 移除并返回队列头部的元素    如果队列为空，则阻塞
    }

}
