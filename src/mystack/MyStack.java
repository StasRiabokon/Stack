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
public interface MyStack {
    public void push(Object element);

    public Object pop();

    public void popUpAll();

    public Object peek();
    
}
