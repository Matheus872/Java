//        Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
//        trocar os canais da televisão. O controle de volume permite:
//         aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//         aumentar e diminuir o número do canal em uma unidade
//         trocar para um canal indicado;
//         consultar o valor do volume de som e o canal selecionado.


package POO.ex04;

public class Television {

    private int volume;
    private int channel;
    private int maxChannel;
    private int maxVolume;

    public Television(){

    }

    public Television(int maxChannel, int maxVolume){
        this.maxChannel = maxChannel;
        this.maxVolume = maxVolume;
        volume = 0;
        channel = 0;
    }

    public static void main(String[] args) {
        Television tv = new Television(10, 10);
        tv.printDataTV();
        tv.changeChannelTV(8);
        tv.printDataTV();
    }

    protected int getChannel() {
        return channel;
    }

    protected void setChannel(int channel) {
        this.channel = channel;
    }

    protected int getMaxChannel() {
        return maxChannel;
    }

    protected void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    protected int getVolume() {
        return volume;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected int getMaxVolume() {
        return maxVolume;
    }

    protected void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    protected void printDataTV(){
        System.out.println("Channel: " + getChannel());
        System.out.println("Volume: " + getVolume());
    }

    protected void incrementVolumeTV(){
        if (getVolume() < getMaxVolume()) {
            setVolume(getVolume() + 1);
        }
    }

    protected void decrementVolumeTV(){
        if (getVolume() > 0) {
            setVolume(getVolume() - 1);
        }
    }

    protected void incrementChannelTV(){
        if (getChannel() < getMaxChannel()) {
            setChannel(getChannel() + 1);
        }
    }

    protected void decrementChannelTV(){
        if (getChannel() > 0) {
            setChannel(getChannel() - 1);
        }
    }

    protected void changeChannelTV(int newChannel){
        if (newChannel < this.getMaxChannel() && newChannel > 0){
            this.setChannel(newChannel);
        }else {
            System.out.println("Invalid Channel");
        }
    }

}
