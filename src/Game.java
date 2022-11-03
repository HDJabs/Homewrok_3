import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;

import java.lang.Math;
public class Game extends cs331FruitNinjaGame{

    // You may need to add constructor
    cs331Blade fruitSlicer;
    cs331ScoreController cont;
    public Game(cs331ScoreController cont){
        this.cont = cont;
        fruitSlicer = new cs331Blade("Fruit Slicer");
        addBlade(fruitSlicer);
    }

   

    public void updateChoppable(FBomb obj){
        obj.move();
        if(fruitSlicer.checkIntersection(obj)){
            obj.slice();
        }
    }

    @Override
    public Object launchItem() {

        //launchItem would return Fruit/Bomb object. 
        //So you need to create appropriate concrete class
        //for the fruits and/or Bomb, and generate them within this method.
        System.out.println("launching itemz");
        Fruit apple = new Fruit(2, cont);
        apple.setImage(Constants.APPLE_PATH);
        Fruit lemon = new Fruit(2, cont);
        lemon.setImage(Constants.LEMON_PATH);
        Fruit pear = new Fruit(3, cont);
        pear.setImage(Constants.PEAR_PATH);
        Fruit peach = new Fruit(5, cont);
        peach.setImage(Constants.PEACH_PATH);
        
        Bomb bomb = new Bomb();

        int rand = (int)(Math.random()*(5));
        
        switch(rand){
            case 0:
                return apple;
            case 1:
                return lemon;
            case 2:
                return pear;
            case 3:
                return peach;
            case 4:
                return bomb;
            default:
                return bomb;
        }
    }
    
    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
