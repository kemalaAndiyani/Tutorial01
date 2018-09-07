
public class Dosen {
	  protected String nama;
	    protected String matkul;

	    public Dosen(String namaDepan, String namaBelakang) {
	        this.nama = namaDepan;
	        this.matkul = namaBelakang;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public String getMatkul() {
	        return matkul;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public void setMatkul(String matkul) {
	        this.matkul = matkul;
	    }
}
