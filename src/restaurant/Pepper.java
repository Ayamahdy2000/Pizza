/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Copy Center
 */
public class Pepper extends ToppingDecorator{
      Pizza p;
    public Pepper(Pizza p){
        this.p=p;
    }
    @Override
    public String Getdescription(){
        return p.Getdescription()+", with Pepper";
    }
    @Override
    public double cost(){
        return .08 + p.cost();
    }
    
}
