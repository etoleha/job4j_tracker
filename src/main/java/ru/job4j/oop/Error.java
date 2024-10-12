package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 404;
        message = "Ошибка не найдена";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        Error unknownError = new Error(true, 1, "Неизвестная ошибка");
        Error knownError = new Error(false, 2, "Известная ошибка");

        defaultError.printInfo();
        unknownError.printInfo();
        knownError.printInfo();
    }
}
