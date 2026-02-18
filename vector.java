package operaciones;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector vectorUnitario() {
        double mag = magnitud();
        if (mag == 0) {
            return new Vector(0, 0, 0);
        }
        return new Vector(x / mag, y / mag, z / mag);
    }

    public Vector multiplicarEscalar(double a) {
        return new Vector(a * x, a * y, a * z);
    }

    public Vector sumar(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public double productoPunto(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public Vector productoCruz(Vector v) {
        double nuevoX = y * v.z - v.y * z;
        double nuevoY = v.x * z - x * v.z;
        double nuevoZ = x * v.y - v.x * y;
        return new Vector(nuevoX, nuevoY, nuevoZ);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
