//        Crie uma classe denominada Elevador para armazenar as informações de um elevador
//        dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
//        no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
//        presentes nele. A classe deve também disponibilizar os seguintes métodos:

//        Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
//        andares no prédio (os elevadores sempre começam no térreo e vazio);
//        Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
//        espaço);
//        Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
//        dentro dele);
//        Sobe : para subir um andar (não deve subir se já estiver no último andar);
//        Desce : para descer um andar (não deve descer se já estiver no térreo);
//        Encapsular todos os atributos da classe (criar os métodos set e get).





package POO.ex03;


public class Elevator {

    private int actualFloor;
    private int numFloors;
    private int elevatorCapacity;
    private int occupation;

    public Elevator(int elevatorCapacity, int numFloors){
        this.elevatorCapacity = elevatorCapacity;
        this.numFloors = numFloors;
        actualFloor = 0;
        occupation = 0;
    }

    public static void main(String[] args) {

    }

    public int getActualFloor() {
        return actualFloor;
    }

    public void setActualFloor(int actualFloor) {
        this.actualFloor = actualFloor;
    }

    public int getElevatorCapacity() {
        return elevatorCapacity;
    }

    public void setElevatorCapacity(int elevatorCapacity) {
        this.elevatorCapacity = elevatorCapacity;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public void enter(){
        if (occupation < elevatorCapacity){
            occupation++;
        }else{
            System.out.println("O elevador está cheio!");
        }
    }

    public void exit(){
        if (occupation > 0){
            occupation--;
        }else{
            System.out.println("O elevador está vazio!");
        }
    }

    public void up(){
        if (actualFloor < numFloors){
            actualFloor++;
        }

    }

    public void down(){
        if (actualFloor > 0){
            actualFloor--;
        }
    }

}
