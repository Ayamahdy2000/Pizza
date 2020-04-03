package restaurant;

import static javax.swing.JOptionPane.*;

public class Restaurant {

    public static void main(String[] args) {
        Pizza p;
        String x = showInputDialog("1.Chinken Pizza \n2.Cheese Pizza \n3.Margherita Pizza \n4.Tuna Pizza\n5.Exit \nEnter your order");
        int i = Integer.parseInt(x);
        switch (i) {
            case 1:
                p = new Chicken();
                topping(p);
                break;
            case 2:
                p = new Cheese();
                topping(p);
                break;
            case 3:
                p = new Margherita();
                topping(p);
                break;
            case 4:
                p = new Tuna();
                topping(p);
                break;
            case 5:
                break;
        }

    }

    public static void topping(Pizza p) {

        String a = showInputDialog("How many topic");
        showMessageDialog(null, "1.Murhroom \n2.Tomato \n3.Pepper \n4.Olive\n5.Exit");
        int b = Integer.parseInt(a);
        switch (b) {
            case 1:
                String y = showInputDialog("Enter your order");
                int z = Integer.parseInt(y);
                switch (z) {
                    case 1:
                        p = new Mushroom(p);
                        showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                        break;
                    case 2:
                        p = new Tomato(p);
                        showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                        break;
                    case 3:
                        p = new Pepper(p);
                        showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                        break;
                    case 4:
                        p = new Olive(p);
                        showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                        break;
                    case 5:
                        showMessageDialog(null, "Description is " + p.description + ",cost is $" + p.cost());
                        break;
                }
                break;
            case 2:

                String c = showInputDialog("Enter your first topping");
                int Ftopping = Integer.parseInt(c);
                String s = showInputDialog("Enter your second topping");
                int Stopping = Integer.parseInt(s);

                if (Ftopping == 1 && Stopping == 2) {
                    p = new Mushroom(p);
                    p = new Tomato(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 1 && Stopping == 3) {
                    p = new Mushroom(p);
                    p = new Pepper(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 1 && Stopping == 4) {
                    p = new Mushroom(p);
                    p = new Olive(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 2 && Stopping == 1) {
                    p = new Tomato(p);
                    p = new Mushroom(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 2 && Stopping == 3) {
                    p = new Tomato(p);
                    p = new Pepper(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 2 && Stopping == 4) {
                    p = new Tomato(p);
                    p = new Olive(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 3 && Stopping == 1) {
                    p = new Pepper(p);
                    p = new Mushroom(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 3 && Stopping == 2) {
                    p = new Pepper(p);
                    p = new Tomato(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 3 && Stopping == 4) {
                    p = new Pepper(p);
                    p = new Olive(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 4 && Stopping == 1) {
                    p = new Olive(p);
                    p = new Mushroom(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 4 && Stopping == 2) {
                    p = new Olive(p);
                    p = new Tomato(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 4 && Stopping == 3) {
                    p = new Olive(p);
                    p = new Pepper(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else {
                    showMessageDialog(null, "Wrong!");
                }
                break;
            case 3:

                c = showInputDialog("Enter your first topping");
                Ftopping = Integer.parseInt(c);
                s = showInputDialog("Enter your second topping");
                Stopping = Integer.parseInt(s);
                String t = showInputDialog("Enter your third topping");
                int thirdTopping = Integer.parseInt(t);

                if (Ftopping == 1 && Stopping == 2 && thirdTopping == 3) {
                    p = new Mushroom(p);
                    p = new Tomato(p);
                    p = new Pepper(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 1 && Stopping == 2 && thirdTopping == 4) {
                    p = new Mushroom(p);
                    p = new Pepper(p);
                    p = new Olive(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 1 && Stopping == 3 && thirdTopping == 4) {
                    p = new Mushroom(p);
                    p = new Pepper(p);
                    p = new Olive(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else if (Ftopping == 2 && Stopping == 3 && thirdTopping == 4) {
                    p = new Tomato(p);
                    p = new Pepper(p);
                    p = new Olive(p);
                    showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
                } else {
                    showMessageDialog(null, "Wrong!");
                }
                break;
            case 4:
                p = new Mushroom(p);
                p = new Tomato(p);
                p = new Pepper(p);
                p = new Olive(p);
                showMessageDialog(null, "Description is " + p.Getdescription() + ",cost is $" + p.cost());
        }
    }

}
