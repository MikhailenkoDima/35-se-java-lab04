package pkg35.java.lab04;





import java.io.Serializable;

/**
 *
 * @author Win7
 */
public class SerializableClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String MassTela;
    private String SkorostTela;//transient поле используется для исключения обькта, который не должен быть сохранён

    public SerializableClass(String MassTela, String SkorostTela) {
        this.MassTela = MassTela;
        this.SkorostTela = SkorostTela;
    }

    public String getMassTela() {
        return MassTela;
    }

    public void getMassTela(String MassTela) {
        this.MassTela = MassTela;
    }

    public String getSkorostTela() {
        return SkorostTela;
    }

    public void getSkorostTela(String SkorostTela) {
        this.SkorostTela = SkorostTela;
    }

    @Override
    public String toString() {
        return  "|     "+(MassTela)+"     |" +"       "+ (SkorostTela)+"      |";
    }
}
