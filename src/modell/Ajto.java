
package modell;

public class Ajto {
    private String felirat;
    private boolean kincs;
    private int index;
    
    public Ajto(String felirat, int index){
        this(felirat, index, false);
    }
    
    public Ajto(String felirat,int index, boolean kincs){
        this.felirat=felirat;
        this.index=index;
        this.kincs=kincs;
    }

    public String getFelirat() {
        return felirat;
    }
    
    public int getIndex() {
        return index;
    }

    public void setFelirat(String felirat) {
        this.felirat = felirat;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

}


