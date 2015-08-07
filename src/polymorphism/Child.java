/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author codesushi
 */
public class Child extends Parent {
    
    public void callFoo() {
        this.foo();
    }
    
    @Override
    public String toString() {
        return "child";
    }
    
}
