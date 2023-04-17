public class SinhVien {
    private int mssv;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public SinhVien() {
    }

    public SinhVien(int mssv, String hoTen, String diaChi, String soDienThoai) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv=" + mssv +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
    public void showInfo() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", mssv, hoTen, diaChi, soDienThoai);
    }
}
