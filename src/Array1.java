public class Array1
{
    public static void main(String[] args)
    {
        int[] salaries = {30, 50, 60, 90, 100, 999};
        int max_salaries = Integer.MIN_VALUE;
        for (int i = 0; i < salaries.length; i++)
        {
            if (salaries[i] > max_salaries) {
                max_salaries = salaries[i];
            }

        }                  System.out.println(max_salaries);
    }
}
