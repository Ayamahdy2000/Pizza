
package restaurant;


public class Olive extends ToppingDecorator{
    Pizza p;
    public Olive(Pizza p){
        this.p=p;
    }
    @Override
    public String Getdescription(){
        return p.Getdescription()+", with Olive";
    }
    @Override
    public double cost(){
        return .90 + p.cost();
    }
    
}
