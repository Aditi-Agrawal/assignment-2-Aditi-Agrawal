/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("M", 26));
        queue.enqueue(new Student("A", 27));
        queue.enqueue(new Student("P", 65));
        queue.enqueue(new Student("S", 1));
        queue.enqueue(new Student("V", 10));
        queue.enqueue(new Student("Am", 76));

        queue.show();
        queue.dequeue();
        queue.show();

    }

}
