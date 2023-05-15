
package overloading;

import java.util.Scanner;

public class vektor {
    public int[] input;

    public vektor(int a, int b, int c) {
        input = new int[] {a, b, c};
    }

    public int nilaiX() {
        return input[0];
    }

    public int nilaiY() {
        return input[1];
    }

    public int nilaiZ() {
        return input[2];
    }

    public vektor scalar(int scalar) {
        return new vektor(input[0] * scalar, input[1] * scalar, input[2] * scalar);
    }

    public int vektor2(vektor nilaivektor2) {
        return input[0] * nilaivektor2.nilaiX() + input[1] * nilaivektor2.nilaiY() + input[2] * nilaivektor2.nilaiZ();
    }
}