import java.util.LinkedList;

public class KeThua extends TrienKhai {
    
    public String idPerson;

    @Override
    public void NhapThongTin() {
        super.NhapThongTin();
    }

    @Override
    public void ThemThongTin() {
        super.ThemThongTin();
    }

    @Override
    public void SuaThongTin() {
        super.SuaThongTin();
    }

    @Override
    public void XoaThongTin() {
        super.XoaThongTin(LinkedList<Person> linkedList);
    }

    @Override
    public void HienThi() {
        super.HienThi(LinkedList<Person> linkedList);
    }
}