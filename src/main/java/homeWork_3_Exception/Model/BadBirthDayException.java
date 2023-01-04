package homeWork_3_Exception.Model;

public class BadBirthDayException extends Exception {

    String inputString;

    public BadBirthDayException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Ошибка при вводе даты '" + inputString + "', требуемый формат 'дд.мм.гггг'.\n";
    }
}
