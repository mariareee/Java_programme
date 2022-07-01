/*clasa cu numele nostru de creat, de avut un field static care o sa numere
(cate obiecte am creat de la clasa data)de cate ori am apelat*/
public class Main {
    public static void main(String[] args) {
        Maria m = new Maria();
        Maria n = new Maria();

        int firstCount = Maria.getprintCounter();
        System.out.println(firstCount);
    }
}