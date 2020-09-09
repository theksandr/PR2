public class Cheems
{
        public static void main(String[] args) {
            Dog dog1 = new Dog("Doge", 5);
            Dog dog2 = new Dog("Cheems", 6);
            Dog dog3 = new Dog("Walter");
            dog3.setAge(7);
            System.out.println(dog3.getAge());
            System.out.println(dog2.getName());
            System.out.println(dog1);
            dog1.toHumanAge();
            dog2.toHumanAge();
            dog3.toHumanAge();
        }
    }
