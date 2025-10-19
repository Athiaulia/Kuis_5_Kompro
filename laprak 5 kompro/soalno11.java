class Mahasiswa {
    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
}

public class soalno11 {
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Ardi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };

        for (Mahasiswa mhs : data) {
            System.out.println("Nama: " + mhs.getNama() + " - Nilai: " + mhs.getNilai());
        }

        Mahasiswa tertinggi = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i].getNilai() > tertinggi.getNilai()) {
                tertinggi = data[i];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " 
            + tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}

