package model;

public class Karyawan {
    private String name;
    private String divisi;
    private double nilai_target;
    private double nilai_disiplin;
    private double nilai_inovasi;
    private double nilai_akhir;
    private String status;

    
    public Karyawan(String name, String divisi, double nilai_target, double nilai_disiplin, double nilai_inovasi) {
        this.name = name;
        this.divisi = divisi;
        this.nilai_target = nilai_target;
        this.nilai_disiplin = nilai_inovasi;
        this.nilai_inovasi = nilai_inovasi;
        calculateScoreAndStatus();
    }

    
  public Karyawan(String name, String divisi, double nilai_target, double nilai_disiplin, double nilai_inovasi, double nilai_akhir, String status) {
        this.name = name;
        this.divisi = divisi;
        this.nilai_target = nilai_target;
        this.nilai_disiplin = nilai_disiplin;
        this.nilai_inovasi = nilai_inovasi;
        this.nilai_akhir = nilai_akhir;
        this.status = status;
    }

    
    public void calculateScoreAndStatus() {
        this.nilai_akhir = ((this.nilai_target*50/100) + (this.nilai_disiplin*30/100) + (nilai_inovasi*20/100)) / 3.0;
        if (this.nilai_akhir >= 85.0) {
            this.status = "DITERIMA";
        } else {
            this.status = "TIDAK DITERIMA";
        }
    }

    // Encapsulation: Getter dan Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getdivisi() { return divisi; }
    public void setdivisi(String divisi) { this.divisi = divisi; }

    public double getnilai_target() { return nilai_target; }
    public void setnilai_target(double nilai_target) { this.nilai_target = nilai_target; }

    public double getnilai_disiplin() { return nilai_disiplin; }
    public void setnilai_disiplin(double nilai_disiplin) { this.nilai_disiplin = nilai_disiplin; }
    
    public double getnilai_inovasi() { return nilai_inovasi; }
    public void setnilai_inovasi(double nilai_inovasi) { this.nilai_inovasi = nilai_inovasi; }

    public double getScore() { return nilai_akhir; }
    public String getStatus() { return status; }
}