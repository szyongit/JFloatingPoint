package at.szyon.jfloatingpoint;

public class JFloatingPoint {
    /**
     * @author Jackstar (translated into Java by Szyon)
     * @return The value with fixed floating-points
     */
    public static final double fixD(final double d) {
        return Math.round((d + Math.ulp(1.0d)) * 100d) / 100d;
    }

    /**
     * @param digits The amount of digits to return
     *
     * @author Jackstar (translated into Java by Szyon)
     * @return The value with fixed floating-points
     */
    public static final double fixD(final double d, final int digits) {
        return Math.round((d + Math.ulp(1.0d)) * Math.pow(10, digits)) / Math.pow(10, digits);
    }

    /**
     * @author Jackstar (translated into Java by Szyon)
     * @return The value with fixed floating-points
     */
    public static final float fixF(final float f) {
        return Math.round((f + Math.ulp(1.0f)) * 100f) / 100f;
    }

    /**
     * @author Jackstar (translated into Java by Szyon)
     * @return The value with fixed floating-points
     */
    public static final float fixF(final float f, final int digits) {
        return (float) (Math.round((f + Math.ulp(1.0f)) * Math.pow(10f, digits)) / Math.pow(10f, digits));
    }
}
