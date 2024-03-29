package Generics;

public class TypeSafeExample
{
    public static void main(String[] args)
    {
        StringCircularBuffer buffer = new StringCircularBuffer(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        //buffer.offer(1);

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(StringCircularBuffer buffer)
    {
        StringBuilder result = new StringBuilder();

        String value;
        while ((value = buffer.poll()) != null)
        {
            result.append(value);
        }

        return result.toString();
    }
}
