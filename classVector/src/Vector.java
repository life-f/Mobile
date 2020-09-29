public class Vector {
    private final int x;
    private final int y;
    private final int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int scalarProduct(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector vectorProduct(Vector v) {
        int prodX = y * v.z - z * v.y;
        int prodY = z * v.x - x * v.z;
        int prodZ = x * v.y - y * v.x;
        return new Vector(prodX, prodY,prodZ);
//        return "(" + prodX + ", " + prodY + ", " + prodZ + ")";
    }

    public double cosVector(Vector v) {
        return this.scalarProduct(v) / Math.abs(this.vectorLength()) * Math.abs(v.vectorLength());
    }

    public Vector sum(Vector v) {
        int prodX = x + v.x;
        int prodY = y + v.y;
        int prodZ = z + v.z;
        return new Vector(prodX, prodY, prodZ);
//        return "(" + prodX + ", " + prodY + ", " + prodZ + ")";

    }

    public Vector difference(Vector v) {
        int prodX = x - v.x;
        int prodY = y - v.y;
        int prodZ = z - v.z;
        return new Vector(prodX, prodY, prodZ);
//        return "(" + prodX + ", " + prodY + ", " + prodZ + ")";

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
