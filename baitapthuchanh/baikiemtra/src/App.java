import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Person ps = new TrienKhai();
        LinkedList<Person> linkedListStudent = new LinkedList<>();
        ps.NhapThongTin();
        ps.SuaThongTin();
        ps.HienThi();
        ps.XoaThongTin();
    }
}