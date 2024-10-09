package modell;

public class JatekModell {

    private Ajto[] ajtok;
    private int valasztas;

    public JatekModell() {
        valasztas = -1;
        ajtok = new Ajto[3];
        ajtok[0] = new Ajto("semmi",1, false);
        ajtok[1] = new Ajto("kincs",2, true);
        ajtok[2] = new Ajto("semmi", 3, false);
    }
    
    public String kezdes(){
        String s = "Válasz egy ajtót!";
        int i = 1;
        for (Ajto ajto:ajtok){
            String f = ajto.getFelirat();
            s+= "/n"+"A választásod:"+ajto.getIndex()+" ajtó";
        }
        return s;
    }
    
    public int getValasztas() {
        return valasztas;
    }
    
     public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }
     
      public String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        s = ajtok[valasztas].isKincs() ? s : "Sajnos nem talált!";
        return s;
    }        
}
