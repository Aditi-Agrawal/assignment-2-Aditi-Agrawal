/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(15);
        obj.insert(10);
        obj.insert(50);
        obj.insert(55);
        obj.insert(60);
        System.out.println("left nodes of bst:");
        obj.traverse();
        System.out.println("count of nodes not having left node");
        System.out.println(obj.getCountRight());
    }
}
