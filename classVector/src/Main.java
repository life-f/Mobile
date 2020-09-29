import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Vector vector1 = new Vector(r.nextInt(20),
                r.nextInt(20), r.nextInt(20));
        System.out.println(vector1);
        System.out.println("Length: " + vector1.vectorLength());
        Vector vector2 = new Vector(r.nextInt(20),
                r.nextInt(20), r.nextInt(20));
        System.out.println(vector2);
        System.out.println("Scalar product: " + vector1.scalarProduct(vector2));
        System.out.println("Vector product: " + vector1.vectorProduct(vector2));
        System.out.println("Cosinus: " + vector1.cosVector(vector2));
        System.out.println("Summa: " + vector1.sum(vector2));
        System.out.println("Difference: " + vector1.difference(vector2));
        System.out.println(Arrays.toString(randomVector(r.nextInt(10))));
    }

    public static Vector[] randomVector(int N) {
        Vector[] vectors = new Vector[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector(random.nextInt(20),
                    random.nextInt(20), random.nextInt(20));
        }
        return vectors;
    }
}
