package bai8_clean_code_and_refactoring.bai_tap_8;

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        boolean isEqualScore = scorePlayer1 == scorePlayer2;
        if (isEqualScore) {
            score = getScorePlayer1(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = getMinusResult(scorePlayer1, scorePlayer2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                score = getPlusScore(score, tempScore);
            }
        }
        return score;
    }

    private static String getPlusScore(String score, int tempScore) {
        switch (tempScore) {
            case TennisGame.LOVE:
                score += "Love";
                break;
            case TennisGame.FIFTEEN:
                score += "Fifteen";
                break;
            case TennisGame.THIRTY:
                score += "Thirty";
                break;
            case TennisGame.FORTY:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String getMinusResult(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getScorePlayer1(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
