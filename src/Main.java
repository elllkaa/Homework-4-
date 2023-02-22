public class Main {
    public static void main(String[] args) {
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия.");
        }

        int temperature = 6;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }

        int speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        }

        int ageOfMan = 28;
        if (ageOfMan >= 2 && ageOfMan < 6) {
            System.out.println("Если возраст человека равен " + ageOfMan + " , то ему нужно ходить в детский сад.");
        }
        if (ageOfMan >= 7 && ageOfMan < 18) {
            System.out.println("Если возраст человека равен " + ageOfMan + " , то ему нужно ходить в школу.");
        }
        if (ageOfMan >= 18 && ageOfMan < 24) {
            System.out.println("Если возраст человека равен " + ageOfMan + " , то ему нужно ходить в университет.");
        }
        if (ageOfMan > 24) {
            System.out.println("Если возраст человека равен " + ageOfMan + " , то ему нужно ходить на работу.");
        }

        int ageOfChild = 15;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " , то ему нельзя кататься на аттракционе.");
        }
        if (ageOfChild > 5 && ageOfChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageOfChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " , то он может кататься без сопровождения взрослого.");
        }

        int carCapacity = 102;
        int seating = 60;
        int standing = carCapacity - seating;
        int seatingUsed = 46;
        int otherUsed = 25;
        if (seatingUsed < seating) {
            System.out.println("Есть еще " + (standing - seatingUsed) + " сидячих мест.");
        }
        if (seatingUsed >= seating) {
            System.out.println("Сидячих мест нет.");
        }
        if (standing < otherUsed) {
            System.out.println("Есть еще " + (standing - otherUsed) + " стоячих мест.");
        }
        if (otherUsed >= standing) {
            System.out.println("Стоячих мест нет.");
        }

        int one = 32;
        int two = -12;
        int three = 56;
        if (one > two) {
            if (one >= three) {
                System.out.println(" Наибольшее число " + one);
            } else if (three > one) {
                System.out.println(" Наибольшее число " + three);
            } else if (two > one) {
                if (two >= three) {
                    System.out.println(" Наибольшее число " + two);
                } else if (three > two) {
                    System.out.println(" Наибольшее число " + three);
                } else {
                    if (one > three) {
                        System.out.println(" Наибольшее число " + one);
                    } else if (three > one) {
                        System.out.println(" Наибольшее число " + three);
                    } else {
                        System.out.println("Все числа равны");
                    }
                }


            }

        }
    }
}