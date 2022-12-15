public class Main {
    public static void main(String[] args) {
        int clientOS = 1; //0 = операционная система IOS, 1 = ОС Android
        int year = 2018; //Год выпуска
                if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
            else if (clientOS == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS");
            } else if (clientOS == 1 && year >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && year < 2015){
            System.out.println("Установите облегченную версию Android");
        }
            int year1 = 1600;
            if (year1 % 4 == 0 && year1 % 400 == 0){
                System.out.println("Год является високостным");
            } else {
                System.out.println("Год является обычным");
            }
            int deliveryDistance = 180;
            int daysNeed = 1 + (deliveryDistance + 19) / 40;
        System.out.println("Для доставки потребуется " + daysNeed + " дней");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 13:
                System.out.println("Нет такого месяца");
        }


            }

        }

