package PageObjects;
public class CalculatorPage {

    private String Four_number = "//*[text()='4']";
    private String Two_number = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]";
    private String Three_number = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]";
    private String Five_number = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]";
    private String Zero_number = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]";
    private String Eight_number = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]";
    private String Nine_number = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]";
    private String Actual_result = "//*[@id='sciOutPut']";



    private String Multiplication = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]";
    private String Division = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]";
    private String Addition = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]";
    private String Subtraction = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]";
    private String Equalsto = "//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]";



    public String getFour_number() {
        return Four_number;
    }
    public String getTwo_number()
    {
        return Two_number;
    }
    public String getThree_number()
    {
        return Three_number;
    }
    public String getFive_number()
    {
        return Five_number;
    }
    public String getZero_number() { return Zero_number; }
    public String getEight_number() { return Eight_number; }
    public String getNine_number() { return Nine_number; }

    public String getMultiplication() { return Multiplication; }
    public String getDivision() { return Division;}
    public String getAddition() { return Addition;}
    public String getSubtraction() {return Subtraction;}
    public String getEqualsto() { return  Equalsto; }
    public String getActual_result() { return Actual_result;}



}
