package co.edu.uco.crosscutting.helpers;

public class ObjectHelper {

    private ObjectHelper() {
        // Constructor privado para evitar instanciación
    }

    public static <O> boolean isNull(O object) {
        return object == null;
    }

    public static <O> O getDefault(final O object, final O defaultObject) {
        return isNull(object) ? defaultObject : object;
    }
}
