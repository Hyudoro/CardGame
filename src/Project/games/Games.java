package Project.games;

import Project.controller.GameController;
import Project.model.Deck;
import Project.model.DeckFactory;
import Project.view.GameSwingPassiveView;
import Project.view.GameSwingView;
import Project.view.GameViewable;
import Project.view.GameViewables;


public class Games {
    public static void main(String[] args){

        // GameController gc = new GameController(new Deck(),new View(), new HighCardGameEvaluator());
        GameViewables views = new GameViewables();


        GameSwingView gsv = new GameSwingView();
        gsv.createAndShowGUI();

        views.addViewable(gsv);

        for(int i = 0; i<3; i++){
            GameSwingPassiveView passiveView = new GameSwingPassiveView();
            passiveView.createAndShowGUI();

            views.addViewable(passiveView);
            //sleep to move new Swing frame on window

            try{
                Thread.sleep(3500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }




        GameController gc = new GameController( DeckFactory.makeDeck(DeckFactory.DeckType.Normal),views, new HighCardGameEvaluator());
        gc.run();
    }
}
