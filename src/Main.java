import controller.ChallengeController;
import model.*;
import view.*;

public class Main {

    public static void main(String[] args) {


//        userJoinChallenge viewUserJoinChallenge = new userJoinChallenge();
        Challenge theModel = new Challenge(5);
        ChallengeController controller = new ChallengeController(theModel);

    }
}
