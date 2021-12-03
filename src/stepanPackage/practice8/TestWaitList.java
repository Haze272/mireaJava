package stepanPackage.practice8;

public class TestWaitList {
    public static void main(String[] args) {
        WaitList<Integer> list1 = new WaitList<>();
        for (int i = 0; i <= 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        System.out.println("Empty: " + list1.isEmpty());

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(9);
        for (int i = 15; i >= 1; i--) {
            list2.add(i);
        }
        System.out.println(list2);
        System.out.println("Empty: " + list2.isEmpty());
    }
}
