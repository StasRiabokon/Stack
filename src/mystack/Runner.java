/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author yasta
 */
public class Runner {

    public static void main(String[] args) {
        StackClass stackClass = new StackClass();
        stackClass.setSize(100);
        stackClass.push("Surname of a Student 1");
        stackClass.push("Surname of a Student 2");
        stackClass.push("Surname of a Student 3");
        stackClass.push("Surname of a Student 4");
        stackClass.pop();
        stackClass.popUpAll();

    }
}
