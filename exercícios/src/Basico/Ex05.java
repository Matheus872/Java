//        Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//        números 4, 5 e 6. A soma das duas médias. A média das médias.

package Basico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert the tree grades of the first group (grade1,grade2,grade3): ");
        String firstGroup = input.next();
        System.out.println("Insert the tree grades of the second group: ");
        String secondGroup = input.next();

        List<String> groupOne = new ArrayList<String>();
        List<String> groupTwo = new ArrayList<String>();
        groupOne = Arrays.stream(firstGroup.split(",")).collect(Collectors.toList());
        groupTwo = Arrays.stream(secondGroup.split(",")).collect(Collectors.toList());


        Float firstAverage = (Float.parseFloat(groupOne.get(0)) +
                                Float.parseFloat(groupOne.get(1)) +
                                Float.parseFloat(groupOne.get(2))) / 3;

        Float secondAverage = (Float.parseFloat(groupTwo.get(0)) +
                                Float.parseFloat(groupTwo.get(1)) +
                                Float.parseFloat(groupTwo.get(2))) / 3;

        System.out.println("Sum of the averages: " + (firstAverage + secondAverage));
        System.out.println("Average of the averages: " + (firstAverage + secondAverage) / 2);
    }

}
