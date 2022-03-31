public class WebDriverWeightCountSetup {
    protected static final String URL = "https://svyatoslav.biz/testlab/wt/";

    protected static final String INPUT_NAME_XPATH = "//form//input[@name='name']";
    protected static final String INPUT_HEIGHT_XPATH = "//form//input[@name='height']";
    protected static final String INPUT_WEIGHT_XPATH = "//form//input[@name='weight']";
    protected static final String CHECK_MALE_GENDER_XPATH = "//form//input[@name='gender'][1]";
    protected static final String CHECK_FEMALE_GENDER_XPATH = "//form//input[@name='gender'][2]";
    protected static final String BUTTON_SUBMIT_XPATH = "//form//input[@value='Рассчитать']";
}
