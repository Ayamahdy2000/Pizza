
package restaurant;

public class Mushroom extends ToppingDecorator{
      Pizza p;
    public Mushroom(Pizza p){
        this.p=p;
    }
    @Override
    public String Getdescription(){
        return p.Getdescription()+", with Mushroom";
    }
    @Override
    public double cost(){
        return 1.30 + p.cost();
    }    
}

    

