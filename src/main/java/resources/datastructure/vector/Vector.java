package resources.datastructure.vector;

public class Vector
{
    public String[] remove (int index, String[] vector) {
        if (!(index >= 0 && index < vector.length)) {
            throw new IllegalArgumentException("Position invalid");
        }

        for (int i = index; i < vector.length-1; i++)
        {
            vector[i] = vector[i + 1];
        }

        return vector;
    }
}
