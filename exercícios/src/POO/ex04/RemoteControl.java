package POO.ex04;

public class RemoteControl extends Television{

    private Television tv;

    public RemoteControl(Television tv){
        this.tv = tv;
    }

    public void incrementVolume(){
        tv.incrementVolumeTV();
    }

    public void decrementVolume(){
        tv.decrementVolumeTV();
    }

    public void incrementChannel(){
        tv.incrementChannelTV();
    }

    public void decrementChannel(){
        tv.decrementChannelTV();
    }

    public void changeChannel(int channel){
        tv.changeChannelTV(channel);
    }

    public void printData(){
        tv.printDataTV();
    }

}
