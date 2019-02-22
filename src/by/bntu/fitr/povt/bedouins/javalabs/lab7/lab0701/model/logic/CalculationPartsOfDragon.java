package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.model.logic;

public class CalculationPartsOfDragon {
    public static final int INCREMENT_HEADS_FIRST_STAGE = 3;
    public static final int INCREMENT_HEADS_SECOND_STAGE = 2;
    public static final int NUMBER_OF_EYES_ON_HEAD = 2;
    public static final int DRAGON_START_HEADS = 3;
    public static final int DRAGON_FIRST_STAGE = 200;
    public static final int DRAGON_LAST_STAGE = 300;

    public static int calcHeads(int age) {
        int heads = DRAGON_START_HEADS;

        if (age <= DRAGON_FIRST_STAGE) {
            heads += age * INCREMENT_HEADS_FIRST_STAGE;
        } else if (age <= DRAGON_LAST_STAGE) {
            heads += DRAGON_FIRST_STAGE * INCREMENT_HEADS_FIRST_STAGE +
                    (age % DRAGON_FIRST_STAGE) * INCREMENT_HEADS_SECOND_STAGE;
        } else {
            heads += DRAGON_FIRST_STAGE * INCREMENT_HEADS_FIRST_STAGE + (DRAGON_LAST_STAGE - DRAGON_FIRST_STAGE)
                    * INCREMENT_HEADS_SECOND_STAGE + (age - DRAGON_LAST_STAGE);
        }

        return heads;
    }

    public static int calcEyes(int heads) {
        return heads * NUMBER_OF_EYES_ON_HEAD;
    }
}