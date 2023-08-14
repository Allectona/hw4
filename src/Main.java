public class Main {
    public static void main(String[] args) {

        /* 1 задание */

        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
                    }

        /* 2 задание */

        int outsideTemperature = 1;
        if (outsideTemperature >=5) {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки!");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку!");
        }

        /* 3 задание */

        int carSpeed = 85;
        if (carSpeed <= 60) {
            System.out.println("Если скорость " + carSpeed + " ,то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + carSpeed + " ,то придется заплатить штраф!");
        }

        /* 4 задание */

        int Age = 65;
        if (Age < 2){
            System.out.println("Если возраст человека равен " + Age + " ,то ему пора спать.");
        } else if (Age >= 2 && Age<=6) {
            System.out.println("Если возраст человека равен " + Age + " ,то ему нужно ходить в детский сад.");
        } else if (Age >= 7 && Age < 18) {
            System.out.println("Если возраст человека равен " + Age + " ,то ему нужно ходить в школу.");
        } else if (Age >= 18 && Age < 24) {
            System.out.println("Если возраст человека равен " + Age + " ,то ему нужно ходить в университет.");
        } else if (Age >= 24 && Age <= 60) {
            System.out.println("Если возраст человека равен " + Age + " ,то ему нужно ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + Age + " ,то ему можно отдохнуть.");
        }

        /* 5 задание */

        int kidAge = 14;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + " ,то ему нельзя кататься на аттракционе.");
        } else if (kidAge >= 5 && kidAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + " ,то ему можно катататься на аттракционе только с сопровождением.");
        } else {
            System.out.println("Если возраст ребенка равен " + kidAge + " , то ему можно кататься на аттракционах без сопровождения.");
        }

        /* 6 задание */

        int passengerNumber = 103;
        if (passengerNumber <= 60) {
            System.out.println("В вагоне есть свободное сидячее место. Присаживайтесь и хорошей поездки.");
        }else if (passengerNumber > 60 && passengerNumber <= 102) {
            System.out.println("В вагоне есть свободное стоячее место. Проходите и хорошей поездки.");
        } else {
            System.out.println("К сожалению, вагон полностью забит. Ожидайте следующего поезда.");
        }

        /* 7 задание */

        int one = 1;
        int two = 4;
        int three = 6;

        if (one > two && one > three) {
            System.out.println("Первое число самое большое!");
        } else if (two > one && two>three) {
            System.out.println("Второе число самое большое!");
        } else {
            System.out.println("Третье число самое большое!");
        }

    }
}