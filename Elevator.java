public class Elevator {
        private String Name;
        private double Speed;
        private double Height;
        private double TargetHeight;
        private double MaxHeight;
        private double MinHeight;

    public Elevator(String name, double maxHeight, double minHeigh, double CurrentHeight, double targetheight) {
        this.Name = name;
        this.MaxHeight = maxHeight;
        this.MinHeight = minHeigh;
        this.Height = CurrentHeight;
        this.TargetHeight = targetheight;
        this.Speed = 0;
    }
    public boolean isAtTop(double height) {
        if (height >= MaxHeight) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isAtBottom(double height) {
        if (height <= MinHeight) {
            return true;
        } else {
            return false;
        }
    }
    public void goToTop(){
        while (isAtTop(Height) == false) {
            Speed=1;
        }


    }
    public void goToBottom(){
        while (isAtBottom(Height)== false){
            Speed=-1;
        }


    }
    public boolean isAtTarget(){
        if (Height == TargetHeight){
            return true;
        }
        else{
            return false;
        }
    }
}
