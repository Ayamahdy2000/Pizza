
package restaurant;

public class Tomato extends ToppingDecorator{
    Pizza p;
    public Tomato(Pizza p){
        this.p=p;
    }
    @Override
    public String Getdescription(){
        return p.Getdescription() +", with Tomato";
    }
    @Override
    public double cost(){
        return 0.30 +p.cost();
    }
}
