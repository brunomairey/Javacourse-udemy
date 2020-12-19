public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(254566);
        timsPhone.powerOn();
        timsPhone.callPhone(254566);
        timsPhone.answer();
    }
}
