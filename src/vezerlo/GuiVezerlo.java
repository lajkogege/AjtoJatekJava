
package vezerlo;

import modell.JatekModell;
import nezet.GuiNezet;

public class GuiVezerlo {
   private JatekModell modell;
   private GuiNezet nezet;
   
   public GuiVezerlo(JatekModell modell, GuiNezet nezet){
       this.modell = modell;
       this.nezet= nezet;
      this.nezet.setVezerlo (this);
       start();
   }
      public JatekModell getModell() {
        return modell;
      }
   
   private void start() {
       String statisztika = modell.kezdes(); // A modell kezdes() metódusának hívása
       nezet.setStatisztika(statisztika); // Frissítjük a GUI statisztikáját
       // Itt hívhatod a valasztas() metódust, ha szükséges
   }
}
