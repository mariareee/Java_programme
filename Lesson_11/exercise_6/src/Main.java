import java.util.Scanner;

/*Many years ago when Paul went to school, he did not like Heron's formula to
calculate the area of a triangle, because he considered it very complex. Once he decided
to help all school students: to write and distribute the program, calculating the area of a
triangle by its three sides.
However, there was a problem: as Paul did not like the formula, he did not memorize
it. Help him finish this act of kindness and write the program, calculating the area of a
triangle by the transferred length of its sides, in accordance with the Heron's formula:
𝑆 = 𝑝 * (𝑝 − 𝑎)(𝑝 − 𝑏)(𝑝 − 𝑐)
where 𝑝 = – half-perimeter of the triangle. On the input, the program has 𝑎 + 𝑏 + 𝑐
2
integers, and the output should be a real number corresponding to the area of the
triangle.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculating Heron's formula");
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce first value: ");
        int a = scan.nextInt();
        System.out.print("Introduce second value: ");
        int b = scan.nextInt();
        System.out.print("Introduce third value: ");
        int c = scan.nextInt();

         // half-perimeter of the triangle
        int p = (a + b + c) / 2;
        System.out.println("------------------------------------");
        System.out.println("The half-perimeter is : " + p);

        double sum = (double) Math.sqrt(p * (p -a) * (p - b) * (p - c));
        System.out.println("The area of triangle is " + sum + " using Heron's formula");
    }
}