package br.com.isaccanedo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Isac Canedo
 */

public class FileScannerDemo {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/num.txt");

        Scanner scan = new Scanner(new FileReader(file));
        double i = 0, sum = 0;
        int count = 0;
        do {
            i = scan.nextDouble();
            count++;
            sum += i;
        } while (scan.hasNextDouble());

        scan.close();
        System.out.println(count + " números encontrados. A soma deles = " + sum);
    }

}

