package pkg35.java.lab04;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Phoen1x
 */
public class DimaUserFactory implements UserFactory{
       @Override
       public User createUser(){
       return  new DimaUser();
       }
    
}
