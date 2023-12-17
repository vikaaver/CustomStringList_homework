import java.util.Arrays;
public class CustomStringList {
    public String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }

    private boolean check (String val){
        for (String str: list){
            if (str.equals(list)){
                return true;
            }
        }
        return false;
    }
}
