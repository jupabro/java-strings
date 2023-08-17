import java.util.HashMap;
import java.util.Map;

public class DataTypeUtils {
    private static final Map<Class<?>, Integer> PRIMITIVE_BYTE_MAP = new HashMap<>();

    static {
        PRIMITIVE_BYTE_MAP.put(byte.class, 1);
        PRIMITIVE_BYTE_MAP.put(short.class, 2);
        PRIMITIVE_BYTE_MAP.put(int.class, 4);
        PRIMITIVE_BYTE_MAP.put(long.class, 8);
        PRIMITIVE_BYTE_MAP.put(float.class, 4);
        PRIMITIVE_BYTE_MAP.put(double.class, 8);
        PRIMITIVE_BYTE_MAP.put(char.class, 2);
        PRIMITIVE_BYTE_MAP.put(boolean.class, 1);
    }

    public static int getPrimitiveBytes(Class<?> primitiveType) {
        return PRIMITIVE_BYTE_MAP.getOrDefault(primitiveType, -1);
    }

    public static int estimateBytes(String str) {
        // Convert the string to bytes using UTF-8 encoding
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);

        // Count the number of bytes
        return bytes.length;
    }
}
