package General;
public class university {
    String uniName = null;
    String uniAddress = null;

    public void setValues(String uniName, String uniAddress){
        this.uniName = uniName;
        this.uniAddress = uniAddress;
    }
    public void display(){
        System.out.println(uniName + ", " + uniAddress);
    }
}
