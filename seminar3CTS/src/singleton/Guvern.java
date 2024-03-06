package singleton;
public class Guvern {
    private int NrGuveratori;
    private String numePrimMininstru;
    private int nrLuni;
    private static Guvern instanta = null;

    public void setNrGuveratori(int nrGuveratori) {
        NrGuveratori = nrGuveratori;
    }

    public void setNumePrimMininstru(String numePrimMininstru) {
        this.numePrimMininstru = numePrimMininstru;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    private Guvern(int nrGuveratori, String numePrimMininstru, int nrLuni) {
        NrGuveratori = nrGuveratori;
        this.numePrimMininstru = numePrimMininstru;
        this.nrLuni = nrLuni;
    }
    public synchronized static Guvern getInstance(int nrGuveratori, String numePrimMininstru, int nrLuni){
        if(instanta == null) {
             instanta = new Guvern(nrGuveratori, numePrimMininstru, nrLuni);
         }
        return instanta;
}

    @Override
    public String toString() {
        return "Guvern{" +
                "NrGuveratori=" + NrGuveratori +
                ", numePrimMininstru='" + numePrimMininstru + '\'' +
                ", nrLuni=" + nrLuni +
                '}';
    }
}
