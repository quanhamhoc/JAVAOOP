import java.util.LinkedList;

interface Person {
    public String hoTen;
    public int tuoi;
    public LinkedList<String> thongtinKhac;

    public void NhapThongTin();
    public void ThemThongTin();
    public void SuaThongTin();
    public void XoaThongTin();
    public void HienThi();
    
}