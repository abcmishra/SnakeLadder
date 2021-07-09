package service.impl;

import constants.Status;
import model.*;
import service.GameService;
import utils.LadderGenerator;

public class GameServiceImpl  implements GameService {

    public void GamePlay(Game game) {
        Status status=null;
        Dice dice=new Dice();

        while (game.getStatus()!=Status.COMPLETED){








        }
        status=Status.COMPLETED;



    }
}
