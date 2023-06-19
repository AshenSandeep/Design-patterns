package Command.fx;

public class Button {
    private String lable;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }
    public void click(){
        command.excute();
    }
    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
