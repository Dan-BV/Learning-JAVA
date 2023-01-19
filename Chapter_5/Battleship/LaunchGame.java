public class LaunchGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        Field f = new Field();
        int randomNum = (int)(Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationsCells(locations);
        f.draw();
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            int g = Integer.parseInt(guess);
            f.cellsChange(g, result);
            f.draw();
            numOfGuesses++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось "+numOfGuesses+" попыток");
            }
        }
    }
}
